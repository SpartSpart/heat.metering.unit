package com.spart.heat.metering.unit.web.views;


import com.spart.heat.metering.unit.controller.model.Unit;
import com.spart.heat.metering.unit.controller.model.UnitInfo;
import com.spart.heat.metering.unit.service.UnitInfoDayService;
import com.spart.heat.metering.unit.service.UnitInfoHourService;
import com.spart.heat.metering.unit.service.UnitService;
import com.spart.heat.metering.unit.service.UserDetailsServiceImpl;
import com.spart.heat.metering.unit.web.views.menu.Menu;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


//import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Route(value = UnitView.ROUTE)
@PageTitle("Unit")
public class UnitView extends VerticalLayout {
    public static final String ROUTE = "unitinfo";
    private static final String DAY = "День";
    private static final String HOUR = "Час";

    private UnitInfoDayService unitInfoDayService;
    private UnitInfoHourService unitInfoHourService;
    private UnitService unitService;
    private UserDetailsServiceImpl userDetailsServiceImpl;
  //  private UserService userService;

    private Menu menu;

    private TextField noData = new TextField();

    private DatePicker dateFrom = new DatePicker();
    private DatePicker dateTo = new DatePicker();

    private ComboBox<Unit> unitComboBox = new ComboBox<>();

    private Grid<Unit> unitGrid = new Grid<>(Unit.class);
    private Grid<UnitInfo> unitInfoGrid = new Grid<>(UnitInfo.class);

    private TextField teplovichislitel = new TextField("");

    private RadioButtonGroup <String> radioGroup = new RadioButtonGroup<>();

    private TextField rowCount = new TextField("");

    private List<UnitInfo> unitInfoList = new ArrayList<>();

    private List<Unit> unitList = new ArrayList<>();

    private int selectedUnitNumber = 0;



    @Autowired
    public UnitView(UnitService unitService,
                    UnitInfoDayService unitInfoDayService,
                    UnitInfoHourService unitInfoHourService,
                    UserDetailsServiceImpl userDetailsServiceImpl){

        this.unitService = unitService;
        this.unitInfoDayService = unitInfoDayService;
        this.unitInfoHourService = unitInfoHourService;
        this.userDetailsServiceImpl = userDetailsServiceImpl;
        //this.userService = userService;

        menu = new Menu(userDetailsServiceImpl);

        setSizeFull();

        unitInfoGrid.setVisible(false);

        noData.setVisible(true);
        noData.setValue("Нет данных для отображения");
        noData.setReadOnly(true);
        noData.setWidthFull();
        noData.addThemeVariants(TextFieldVariant.LUMO_ALIGN_CENTER);

        add(menu);
        add(comboLayout());
        add(filterLayout());
        add(unitInfoGrid);
        add(noData);


        setUnitInfoGridSettings();

        setUnitComboBoxSettings();

        setRadioGroupSettings();
    }


    private HorizontalLayout comboLayout(){
        HorizontalLayout comboLayout = new HorizontalLayout();

        teplovichislitel.setPlaceholder("Тепловычислитель");
        teplovichislitel.setReadOnly(true);

        comboLayout.add(unitComboBox);
        comboLayout.add(teplovichislitel);

        return comboLayout;
    }

    private HorizontalLayout filterLayout(){
        HorizontalLayout filterLayout = new HorizontalLayout();

        filterLayout.setWidthFull();

        VerticalLayout rowCountLayout = new VerticalLayout();
        rowCountLayout.getStyle().set("padding-top", "0px");
        rowCountLayout.getStyle().set("padding-bottom", "0px");
        rowCountLayout.getStyle().set("padding-left", "0px");
        rowCountLayout.getStyle().set("padding-right", "0px");

        rowCount.setReadOnly(true);
        rowCountLayout.add(rowCount);
        rowCountLayout.setHorizontalComponentAlignment(Alignment.END,rowCount);

        filterLayout.add(dateFrom,dateTo, radioGroup, rowCountLayout);

        setDatePickerSettings();

        return filterLayout;
    }

