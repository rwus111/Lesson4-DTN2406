package assignments.backend;

import assignments.entity.HinhChuNhat;
import assignments.entity.HinhVuong;

public class Question3 {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(5,10);
        System.out.println(hinhChuNhat.tinhChuVi());
        System.out.println(hinhChuNhat.tinhDienTich());

        HinhVuong hinhVuong = new HinhVuong(15);
        System.out.println(hinhVuong.tinhChuVi());
        System.out.println(hinhVuong.tinhDienTich());
    }
}
