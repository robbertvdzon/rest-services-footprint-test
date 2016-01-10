package com.vdzon.rest.tomee.spark;


import com.google.gson.Gson;
import spark.ResponseTransformer;

import static spark.Spark.get;

public class JsonUtil {
    public static String toJson(Object object) {
        return new Gson().toJson(object);
    }

    public static ResponseTransformer json() {
        return JsonUtil::toJson;
    }
}
