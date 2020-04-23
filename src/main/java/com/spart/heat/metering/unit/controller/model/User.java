package com.spart.heat.metering.unit.controller.model;

public class User {
    private int id;
    private String login;
    private String password;
    private String email;
    private int permission;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getLogin() {return login;}

    public void setLogin(String login) {this.login = login;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }
}