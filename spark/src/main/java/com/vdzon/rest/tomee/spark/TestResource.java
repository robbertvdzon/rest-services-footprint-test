package com.vdzon.rest.tomee.spark;

import spark.Spark;

public class TestResource {
    public TestResource() {
        Spark.get("/customer/:id", (req, res) -> {
            String id = req.params(":id");
            Customer robbert = new Customer("Robbert-spring-boot", Long.parseLong(id));
            return robbert;
        }, JsonUtil.json());
    }
}
