//package com.spart.heat.metering.unit.web.views;
//
//import com.vaadin.flow.component.ClickEvent;
//import com.vaadin.flow.component.button.Button;
//import com.vaadin.flow.component.notification.Notification;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.component.textfield.PasswordField;
//import com.vaadin.flow.component.textfield.TextField;
//import com.vaadin.flow.router.PageTitle;
//import com.vaadin.flow.router.Route;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import ru.spart.heat.metering.unit.web.constatnts.Messages;
//import ru.spart.heat.metering.unit.web.model.User;
//import ru.spart.heat.metering.unit.web.service.UserService;
//
//
//@Route(value = RegistrationView.ROUTE)
//@PageTitle("Registration")
//public class RegistrationView extends VerticalLayout {
//    static final String ROUTE = "registration";
//
//    private UserService userService;
//
//    private TextField loginTxt = new TextField("Введите логин");
//    private PasswordField passwordTxt = new PasswordField("Введите пароль");
//    private PasswordField confirmPasswordTxt = new PasswordField("Подтвердите пароль");
//    private TextField emailTxt = new TextField("Введите E-mail");
//
//    private Button registrationBtn = new Button("Зарегистрироваться",this::addUser);
//
//    @Autowired
//    public RegistrationView(UserService userService){
//        this.userService = userService;
//
//        setComponentWidth();
//
//              add(loginTxt,
//                    passwordTxt,
//                    confirmPasswordTxt,
//                    emailTxt,
//                    registrationBtn);
//
//        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
//    }
//
//    private void setComponentWidth(){
//        loginTxt.setWidth("20%");
//        passwordTxt.setWidth("20%");
//        confirmPasswordTxt.setWidth("20%");
//        emailTxt.setWidth("20%");
//        registrationBtn.setWidth("20%");
//
//        loginTxt.setMinWidth("150px");
//        passwordTxt.setMinWidth("150px");
//        confirmPasswordTxt.setMinWidth("150px");
//        emailTxt.setMinWidth("150px");
//        registrationBtn.setMinWidth("150px");
//    }
//
//    private void addUser(ClickEvent event){
//        User user = createUser();
//        ResponseEntity<String> responseEntity = null;
//        if (user==null) {
//        }
//        else{
//            HttpStatus httpStatus = null;
//            try {
//                 responseEntity = userService.addUser(user);
//            }
//            catch (Exception e){
//                sendNotification(HttpStatus.BAD_REQUEST.toString());
//            }
//            if (responseEntity.getStatusCode().equals(HttpStatus.OK)) {
//               sendNotification(responseEntity.getBody());
//               registrationBtn.getUI().ifPresent(ui -> ui.navigate("login"));
//            }
//            else
//                sendNotification(responseEntity.getStatusCode().toString());
//        }
//    }
//
//    private User createUser(){
//        String login = loginTxt.getValue();
//        String password = passwordTxt.getValue();
//        String confirmPassword = confirmPasswordTxt.getValue();
//        String email = emailTxt.getValue();
//
//        if (login.equals("") ||
//            password.equals("") ||
//            confirmPassword.equals("") ||
//            email.equals("")){
//                sendNotification(Messages.FILL_ALL_FIELDS.getMessage());
//        }
//        else
//            if (password.equals(confirmPassword))
//                return (new User(login,password,email));
//        else{
//                sendNotification(Messages.PASSWORD_CONFIRMATION_FAILED.getMessage());
//        }
//        return null;
//    }
//
//    private void sendNotification(String message) {
//       Notification.show(message);
//    }
//}
