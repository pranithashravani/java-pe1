package com.stackroute.junitdemo;

public class Pattern {
    public String pattern(int input) {


        String res = "";
        int i, j;
        for (i = 1; i <= input; i++) {
            for (j = 1; j <= i; j++) {
                res += i;

            }

        }
        return res;
    }
}

