package com.spart.heat.metering.unit.web.views;

import com.spart.heat.metering.unit.constants.Messages;
import com.spart.heat.metering.unit.controller.model.User;
import com.spart.heat.metering.unit.service.UserRegisterService;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = RegistrationView.ROUTE)
@PageTitle("Registration")
public class RegistrationView extends VerticalLayout {
    static final String ROUTE = "registration";

    private UserRegisterService userRegisterService;

    private TextField loginTxt = new TextField("Введите логин");
    private PasswordField passwordTxt = new PasswordField("Введите пароль");
    private PasswordField confirmPasswordTxt = new PasswordField("Подтвердите пароль");
    private TextField emailTxt = new TextField("Введите E-mail");

    private Button registrationBtn = new Button("Зарегистрироваться",this::addUser);

    @Autowired
    public RegistrationView(UserRegisterService userRegisterService){
        this.userRegisterService = userRegisterService;

        setComponentWidth();

              add(loginTxt,
                    passwordTxt,
                    confirmPasswordTxt,
                    emailTxt,
                    registrationBtn);

        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
    }

    private void setComponentWidth(){
        loginTxt.setWidth("20%");
        passwordTxt.setWidth("20%");
        confirmPasswordTxt.setWidth("20%");
        emailTxt.setWidth("20%");
        registrationBtn.setWidth("20%");

        loginTxt.setMinWidth("150px");
        passwordTxt.setMinWidth("150px");
        confirmPasswordTxt.setMinWidth("150px");
        emailTxt.setMinWidth("150px");
        registrationBtn.setMinWidth("150px");
    }

    private void addUser(ClickEvent event){
        User user = createUser();
        if (user==null) {
        }
        else{
            try {
              String response = userRegisterService.register(user);
              sendNotification(response);
              registrationBtn.getUI().ifPresent(ui -> ui.navigate("login"));
            }
            catch (Exception e){
                sendNotification(Messages.FAIL.getMessage());
            }

        }
    }

    private User createUser(){
        String login = loginTxt.getValue();
        String password = passwordTxt.getValue();
        String confirmPassword = confirmPasswordTxt.getValue();
        String email = emailTxt.getValue();

        if (login.equals("") ||
            password.equals("") ||
            confirmPassword.equals("") ||
            email.equals("")){
                sendNotification(Messages.FILL_ALL_FIELDS.getMessage());
        }
        else
            if (password.equals(confirmPassword))
                return (new User(login,password,email));
        else{
                sendNotification(Messages.PASSWORD_CONFIRMATION_FAILED.getMessage());
        }
        return null;
    }

    private void sendNotification(String message) {
       Notification.show(message);
    }
}