    private void setRadioGroupSettings(){
        radioGroup.setItems(DAY,HOUR);

        radioGroup.setValue(DAY);

        radioGroup.getStyle().set("display","contents");
        UI.getCurrent().getPage().executeJs("document.querySelectorAll(\"vaadin-radio-button\")[0].style.paddingLeft = '16px'");

        radioGroup.addValueChangeListener(radioButtonGroupStringComponentValueChangeEvent -> {
           buildUnitInfoGrid();

        });
    }

    private void setDatePickerSettings() {

        DatePicker.DatePickerI18n datePickerRussian = new DatePicker.DatePickerI18n();

        datePickerRussian.setWeek("Неделя");
        datePickerRussian.setCalendar("Календарь");
        datePickerRussian.setClear("Стереть");
        datePickerRussian.setToday("Сегодня");
        datePickerRussian.setCancel("Отмена");
        datePickerRussian.setWeekdays(Arrays.asList("Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"));
        datePickerRussian.setWeekdaysShort(Arrays.asList("Вс", "Пн", "Вт", "Ср", "Чт", "Пт", "Сб"));
        datePickerRussian.setMonthNames(Arrays.asList("Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"));

        dateFrom.setI18n(datePickerRussian);
        dateTo.setI18n(datePickerRussian);

        dateFrom.setPlaceholder("Дата с");
        dateTo.setPlaceholder("Дата по");

        dateFrom.setLocale(Locale.CANADA);
        dateTo.setLocale(Locale.CANADA);

        dateFrom.setClearButtonVisible(true);
        dateTo.setClearButtonVisible(true);

        dateTo.setRequired(true);

        dateFrom.addValueChangeListener(datePickerLocalDateComponentValueChangeEvent -> {
            buildUnitInfoGrid();

                });
        dateTo.addValueChangeListener(datePickerLocalDateComponentValueChangeEvent -> {
            buildUnitInfoGrid();
        });
    }


    private int dateFilter(LocalDate dFrom, LocalDate dTo){
        assert unitInfoList == null;
        List<UnitInfo> allUnitInfoList = unitInfoList;
        List<UnitInfo> filteredUnitInfoList = new ArrayList<>();

        if ((dFrom == null) && (dTo == null)){
            unitInfoGrid.setItems(allUnitInfoList);
            rowCount.setValue("Всего строк: " + allUnitInfoList.size());
            return allUnitInfoList.size();
        }

        if ((dFrom == null) && !(dTo == null)){
            for (UnitInfo unitInfo : allUnitInfoList) {
                LocalDate unitDate = getFormatedDate(unitInfo.getAr_date()).toLocalDate();
                if((unitDate.isBefore(dTo)
                        || (unitDate.isEqual(dTo))))
                    filteredUnitInfoList.add(unitInfo);
            }
            unitInfoGrid.setItems(filteredUnitInfoList);
            rowCount.setValue("Всего строк: " + filteredUnitInfoList.size());
            return filteredUnitInfoList.size();
        }

        if (!(dFrom == null) && (dTo == null)){
            for (UnitInfo unitInfo : allUnitInfoList) {
                LocalDate unitDate = getFormatedDate(unitInfo.getAr_date()).toLocalDate();
                if((unitDate.isAfter(dFrom)
                        || (unitDate.isEqual(dFrom))))
                    filteredUnitInfoList.add(unitInfo);
            }
            unitInfoGrid.setItems(filteredUnitInfoList);
            rowCount.setValue("Всего строк: " + filteredUnitInfoList.size());
            return filteredUnitInfoList.size();
        }

        if ((dFrom.isAfter(dTo))){
            unitInfoGrid.setItems(filteredUnitInfoList);
            rowCount.setValue("Всего строк: " + filteredUnitInfoList.size());
            return filteredUnitInfoList.size();
        }

        if ((dFrom.isBefore(dTo)||dFrom.isEqual(dTo))&& selectedUnitNumber > 0) {
            for (UnitInfo unitInfo : allUnitInfoList) {
                LocalDate unitDate = getFormatedDate(unitInfo.getAr_date()).toLocalDate();
                if((unitDate.isAfter(dFrom)
                        |unitDate.isEqual(dFrom))
                        && (unitDate.isBefore(dTo)
                        | (unitDate.isEqual(dTo))))
                    filteredUnitInfoList.add(unitInfo);
            }
            unitInfoGrid.setItems(filteredUnitInfoList);
            rowCount.setValue("Всего строк: " + filteredUnitInfoList.size());
        }
        return filteredUnitInfoList.size();
    }

