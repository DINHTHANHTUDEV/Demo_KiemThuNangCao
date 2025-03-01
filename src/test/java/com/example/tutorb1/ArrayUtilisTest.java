package com.example.tutorb1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilisTest {
    ArrayUtilis arrayUtilis = new ArrayUtilis();
    @Test
    public  void testFindMax(){
        // arr = 2,4,6,1,9,-8,1
        int exp = 9;
        int act = arrayUtilis.findMax(new int[]{2,4,6,1,9,-8,1});
        Assertions.assertEquals(exp,act);
    }
    @Test
     public  void testFindMaxEx(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> arrayUtilis.findMax(new int[]{}));
    }

    @Test
    public  void testFindMaxEx2(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> arrayUtilis.findMax(null));
    }

}