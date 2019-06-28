package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void givenNumberShouldReturnMessage()
    {
        Palindrome pl=new Palindrome();
        String res=pl.ispalindrome(121);
        assertEquals("palindrome and not greater than 25",res);

    }
    @Test
    public void givenNumberShouldReturnnotpalindrome()
    {
        Palindrome pl=new Palindrome();
        String res=pl.ispalindrome(122);
        assertEquals("not palindrome",res);

    }
    @Test
    public void givenNumberShouldReturngreater()
    {
        Palindrome pl=new Palindrome();
        String res=pl.ispalindrome(19991);
        assertEquals("palindrome and greater than 25",res);

    }

}