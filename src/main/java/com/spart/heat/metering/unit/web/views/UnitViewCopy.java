package com.spart.heat.metering.unit.web.views;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = UnitViewCopy.ROUTE)
@PageTitle("Unit")
public
class UnitViewCopy extends VerticalLayout {
    public static final String ROUTE = "unitinfo";
    private TextField noData = new TextField();

    public UnitViewCopy() {

        noData.setVisible(true);
        noData.setValue("Нет данных для отображения");
        noData.setReadOnly(true);
        noData.setWidthFull();
        noData.addThemeVariants(TextFieldVariant.LUMO_ALIGN_CENTER);
        add(noData);

    }

}