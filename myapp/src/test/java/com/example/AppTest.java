package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void AppTests(){
        App app=new App();
        int result=app.Add(2,3);
        System.out.println("result of num1 and num2:"+result);
        assertEquals(5,result);

    }

}
