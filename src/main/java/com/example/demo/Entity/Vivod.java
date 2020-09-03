package com.example.demo.Entity;

public class Vivod {
    String name;
    int price;

    public Vivod() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Vivod(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
