package com.example.demo.Entity;

public class OrderHasResources {
    Animator animator;
    Order order;
    int amount;
    int price;

    public OrderHasResources() {
    }

    public Animator getAnimator() {
        return animator;
    }

    public void setAnimator(Animator animator) {
        this.animator = animator;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public OrderHasResources(Animator animator, Order order, int amount, int price) {
        this.animator = animator;
        this.order = order;
        this.amount = amount;
        this.price = price;
    }
}
