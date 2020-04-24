//package com.spart.heat.metering.unit.web.views;
//
//import com.vaadin.flow.component.Text;
//import com.vaadin.flow.component.button.Button;
//import com.vaadin.flow.component.grid.Grid;
//import com.vaadin.flow.component.notification.Notification;
//import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.router.PageTitle;
//import com.vaadin.flow.router.Route;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import ru.spart.heat.metering.unit.web.constants.Messages;
//import ru.spart.heat.metering.unit.web.model.Unit;
//import ru.spart.heat.metering.unit.web.model.User;
//import ru.spart.heat.metering.unit.web.model.UserUnit;
//import ru.spart.heat.metering.unit.web.service.UnitService;
//import ru.spart.heat.metering.unit.web.service.UserService;
//import ru.spart.heat.metering.unit.web.ui.views.menu.Menu;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//
//@Route(value = AdminView.ROUTE)
//@PageTitle("Settings")
//public class AdminView extends VerticalLayout {
//    public static final String ROUTE = "settings";
//
//    private Text message = new Text("Доступ запрещен");
//
//    private UnitService unitService;
//    private UserService userService;
//
//    private Menu menu;
//
//    private Grid<User> userGrid = new Grid<>(User.class);
//    private Grid<Unit> unitGrid = new Grid<>(Unit.class);
//
//    private List<Unit> allUnits = new ArrayList<>();
//
//    private Button saveUserUnitsBtn = new Button("Сохранить");
//
//    private User selectedUser = null;
//
//
//    @Autowired
//    public AdminView(UnitService unitService, UserService userService){
//        this.unitService = unitService;
//        this.userService = userService;
//        menu = new Menu(userService);
//
//        if (Menu.curentUser.getPermission() == 0) {
//            add(menu);
//            add(message);
//        }
//        else {
//
//            setSizeFull();
//
//            HorizontalLayout gridLayout = new HorizontalLayout(userGrid, unitGrid);
//            gridLayout.setSizeFull();
//
//            saveUserUnitsBtn.setMinWidth("200px");
//            saveUserUnitsBtn.setEnabled(false);
//
//            HorizontalLayout btnLayout = new HorizontalLayout(saveUserUnitsBtn);
//            setHorizontalComponentAlignment(Alignment.END,btnLayout);
//            saveUserUnitsBtn.addClickListener(event -> {
//                HttpStatus httpStatus;
//                if (selectedUser!=null) {
//
//                    List<Unit> selectedUserUnits = convertSetToList(unitGrid.getSelectedItems());
//                    List<Unit> curentUserUnits = getAllUnitsByUserId(selectedUser.getId());
//
//                    List<Unit> copyCurentUserUnits = new ArrayList<>(curentUserUnits);
//
//                    boolean unitsToDelete = curentUserUnits.removeAll(selectedUserUnits);
//                    boolean unitsToAdd = selectedUserUnits.removeAll(copyCurentUserUnits);
//
//                    for (Unit unit : curentUserUnits){
//                        UserUnit userUnit = new UserUnit(selectedUser.getId(),unit.getUnitNumber());
//                        httpStatus = unitService.deleteUserUnit(userUnit);
//                        if (! httpStatus.equals(HttpStatus.OK)){
//                            sendNotification(httpStatus.toString());
//                            return;
//                        }
//
//                    }
//
//                    for (Unit unit : selectedUserUnits){
//                        UserUnit userUnit = new UserUnit(selectedUser.getId(),unit.getUnitNumber());
//                        httpStatus = unitService.addUserUnit(userUnit);
//                        if (! httpStatus.equals(HttpStatus.OK)){
//                            sendNotification(httpStatus.toString());
//                            return;
//                        }
//                    }
//                    sendNotification(Messages.SUCCESS.getMessage());
//                }
//            });
//
//            add(menu);
//            add(gridLayout);
//            add(btnLayout);
//
//
//            setUserGridSettings();
//            setUnitGridSettings();
//
//        }
//    }
//
//    private List<Unit> convertSetToList(Set<Unit> units){
//        List<Unit> listUnits = new ArrayList<>();
//        for(Iterator<Unit> it = units.iterator(); it.hasNext();)
//            listUnits.add(it.next());
//
//        return listUnits;
//    }
//
//    private void setUserGridSettings(){
//
//        userGrid.setItems(getAllUsers());
//        userGrid.recalculateColumnWidths();
//        userGrid.setWidth("30%");
//        userGrid.setHeightFull();
//        userGrid.getColumnByKey("id").setVisible(false);
//        userGrid.getColumnByKey("password").setVisible(false);
//        userGrid.getColumnByKey("permission").setVisible(false);
//
//        userGrid.getColumnByKey("login").setHeader("Логин");
//        userGrid.getColumnByKey("email").setHeader("E-mail");
//
//        userGrid.setColumnOrder(
//                userGrid.getColumnByKey("id"),
//                userGrid.getColumnByKey("login"),
//                userGrid.getColumnByKey("password"),
//                userGrid.getColumnByKey("email"),
//                userGrid.getColumnByKey("permission"));
//
//
//        userGrid.addItemDoubleClickListener(
//                itemClickevent -> {
//                });
//
//        userGrid.addItemClickListener(
//                itemClickevent -> {
//                    if(selectedUser!=null) {
//                        User user = itemClickevent.getItem();
//                        List<Unit> userUnits = getAllUnitsByUserId(user.getId());
//                        unitGrid.deselectAll();
//                        for (int i = 0; i < allUnits.size(); i++)
//                            for (Unit unit : userUnits) {
//                                if (allUnits.get(i).equals(unit)) {
//                                    allUnits.subList(i, i + 1).forEach(unitGrid::select);
//                                    break;
//                                }
//                            }
//                    }
//                });
//
//        userGrid.addSelectionListener(selectionEvent -> {
//           if (selectionEvent.getAllSelectedItems().size()==0) {
//               unitGrid.deselectAll();
//               saveUserUnitsBtn.setEnabled(false);
//               selectedUser = null;
//           }
//           else {
//               selectedUser = selectionEvent.getAllSelectedItems().iterator().next();
//               saveUserUnitsBtn.setEnabled(true);
//           }
//        });
//}
//
//    private void setUnitGridSettings(){
//
//
//        allUnits = getAllUnits();
//        unitGrid.setItems(allUnits);
//        unitGrid.recalculateColumnWidths();
//        unitGrid.setWidth("70%");
//        unitGrid.setHeightFull();
//
//        unitGrid.getColumns().forEach(column -> column.setAutoWidth(true));
//
//        unitGrid.setColumnOrder(
//                unitGrid.getColumnByKey("unitNumber"),
//                unitGrid.getColumnByKey("organization"),
//                unitGrid.getColumnByKey("adress"),
//                unitGrid.getColumnByKey("teplovichislitel"));
//
//                unitGrid.getColumnByKey("unitNumber").setResizable(true);
//                unitGrid.getColumnByKey("adress").setResizable(true);
//                unitGrid.getColumnByKey("teplovichislitel").setResizable(true);
//
//                unitGrid.getColumnByKey("organization").setVisible(false);
//
//                unitGrid.getColumnByKey("unitNumber").setHeader("№ объекта");
//                unitGrid.getColumnByKey("organization").setHeader("Организация");
//                unitGrid.getColumnByKey("adress").setHeader("Адрес");
//                unitGrid.getColumnByKey("teplovichislitel").setHeader("Тепловычислитель");
//
//
//
//        unitGrid.setSelectionMode(Grid.SelectionMode.MULTI);
//    }
//
//
//    private List<Unit> getAllUnits() {
//        return unitService.getAllUnits();
//    }
//
//    private List<Unit> getAllUnitsByUserId(int userId) {
//        return unitService.getAllUnitsByUserId(userId);
//    }
//
//    private List<User> getAllUsers(){
//        return userService.getAllUsers();
//    }
//
//    private void sendNotification(String message) {
//        Notification.show(message);
//    }
//
//}
