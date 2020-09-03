package com.example.demo.Entity;

public class Realisation {
    int id;
    String address;
    String contactName;
    int contactPhone;
    String contactMail;
    User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(int contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Realisation() {
    }

    public Realisation(int id, String address, String contactName, int contactPhone, String contactMail, User user) {
        this.id = id;
        this.address = address;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactMail = contactMail;
        this.user = user;
    }
}
