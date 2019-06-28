package com.stackroute.junitdemo;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


    public class DescendingTest {
        Descending object;
        @Before
        public void set(){
            object=new Descending();
        }
        @After
        public void tear(){
            object=null;
        }
        @Test
        public void givenNumbershouldReturnFalseMessage(){
            String result=object.sortTheNumber(2345);
            assertEquals("False",result);
        }

        @Test
        public void givenNumbershouldReturnTrueMessage(){
            String result=object.sortTheNumber(88888);
            assertEquals("True",result);
        }
        @Test
        public void givenZeroshouldReturnMessage(){
            String result=object.sortTheNumber(0);
            assertEquals("False",result);
        }

        @Test
        public void givenNeagitiveValueshouldReturnMessage(){
            String result=object.sortTheNumber(-2345);
            assertEquals("False",result);
        }
    }
