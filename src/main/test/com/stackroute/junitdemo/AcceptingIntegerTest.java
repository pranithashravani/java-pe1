package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class AcceptingIntegerTest {
    @Test
    public void givennumbershouldreturnresult()
    {
        AcceptingInteger acc=new AcceptingInteger();
        String res=acc.accept(21);
        assertEquals("tom",res);
    }
    @Test
    public void givennumbershouldreturnjerry()
    {
        AcceptingInteger acc=new AcceptingInteger();
        String res=acc.accept(30);
        assertEquals("jerry",res);
    }
    @Test
    public void givennumbershouldreturnnone()
    {
        AcceptingInteger acc=new AcceptingInteger();
        String res=acc.accept(10);
        assertEquals("none",res);
    }

}