package com.softserve.edu09.pt;

public class HeavyBox {
    private String content;
    private int weight;

    public HeavyBox() {

    }

    public HeavyBox(String content, int weight) {
        this.content = content;
        this.weight = weight;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "content='" + content + '\'' +
                ", weight=" + weight +
                '}';
    }
}
