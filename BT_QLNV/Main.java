package BT_QLNV;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien[] nhanVien = new NhanVien[3];
        nhanVien[0] = new NhanVien("Kiên",3832111,"Thanh Hóa");
        nhanVien[1] = new NhanVien("Toàn",6868686,"Hà Nội");
        nhanVien[2] = new NhanVien("Nam", 3333333, "Hà Nội");

        while (true) {
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Hiển thị nhân viên");
            System.out.println("4. Sửa nhân viên");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhanVien = Controller.createNhanVien(nhanVien);
                    break;
                case 2:
                    nhanVien = Controller.delete(nhanVien);
                    break;
                case 3:
                    Controller.showNhanVien(nhanVien);
                    break;
                case 4:
                    nhanVien = Controller.editNhanVien(nhanVien);
                    break;
            }
        }
    }
}