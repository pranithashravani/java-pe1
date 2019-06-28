package com.stackroute.junitdemo;

public class Palindrome {
    static String ispalindrome(int n)
    {
        int reverse, sum = 0, temp;
        temp = n;
        String s1="palindrome and greater than 25";
        String s2="palindrome and not greater than 25";
        String s3="not palindrome";
        while(n>0){
            reverse=n%10;  //getting remainder
            sum=(sum*10)+reverse;
            n=n/10;
        }
        if(temp==sum){
            int new1=0;

            while (sum > 0) {
                reverse = sum % 10;
                if (sum % 2 == 0) {
                    new1 = new1 + reverse;
                }
                sum = sum / 10;
            }
            if(new1>25)
                return s1;
            else
               return s2;
        }
        else
            return s3;
    }
}
