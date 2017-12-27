package com.service.dsafew.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDsafew {

        DsafewDelegate dsafewDelegate = new DsafewDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = dsafewDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}