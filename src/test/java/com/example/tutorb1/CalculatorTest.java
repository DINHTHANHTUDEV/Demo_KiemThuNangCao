package com.example.tutorb1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    // tạo đối tượng
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        // a = 4, b= 3, sum = 7
        // kq mong muoons
        int exp = 7;
        int act = calc.add(4, 3);
        // so sanhs kq mong muon co trung hop voiw ket qua thuc te hay k
        Assertions.assertEquals(exp, act);
    }
    // chia a = 3,b =2
    @Test
    public  void testDevide(){
        double exp = 1.5;
        double act = calc.divide(3,2);
        Assertions.assertEquals(exp,act);
    }

    @Test
    public  void testDevideByZero(){
//        double exp = 1.5;
//        double act = calc.divide(3,0);
        Assertions.assertThrows(ArithmeticException.class,()->calc.divide(3,0));
    }
}