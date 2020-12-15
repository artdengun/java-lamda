package com.artdengun.lambda.app;

import com.artdengun.lambda.SimpleActions;

public class SimpleActionApp {
    public static void main(String[] args) {
//        // ini adalah anonymous class
//        SimpleActions simpleActions1 = new SimpleActions() {
//            @Override
//            public String Action(String name) {
//                return "deni";
//            }
//        };
//
//        System.out.println(simpleActions1.Action("deni"));
//
//        // ini adalah lambda versi sederhana dari anonymous
//        SimpleActions simpleActions2 = (String name) -> {
//            return "Deni Gunawan";
//        };
//
//
//
//        System.out.println(simpleActions2.Action("deni"));
//
//        SimpleActions simpleActions = (String value) -> {
//            return "Hello " + value;
//        };
//
//        SimpleActions simpleActions1 = (name) -> {
//                return "hello" + name;
//        };

        SimpleActions simpleActions1 = (String name) -> "Hello " + name;
        SimpleActions simpleActions2 = (name) -> "Hello " + name;
        SimpleActions simpleActions3 = name -> "Hello" + name;
    }

}
