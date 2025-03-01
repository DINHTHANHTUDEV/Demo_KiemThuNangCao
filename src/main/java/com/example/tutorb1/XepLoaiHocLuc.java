package com.example.tutorb1;

public class XepLoaiHocLuc {
    // ket qua tra ve la String
    public  String xepLoaiHocLuc(double diemTB) throws IllegalAccessException {
        if(diemTB<0 || diemTB>10){
            throw  new IllegalArgumentException("Diem Tb trong khoang tu 0 den 10");
        }
        if(diemTB >=9.0){
            return  "Xuất sắc";
        } else if (diemTB >=8) {
            return "Giỏi";
        } else if (diemTB >=7) {
            return "Khá";
        } else if (diemTB >=5) {
            return "Trung bình";
        } else {
            return  "Yếu";
        }
    }
    
}
