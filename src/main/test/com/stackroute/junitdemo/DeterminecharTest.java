package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeterminecharTest {
    @Test
    public void giveninputshouldbelower()
    {
        Determinechar dc=new Determinechar();
        String res=dc.isChar('a');
        assertEquals("Lowercase",res);

    }
    @Test
    public void giveninputshouldbeupper()
    {
        Determinechar dc=new Determinechar();
        String res=dc.isChar('A');
        assertEquals("upperCase",res);

    }
    @Test
    public void giveninputshouldbespecial()
    {
        Determinechar dc=new Determinechar();
        String res=dc.isChar('#');
        assertEquals("Special Character",res);

    }
    @Test
    public void giveninputshouldbenone()
    {
        Determinechar dc=new Determinechar();
        String res=dc.isChar('8');
        assertEquals("digit",res);

    }

}