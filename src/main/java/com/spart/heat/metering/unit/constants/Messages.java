package com.spart.heat.metering.unit.constants;

public enum Messages {


    SUCCESS("Успешно!"),
    FAIL("Ошибка"),
    USER_ALREADY_EXISTS ("Пользователь с таким именем уже зарегистрирован"),
    FILL_ALL_FIELDS("Заполните все поля"),
    PASSWORD_CONFIRMATION_FAILED("Не корректное подтверждение пароля"),

    WRONG_DATE_FORMAT("Wrong Date Format");

      private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message.toString();
    }
}
