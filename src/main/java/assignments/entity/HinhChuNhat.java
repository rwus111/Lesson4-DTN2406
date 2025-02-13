package assignments.entity;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int tinhChuVi() {
        System.out.println("Tính chu vi theo Hình Chữ Nhật");
        return (chieuDai + chieuRong) * 2;
    }

    public int tinhDienTich() {
        System.out.println("Tính diện tích theo Hình Chữ Nhật");
        return chieuDai * chieuRong;
    }
}
