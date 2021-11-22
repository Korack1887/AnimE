package com.example.demo.Entity;

public class Animator {
    int id;
    String name;
    String description;
    Costume costume;
    int price;

    public int getCostume_id() {
        return costume.getId();
    }

    public void setCostume_id(int costume_id) {
        costume.setId(costume_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Costume getCostume() {
        return costume;
    }

    public void setCostume(Costume costume) {
        this.costume = costume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Animator() {
    }

    public Animator(int id, String name, String description, Costume costume, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.costume = costume;
        this.price = price;
    }
}
