package com.artdengun.lambda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("deni");
        String name = null;
        sayHello(name);
    }

    public static  void sayHello(String name){

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("Teman");

        System.out.println("Hello " + name);

//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(value -> System.out.println("Hello " + value),
//                        () -> System.out.println("Hello")
//                        );

//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(value -> name.toUpperCase());
//        optionalNameUpper.ifPresent(value -> System.out.println("Hello" + value));

        // jika menggunakan check null
//        if(name != null){
//            String upperName = name.toUpperCase();
//            System.out.println("Hello" + upperName);
//        }
    }
}