    private LocalDateTime getFormatedDate(Date date) {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        LocalDateTime localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        return localDate;//format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));

    }


    private void setUnitComboBoxSettings(){

        unitList = getAllUnitsByUserId(Menu.curentUser.getId());

        unitComboBox.setPlaceholder("Выберете объект");

        unitComboBox.setMinWidth("400px");

        unitComboBox.setItems(unitList);

        unitComboBox.addValueChangeListener(event -> {
            selectedUnitNumber =event.getValue().getUnitNumber();

            teplovichislitel.setValue(event.getValue().getTeplovichislitel());
            buildUnitInfoGrid();

    });

    }

    private void buildUnitInfoGrid() {
        if (selectedUnitNumber != 0) {

            switch (radioGroup.getValue()){
                case DAY :{
                    unitInfoList = getUnitDayInfo(selectedUnitNumber);
                    break;
                }
                case HOUR:{
                    unitInfoList = getUnitHourInfo(selectedUnitNumber);
                    break;
                }
            }

            if(unitInfoList!=null) {
                unitInfoGrid.setItems(unitInfoList);

                hideNullColumnsUnitInfoGrid();

                unitInfoGrid.recalculateColumnWidths();

                int rowCount = dateFilter(dateFrom.getValue(), dateTo.getValue());

                hideGridIfNoData(rowCount);
            }
            else
                hideGridIfNoData(0);
          }

    }

    private void hideGridIfNoData(int rowCount){
        if (rowCount>0){
            unitInfoGrid.setVisible(true);
            noData.setVisible(false);
        }
        else{
            unitInfoGrid.setVisible(false);
            noData.setVisible(true);
        }

    }


