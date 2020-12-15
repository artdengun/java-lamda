package com.artdengun.lambda.app;

import java.util.function.Function;

public class MethodParameter {
    public static void main(String[] args) {
        Function<String, String> function = String::toUpperCase;

        System.out.println(function.apply("Deni "));
        System.out.println(function.apply("gunawan "));
    }
}
