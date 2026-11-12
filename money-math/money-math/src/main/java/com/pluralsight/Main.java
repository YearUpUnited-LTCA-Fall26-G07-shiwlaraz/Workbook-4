
package com.pluralsight;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        float floatValue = 0.0f;
        double doubleValue = 0.0;
        BigDecimal bigDecimalValue = BigDecimal.ZERO;

        System.out.println("===== FIRST LOOP: ADD $0.10 TEN TIMES =====");

        for (int i = 1; i <= 10; i++) {

            floatValue += 0.10f;
            doubleValue += 0.10;
            bigDecimalValue = bigDecimalValue.add(
                    new BigDecimal("0.10")
            );

            System.out.println(
                    i + " | Float: " + floatValue
                            + " | Double: " + doubleValue
                            + " | BigDecimal: " + bigDecimalValue
            );
        }

        floatValue = 0.0f;
        doubleValue = 0.0;
        bigDecimalValue = BigDecimal.ZERO;

        System.out.println("\n===== SECOND LOOP: ADD $19.99 1000 TIMES =====");

        for (int i = 1; i <= 1000; i++) {

            floatValue += 19.99f;
            doubleValue += 19.99;
            bigDecimalValue = bigDecimalValue.add(
                    new BigDecimal("19.99")
            );
        }

        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("BigDecimal: " + bigDecimalValue);

        System.out.println("\n===== COMPARISON =====");

        System.out.println("Float equals Double: "
                + (floatValue == doubleValue));

        System.out.println("Double equals BigDecimal: "
                + (BigDecimal.valueOf(doubleValue)
                .compareTo(bigDecimalValue) == 0));

        System.out.println("Float equals BigDecimal: "
                + (new BigDecimal(Float.toString(floatValue))
                .compareTo(bigDecimalValue) == 0));


        BigDecimal floatDifference = new BigDecimal(
                Float.toString(floatValue)
        ).subtract(bigDecimalValue).abs();

        System.out.println("Float difference in cents: "
                + floatDifference.multiply(new BigDecimal("100")));

        System.out.println("\n===== BIGDECIMAL ADD TEST =====");

        BigDecimal amount = BigDecimal.ZERO;

        amount.add(new BigDecimal("0.10"));
        System.out.println("Without assignment: " + amount);

        amount = amount.add(new BigDecimal("0.10"));
        System.out.println("With assignment: " + amount);
    }
}
