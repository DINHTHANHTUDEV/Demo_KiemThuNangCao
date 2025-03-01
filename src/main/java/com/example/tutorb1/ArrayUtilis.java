package com.example.tutorb1;

import java.util.Arrays;

public class ArrayUtilis {
    public int findMax(int[] arrNumber) {
        if (arrNumber == null || arrNumber.length == 0) {
            throw  new IllegalArgumentException("Mảng không được rỗng");

        }
        // c1: gan gia tri dau tiwn la max -> so sanh tung phan tu voi max -> max moi
        // c2: sau dung thuat toan sap xep, sap xep theo chieu tang giam
        Arrays.sort(arrNumber);// sap xep theo chieu tang dan
        int max = arrNumber[arrNumber.length-1];
        int index = arrNumber.length-1;
        System.out.println("Gia tri cuoi lon nhat la :" + max + "va tai vi tri thu:" + index);
        return  max;
    }
}
