package com.artdengun.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Deni Gunawan";
        supplier.get();

        System.out.println(supplier.get());
    }
}
