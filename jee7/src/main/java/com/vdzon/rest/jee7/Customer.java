package com.vdzon.rest.jee7;

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
