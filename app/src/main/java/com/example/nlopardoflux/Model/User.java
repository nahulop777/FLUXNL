package com.example.nlopardoflux.Model;

public class User {

    private String gender;
    private Object name;
    private Object location;
    private String email;
    private Object login;
    private Object dob;
    private Object registered;
    private String phone;
    private String cell;
    private Object id;
    private Object picture;
    private String nat;

    public User() {
    }

    public User(String gender, Object name, Object location, String email, Object login, Object dob, Object registered, String phone, String cell, Object id, Object picture, String nat) {
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.login = login;
        this.dob = dob;
        this.registered = registered;
        this.phone = phone;
        this.cell = cell;
        this.id = id;
        this.picture = picture;
        this.nat = nat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getLogin() {
        return login;
    }

    public void setLogin(Object login) {
        this.login = login;
    }

    public Object getDob() {
        return dob;
    }

    public void setDob(Object dob) {
        this.dob = dob;
    }

    public Object getRegistered() {
        return registered;
    }

    public void setRegistered(Object registered) {
        this.registered = registered;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getPicture() {
        return picture;
    }

    public void setPicture(Object picture) {
        this.picture = picture;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }
}
