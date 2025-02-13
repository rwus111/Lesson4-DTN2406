package assignments.entity;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(int canh) {
        super(canh, canh);
    }

    @Override
    public int tinhChuVi() {
        System.out.println("Tính chu vi theo Hình Vuông");
        return super.tinhChuVi();
    }

    @Override
    public int tinhDienTich() {
        System.out.println("Tính diện tích theo Hình Vuông");
        return super.tinhDienTich();
    }
}
