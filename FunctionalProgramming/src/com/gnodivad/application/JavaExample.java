package com.gnodivad.application;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println();

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("black");

        List<String> uppercaseColors = new ArrayList<>();

        for (String color : colors) {
            uppercaseColors.add(color.toUpperCase(Locale.ROOT));
        }

        for (String color : uppercaseColors) {
            System.out.println(color);
        }
    }
}
