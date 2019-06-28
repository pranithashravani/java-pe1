
package com.stackroute.junitdemo;
import java.util.*;
public class Guess {
    public String guess(int input) {
        Random r = new Random();
        int guess = r.nextInt(50);

        Scanner sc = new Scanner(System.in);

        String s1="Number is more than original number";
        String s2="Number is less than original number";
        String s3="Number is equal to original number";
        if (input > guess) {
                return s1;
            } else if (input < guess) {
                return s2;
            } else {
                return s3;
            }
        }
    }
