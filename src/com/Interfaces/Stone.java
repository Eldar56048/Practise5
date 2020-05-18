package com.Interfaces;

public class Stone {
    private double weight, price;
    private int id;
    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
