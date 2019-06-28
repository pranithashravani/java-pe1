package com.stackroute.junitdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
@Test
    public void givenTwoNumbersShouldReturnSum(){
    App sum=new App();
    int result=sum.Add(5,10);
    assertEquals(15,result);

}

}