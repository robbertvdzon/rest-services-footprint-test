package com.vdzon.rest.tomee.spark;

public class Customer {

    private String name;
    private long id;

    public Customer(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
