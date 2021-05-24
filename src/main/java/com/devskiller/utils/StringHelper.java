package com.devskiller.utils;

public class StringHelper {

    public static String reverse(final String input) {
        String[] array = input.split("");
        String b = "";
        int num = 1;
        for (String x : array) {
            String a = array[array.length - num ];
            b = b+a;
            num ++;
        }
        return b;
    }

    public static String substring(final String input, final int index) {
        String[] a = input.split(" ");
        int num = (a.length == 1 ? 0 : index-1);
        try {
            return a[num];
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
