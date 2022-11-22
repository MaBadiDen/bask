package com.example.bask.sheet;

public class Sheet {
    private final String name;
    private final Integer price;
    private final int id;

    public Sheet(String name, Integer price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
