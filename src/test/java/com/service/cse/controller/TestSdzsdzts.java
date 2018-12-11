package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSdzsdzts {

      SdzsdztsDelegate sdzsdztsDelegate = new SdzsdztsDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = sdzsdztsDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
