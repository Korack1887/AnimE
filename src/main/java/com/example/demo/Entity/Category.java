package com.example.demo.Entity;

public class Category {
    String name;
    int id;
    Category parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Category() {
    }

    public Category(String name, int id, Category parent) {
        this.name = name;
        this.id = id;
        this.parent = parent;
    }
}