    private void setUnitInfoGridSettings() {
        unitInfoGrid.getColumns().forEach(column -> column.setAutoWidth(true));
        unitInfoGrid.getColumnByKey("adr_n").setVisible(false);
        unitInfoGrid.getColumnByKey("ar_date").setFrozen(true);
        unitInfoGrid.getColumnByKey("ar_date").setResizable(true);

        unitInfoGrid.setColumnOrder(
                unitInfoGrid.getColumnByKey("adr_n"),
                unitInfoGrid.getColumnByKey("ar_date"),
                unitInfoGrid.getColumnByKey("m1"),
                unitInfoGrid.getColumnByKey("m2"),
                unitInfoGrid.getColumnByKey("m3"),
                unitInfoGrid.getColumnByKey("dm1"),
                unitInfoGrid.getColumnByKey("dm12"),
                unitInfoGrid.getColumnByKey("t1"),
                unitInfoGrid.getColumnByKey("t2"),
                unitInfoGrid.getColumnByKey("p1"),
                unitInfoGrid.getColumnByKey("p2"),
                unitInfoGrid.getColumnByKey("w1"),
                unitInfoGrid.getColumnByKey("dq1"),
                unitInfoGrid.getColumnByKey("m1_tv1"),
                unitInfoGrid.getColumnByKey("m2_tv1"),
                unitInfoGrid.getColumnByKey("m3_tv1"),
                unitInfoGrid.getColumnByKey("t1_tv1"),
                unitInfoGrid.getColumnByKey("t2_tv1"),
                unitInfoGrid.getColumnByKey("t3_tv1"),
                unitInfoGrid.getColumnByKey("p1_tv1"),
                unitInfoGrid.getColumnByKey("p2_tv1"),
                unitInfoGrid.getColumnByKey("w1_tv1"),
                unitInfoGrid.getColumnByKey("w2_tv1"),
                unitInfoGrid.getColumnByKey("q_tv1"),
                unitInfoGrid.getColumnByKey("q0_tv1"),
                unitInfoGrid.getColumnByKey("q12_tv1"),
                unitInfoGrid.getColumnByKey("qg_tv1"),
                unitInfoGrid.getColumnByKey("m1_tv2"),
                unitInfoGrid.getColumnByKey("m2_tv2"),
                unitInfoGrid.getColumnByKey("m3_tv2"),
                unitInfoGrid.getColumnByKey("t1_tv2"),
                unitInfoGrid.getColumnByKey("t2_tv2"),
                unitInfoGrid.getColumnByKey("t3_tv2"),
                unitInfoGrid.getColumnByKey("p1_tv2"),
                unitInfoGrid.getColumnByKey("p2_tv2"),
                unitInfoGrid.getColumnByKey("w1_tv2"),
                unitInfoGrid.getColumnByKey("w2_tv2"),
                unitInfoGrid.getColumnByKey("q_tv2"),
                unitInfoGrid.getColumnByKey("q0_tv2"),
                unitInfoGrid.getColumnByKey("qg_tv2"));



    }

