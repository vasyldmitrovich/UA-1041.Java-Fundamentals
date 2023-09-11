package com.softserve.edu09.pt;

public class HeavyBox {
    private int weight;
    private String field;

    public HeavyBox() {
    }

    public HeavyBox(int weight, String field) {
        this.weight = weight;
        this.field = field;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", field='" + field + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
