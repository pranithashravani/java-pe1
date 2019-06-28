package com.stackroute.junitdemo;

public class Determinechar {
    static String isChar(char ch)
    {
        String s1="upperCase";
        String s2="Lowercase";
        String s3="Special Character";
        String s4="digit";

        if (ch >= 'A' && ch <= 'Z')
            return s1;

        else if (ch >= 'a' && ch <= 'z')
            return s2;
        else if(ch>='0' && ch<='9')
            return s4;

        else
            return s3;
    }
}
