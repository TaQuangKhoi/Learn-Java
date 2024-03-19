package org.taquangkhoi.functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Function
        int increment = increment(2);
//        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(2);
//        System.out.println(increment2);

        int multiplyBy10 = multiplyBy10Function.apply(2);
//        System.out.println(multiplyBy10);

        // Function takes 1 argument and produces 1 result
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
//        System.out.println(addBy1AndThenMultiplyBy10.apply(2));

        // BiFunction takes 2 arguments and produces 1 result
        System.out.println(integerIntegerIntegerBiFunction.apply(4, 100));
        System.out.println(incrementAndMultiply(4, 100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> integerIntegerIntegerBiFunction =
            (numberToIncrementBy, numToMultiply) -> (numberToIncrementBy + 1) * numToMultiply;

    static int incrementAndMultiply(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }
}
