package assignments.backend;

import assignments.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private static Scanner scanner = new Scanner(System.in);
    private static List<CanBo> canBos = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("========== QLCB ==========");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiện thị thông tin về danh sách các cán bộ");
            System.out.println("4. Delete cán bộ");
            System.out.println("0. Thoát khỏi chương trình");
            System.out.println("Mời bạn chọn chức năng (0-4):");
            int menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) {
                case 1:
                    addCanBo();
                    break;
                case 2:
                    findByHoTen();
                    break;
                case 3:
                    showAllCanBos();
                    break;
                case 4:
                    deleteCanBo();
                    break;
                case 0:
                    System.out.println("Tạm biệt!!!");
                    return;
                default:
                    System.out.println("Menu cần chọn từ 0-4. Hãy chọn lại");
            }
        }
    }

    private static void deleteCanBo() {
        System.out.println("==== Chức năng xoá cán bộ theo họ tên ====");
        System.out.println("Nhập vào họ tên cán bộ cần xoá:");
        String hoTen = scanner.nextLine();
        boolean isRemoved = canBos.removeIf(canBo -> {
            return canBo.getHoTen().equalsIgnoreCase(hoTen);
        });
        if (isRemoved) {
            System.out.println("Xoá thành công cán bộ: " + hoTen);
        } else {
            System.out.println("Không có cán bộ nào có tên: " + hoTen);
        }
    }

    private static void findByHoTen() {
        System.out.println("==== Chức năng tìm kiếm cán bộ theo họ tên ====");
        System.out.println("Nhập vào họ tên cán bộ cần tìm:");
        String hoTen = scanner.nextLine();
        boolean isExists = false;
        System.out.println("Danh sách cán bộ cần tìm:");
        for (CanBo canBo : canBos) {
            if (canBo.getHoTen().equalsIgnoreCase(hoTen)) {
                isExists = true;
                System.out.println(canBo);
            }
        }
        if (!isExists) {
            System.out.println("Không có cán bộ nào có tên: " + hoTen);
        }
    }

    private static void showAllCanBos() {
        System.out.println("==== Chức năng in danh sách cán bộ ====");
        System.out.println("Danh sách cán bộ");
        canBos.forEach(canBo -> {
            System.out.println(canBo);
        });
    }

    private static void addCanBo() {
        System.out.println("==== Chức năng thêm cán bộ ====");

        System.out.println("Nhập họ tên:");
        String hoTen = scanner.nextLine();

        System.out.println("Nhập tuổi:");
        int tuoi = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Giới tính");
        GioiTinh[] gioiTinhs = GioiTinh.values(); // NAM NU KHAC
        for (int i = 0; i < gioiTinhs.length; i++) {
            System.out.println((i + 1) + ". " + gioiTinhs[i]);
        }
        System.out.println("Mời chọn giới tính:");
        int choose = scanner.nextInt();
        scanner.nextLine();
        GioiTinh gioiTinh = gioiTinhs[choose - 1];

        System.out.println("Nhập địa chỉ:");
        String diaChi = scanner.nextLine();

        System.out.println("Các loại cán bộ:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.println("Mời chọn loại cán bộ (1-3):");
        int type = scanner.nextInt();
        scanner.nextLine();
        switch (type) {
            case 1:
                System.out.println("Nhập bậc của công nhân (1-10):");
                int bac = scanner.nextInt();
                scanner.nextLine();
                CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
                canBos.add(congNhan);
                break;
            case 2:
                System.out.println("Nhập ngành đào tạo của kỹ sư:");
                String nganhDaoTao = scanner.nextLine();
                KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
                canBos.add(kySu);
                break;
            case 3:
                System.out.println("Nhập công việc của nhân viên:");
                String congViec = scanner.nextLine();
                NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                canBos.add(nhanVien);
                break;
        }
        System.out.println("Thêm cán bộ thành công!!!");
    }
}
