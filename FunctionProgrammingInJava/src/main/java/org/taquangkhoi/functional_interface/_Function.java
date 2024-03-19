package org.taquangkhoi.functional_interface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(2);
        System.out.println(increment);


        int increment2 = incrementByOneFunction.apply(2);
        System.out.println(increment2);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static int increment(int number) {
        return number + 1;
    }
}
