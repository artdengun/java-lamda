package com.artdengun.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("firstname","Deni");
        map.put("middlename","gun");
        map.put("lastname","gunawan");


        // for loop

        for (var entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // bi anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });
        //lambda

        map.forEach((key, value) -> System.out.println(key + "" + value));
    }
}