    private void hideNullColumnsUnitInfoGrid(){

        if(unitInfoList.isEmpty())
            unitInfoGrid.setVisible(false);
        else{
            UnitInfo firstUnit = unitInfoList.get(0);

            if (firstUnit.getM1_tv1() == null)
                unitInfoGrid.getColumnByKey("m1_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("m1_tv1").setVisible(true);

            if (firstUnit.getM2_tv1() == null)
                unitInfoGrid.getColumnByKey("m2_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("m2_tv1").setVisible(true);

            if (firstUnit.getM3_tv1() == null)
                unitInfoGrid.getColumnByKey("m3_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("m3_tv1").setVisible(true);

            if (firstUnit.getT1_tv1() == null)
                unitInfoGrid.getColumnByKey("t1_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("t1_tv1").setVisible(true);

            if (firstUnit.getT2_tv1() == null)
                unitInfoGrid.getColumnByKey("t2_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("t2_tv1").setVisible(true);

            if (firstUnit.getT3_tv1() == null)
                unitInfoGrid.getColumnByKey("t3_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("t3_tv1").setVisible(true);

            if (firstUnit.getQ_tv1() == null)
                unitInfoGrid.getColumnByKey("q_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("q_tv1").setVisible(true);

            if (firstUnit.getQ12_tv1() == null)
                unitInfoGrid.getColumnByKey("q12_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("q12_tv1").setVisible(true);

            if (firstUnit.getQ0_tv1() == null)
                unitInfoGrid.getColumnByKey("q0_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("q0_tv1").setVisible(true);

            if (firstUnit.getQg_tv1() == null)
                unitInfoGrid.getColumnByKey("qg_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("qg_tv1").setVisible(true);

            if (firstUnit.getW1_tv1() == null)
                unitInfoGrid.getColumnByKey("w1_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("w1_tv1").setVisible(true);

            if (firstUnit.getW2_tv1() == null)
                unitInfoGrid.getColumnByKey("w2_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("w2_tv1").setVisible(true);

            if (firstUnit.getP1_tv1() == null)
                unitInfoGrid.getColumnByKey("p1_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("p1_tv1").setVisible(true);

            if (firstUnit.getP2_tv1() == null)
                unitInfoGrid.getColumnByKey("p2_tv1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("p2_tv1").setVisible(true);

            if (firstUnit.getM1_tv2() == null)
                unitInfoGrid.getColumnByKey("m1_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("m1_tv2").setVisible(true);

            if (firstUnit.getM2_tv2() == null)
                unitInfoGrid.getColumnByKey("m2_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("m2_tv2").setVisible(true);

            if (firstUnit.getM3_tv2() == null)
                unitInfoGrid.getColumnByKey("m3_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("m3_tv2").setVisible(true);

            if (firstUnit.getT1_tv2() == null)
                unitInfoGrid.getColumnByKey("t1_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("t1_tv2").setVisible(true);

            if (firstUnit.getT2_tv2() == null)
                unitInfoGrid.getColumnByKey("t2_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("t2_tv2").setVisible(true);

            if (firstUnit.getT3_tv2() == null)
                unitInfoGrid.getColumnByKey("t3_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("t3_tv2").setVisible(true);

            if (firstUnit.getQ_tv2() == null)
                unitInfoGrid.getColumnByKey("q_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("q_tv2").setVisible(true);

            if (firstUnit.getQ0_tv2() == null)
                unitInfoGrid.getColumnByKey("q0_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("q0_tv2").setVisible(true);

            if (firstUnit.getW1_tv2() == null)
                unitInfoGrid.getColumnByKey("w1_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("w1_tv2").setVisible(true);

            if (firstUnit.getW2_tv2() == null)
                unitInfoGrid.getColumnByKey("w2_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("w2_tv2").setVisible(true);

            if (firstUnit.getQg_tv2() == null)
                unitInfoGrid.getColumnByKey("qg_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("qg_tv2").setVisible(true);

            if (firstUnit.getP1_tv2() == null)
                unitInfoGrid.getColumnByKey("p1_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("p1_tv2").setVisible(true);

            if (firstUnit.getP2_tv2() == null)
                unitInfoGrid.getColumnByKey("p2_tv2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("p2_tv2").setVisible(true);

            if (firstUnit.getM1() == null)
                unitInfoGrid.getColumnByKey("m1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("m1").setVisible(true);

            if (firstUnit.getM2() == null)
                unitInfoGrid.getColumnByKey("m2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("m2").setVisible(true);

            if (firstUnit.getM3() == null)
                unitInfoGrid.getColumnByKey("m3").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("m3").setVisible(true);

            if (firstUnit.getT1() == null)
                unitInfoGrid.getColumnByKey("t1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("t1").setVisible(true);

            if (firstUnit.getT2() == null)
                unitInfoGrid.getColumnByKey("t2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("t2").setVisible(true);

            if (firstUnit.getW1() == null)
                unitInfoGrid.getColumnByKey("w1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("w1").setVisible(true);

            if (firstUnit.getDm1() == null)
                unitInfoGrid.getColumnByKey("dm1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("dm1").setVisible(true);

            if (firstUnit.getDq1() == null)
                unitInfoGrid.getColumnByKey("dq1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("dq1").setVisible(true);

            if (firstUnit.getP1()== null)
                unitInfoGrid.getColumnByKey("p1").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("p1").setVisible(true);

            if (firstUnit.getP2()== null)
                unitInfoGrid.getColumnByKey("p2").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("p2").setVisible(true);

            if (firstUnit.getDm12() == null)
                unitInfoGrid.getColumnByKey("dm12").setVisible(false);
            else
                unitInfoGrid.getColumnByKey("dm12").setVisible(true);

        }

    }


    private List<Unit> getAllUnitsByUserId(int userId) {
        return unitService.getAllUnitsByUserId(userId);
    }

    private List<UnitInfo> getUnitDayInfo(int unitId){
        return unitInfoDayService.getUnitsInfoDay(unitId);
    }

    private List<UnitInfo> getUnitHourInfo(int unitId){
        return unitInfoHourService.getUnitsInfoHour(unitId);
    }


}
