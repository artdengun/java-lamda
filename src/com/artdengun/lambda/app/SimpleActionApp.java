package com.artdengun.lambda.app;

import com.artdengun.lambda.SimpleActions;

public class SimpleActionApp {
    public static void main(String[] args) {
        // ini adalah anonymous class
        SimpleActions simpleActions1 = new SimpleActions() {
            @Override
            public String Action() {
                return "deni";
            }
        };

        System.out.println(simpleActions1.Action());

        // ini adalah lambda versi sederhana dari anonymous
        SimpleActions simpleActions2 = () -> {
            return "Deni Gunawan";
        };
        System.out.println(simpleActions2.Action());
    }
}
