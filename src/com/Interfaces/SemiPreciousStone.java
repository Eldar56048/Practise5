package com.Interfaces;

public class SemiPreciousStone extends Stone {
    private String name;
    private double carat,sum;

    public SemiPreciousStone(int id,String name,double weight,double price){
        setId(id);
        setName(name);
        setWeight(weight);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getId() {
        return super.getId();
    }
    public double calculate(double carat){
        this.carat=carat;
        calculate();
        return sum;
    }
    private void calculate(){
        sum= (carat*0.0002*getPrice());
    }
    @Override
    public String toString() {
        return "Id of the stone"+super.getId()+" "+"Name of the stone: "+ name+" "+" Price per kg "+super.getPrice()+" carats left: "+super.getWeight();
    }
}
