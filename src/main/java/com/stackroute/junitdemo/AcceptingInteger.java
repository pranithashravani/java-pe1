package com.stackroute.junitdemo;

public class AcceptingInteger {
     public String accept(int n)
    {
        String s1 = "jerry";
        String s2="tom";
        String s3="none";
        if(n%2==0&&n>=20&&n<=30) {

            return s1;
        }
        if(n%2!=0&&n>=20&&n<=30)
        {

           return s2;
        }
        else
            return s3;
    }
}
