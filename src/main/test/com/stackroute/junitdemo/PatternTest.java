package com.stackroute.junitdemo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
Pattern pt;
    @Before
public void setUp(){
    pt=new Pattern();
}

    @Test
    public void givenInputShouldBePattern() {
        Pattern pt = new Pattern();
        String result = pt.pattern(1);
        assertEquals("1", result);
    }
    @Test
    public void givenInputShouldBePattern1() {
        Pattern pt = new Pattern();
        String result = pt.pattern(2);
        assertEquals("122", result);
    }

    @Test
    public void givenInputShouldBePattern2() {
        Pattern pt = new Pattern();
        String result = pt.pattern(5);
        assertEquals("122333444455555", result);
    }



}
