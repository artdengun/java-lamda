package com.artdengun.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Deni","GUnawan","Ahmad");

        // for loo
        for ( var value : list){
            System.out.println(value);
        }

        // for each anonymous

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // lambda
        list.forEach( value -> System.out.println(value));

        // lambda method refrence
        list.forEach(System.out::println);
    }
}
