package com.artdengun.lambda.app;

import java.util.function.Predicate;

public class MethodReferenceObject {

    public  void run() {
        MethodReferenceNonStaticApp app = new MethodReferenceNonStaticApp();

        Predicate<String> predicate = app::isLowerCase;

        System.out.println("deni");
        System.out.println("gunawan");
    }

    public boolean isLowerCase(String value){
        for(var c: value.toCharArray()){
            if(!Character.isLowerCase(c)) return false;
        }
        return true;
    }
}
