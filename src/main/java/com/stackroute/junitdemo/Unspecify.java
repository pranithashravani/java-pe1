package com.stackroute.junitdemo;
import java.util.Scanner;
public class Unspecify {
    public int specify()
    {
        int number;
        int total = 0, count = 0;
        Scanner s = new Scanner(System.in);
        while ((number = s.nextInt()) != 0) {
            total += number;

        }
        return total;
    }
}
