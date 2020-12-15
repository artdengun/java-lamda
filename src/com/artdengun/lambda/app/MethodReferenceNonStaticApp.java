package com.artdengun.lambda.app;

import java.util.function.Predicate;

public class MethodReferenceNonStaticApp {
    public void run() {
//        Predicate<String> predicate = value -> isLowerCase(value);
        Predicate<String> predicate = this::isLowerCase;

        System.out.println("deni");
        System.out.println("gunawan");
    }

    public boolean isLowerCase(String value){
        for(char c : value.toCharArray()){
            if(!Character.isLowerCase(c)) return false;
        }
        return true;
    }
}
