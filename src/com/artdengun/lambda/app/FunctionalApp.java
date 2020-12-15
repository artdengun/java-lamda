package com.artdengun.lambda.app;

import java.util.function.Function;

public class FunctionalApp {
    public static void main(String[] args) {
        Function<String, Integer> functionLength = s -> s.length();
        System.out.println(functionLength.apply("Deni"));
    }
}
