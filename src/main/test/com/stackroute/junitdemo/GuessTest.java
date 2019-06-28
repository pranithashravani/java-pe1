package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTest {

    @Test
    public void givenInputShouldBeReply() {
        Guess gs = new Guess();
        String result = gs.guess(1);
        assertEquals("1", result);
    }

    @Test
    public void givenInputShouldBeReply1() {
        Guess gs = new Guess();
        String result = gs.guess(30);
        assertEquals("Number is more than original number", result);
    }
}