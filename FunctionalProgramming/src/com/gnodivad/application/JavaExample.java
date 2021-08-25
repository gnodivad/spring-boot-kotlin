package com.gnodivad.application;

import java.util.Locale;
import java.util.function.Function;

public class JavaExample {
    public static Function<String, String> toSentenceCase = x -> x.substring(0, 1).toUpperCase(Locale.ROOT) + x.substring(1);

    public static String applySomeFunctionToString(String inputString, Function<String, String> myFunction) {
        return myFunction.apply(inputString);
    }

    public static void main(String[] args) {
        String result = applySomeFunctionToString("hello", toSentenceCase);
        System.out.println(result);
    }
}
