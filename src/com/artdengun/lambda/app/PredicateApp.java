package com.artdengun.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicateApp = s -> s.isBlank();

        System.out.println(predicateApp.test(""));
        System.out.println(predicateApp.test("deni"));
    }
}
