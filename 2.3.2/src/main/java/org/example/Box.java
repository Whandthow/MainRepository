package org.example;

public class Box {
    private String name;
    public Box(String name) {
        this.name = name;
    }
    public Box(){}
    @Override
    public String toString() {
        return name;
    }
}
