package com.stackroute.junitdemo;

public class Reversestring {
    static String rev(String original)
    {
        String reverse = "";
        int length = original.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + original.charAt(i);

        return reverse;
    }
}
