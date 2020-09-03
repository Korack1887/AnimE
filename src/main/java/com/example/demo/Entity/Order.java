package com.example.demo.Entity;

public class Order {
    int id;
    User user;
    Realisation realisation;
    Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Realisation getRealisation() {
        return realisation;
    }

    public void setRealisation(Realisation realisation) {
        this.realisation = realisation;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Order() {
    }

    public Order(int id, User user, Realisation realisation, Status status) {
        this.id = id;
        this.user = user;
        this.realisation = realisation;
        this.status = status;
    }
}
