package org.taquangkhoi.functional_interface;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static java.util.function.Supplier<String> getDBConnectionUrlSupplier =
            () -> "jdbc://localhost:5432/users";
}
