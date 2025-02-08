package assignments.entity;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "hoTen='" + getHoTen() + '\'' +
                ", tuoi=" + getTuoi() +
                ", gioiTinh=" + getGioiTinh() +
                ", diaChi='" + getDiaChi() + '\''+
                ", bac=" + bac +
                '}';
    }
}
