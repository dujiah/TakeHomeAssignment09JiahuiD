package com.example.du.takehomeassignment09_jiahuid;


public class Flower {
    private String name;
    private int number;
    private boolean isPoisonous;

    public Flower() {

    }

    public Flower(String name, int number, boolean isPistill) {
        this.name = name;
        this.number = number;
        this.isPoisonous = isPoisonous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void isPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

}
