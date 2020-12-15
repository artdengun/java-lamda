package com.artdengun.lambda.app;

import com.artdengun.lambda.Util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // Predicate Mereturn Boolean di Akhir
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("deni"));
        System.out.println(predicateIsLowerCase.test("Deni"));
    }
}
