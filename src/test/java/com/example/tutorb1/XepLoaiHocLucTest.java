package com.example.tutorb1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class XepLoaiHocLucTest {
    XepLoaiHocLuc hocLuc = new XepLoaiHocLuc();

    @Test
    public void testXuatSacPhanVungTai9_5() throws IllegalAccessException {
        String exp = "Xuất sắc";
        String act = hocLuc.xepLoaiHocLuc(9.5);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testXuatSacPhanVungTai8_5() throws IllegalAccessException {
        String exp = "Giỏi";
        String act = hocLuc.xepLoaiHocLuc(8.5);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testXuatSacPhanVungTai7_5() throws IllegalAccessException {
        String exp = "Khá";
        String act = hocLuc.xepLoaiHocLuc(7.5);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testXuatSacPhanVungTai6() throws IllegalAccessException {
        String exp = "Trung bình";
        String act = hocLuc.xepLoaiHocLuc(6);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testXuatSacPhanVungTai3() throws IllegalAccessException {
        String exp = "Yếu";
        String act = hocLuc.xepLoaiHocLuc(3);
        Assertions.assertEquals(exp, act);
    }
    // diểm tb 15
    @Test
    public  void testHLEx_max(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> hocLuc.xepLoaiHocLuc(15));
    }
    // diem tb -5
    @Test
    public  void testHLEx_min(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> hocLuc.xepLoaiHocLuc(-5));
    }

    @Test
     public  void testHlBientai9() throws IllegalAccessException {
        String exp = "Xuất sắc";
        String act = hocLuc.xepLoaiHocLuc(9);
        Assertions.assertEquals(exp,act);
    }
    @Test
    public  void testHlBientai8() throws IllegalAccessException {
        String exp = "Giỏi";
        String act = hocLuc.xepLoaiHocLuc(8);
        Assertions.assertEquals(exp,act);
    }

    @Test
    public  void testHlBientai7() throws IllegalAccessException {
        String exp = "Khá";
        String act = hocLuc.xepLoaiHocLuc(7);
        Assertions.assertEquals(exp,act);
    }
    @Test
    public  void testHlBientai5() throws IllegalAccessException {
        String exp = "Trung bình";
        String act = hocLuc.xepLoaiHocLuc(5);
        Assertions.assertEquals(exp,act);
    }
    @Test
    public  void testHlBientai1() throws IllegalAccessException {
        String exp = "Yếu";
        String act = hocLuc.xepLoaiHocLuc(1);
        Assertions.assertEquals(exp,act);
    }
}