package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {
    @Test
    public void givenNumberShouldReturnvowel()
    {
        Vowel vl=new Vowel();
        String res=vl.isvowel("a");
        assertEquals("Vowel",res);

    }
    @Test
    public void givenNumberShouldReturnconsonant()
    {
        Vowel vl=new Vowel();
        String res=vl.isvowel("ap");
        assertEquals("VowelConsonant",res);

    }
    @Test
    public void givenNumberShouldReturnnot()
    {
        Vowel vl=new Vowel();
        String res=vl.isvowel("8");
        assertEquals("Error",res);

    }
    @Test
    public void givenNumberShouldReturnnone()
    {
        Vowel vl=new Vowel();
        String res=vl.isvowel("*");
        assertEquals("Error",res);

    }
}