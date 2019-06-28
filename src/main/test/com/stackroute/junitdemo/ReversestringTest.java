package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversestringTest {
    @Test
    public void giveninputshouldbereverse()
    {
        Reversestring rs=new Reversestring();
        String res=rs.rev("london");
        assertEquals("nodnol",res);
    }
    @Test
    public void giveninputshouldbereverse1()
    {
        Reversestring rs=new Reversestring();
        String res=rs.rev("PRANITHA");
        assertEquals("AHTINARP",res);
    }
    @Test
    public void giveninputshouldbereverse2()
    {
        Reversestring rs=new Reversestring();
        String res=rs.rev("1234");
        assertEquals("4321",res);
    }


}