package com.example.tutorb1;

public class Calculator {
    public int add(int a,int b){
        return a + b;
    }
    // phép chia
    public  double divide (int a, int b){
        if(b==0){
            throw  new ArithmeticException("khong the chia het cho b");

        }
        return(double) a/b;
    }
}
