package ntu.lebavan;

import java.util.Scanner;

public class Lab2_Bai4_ChonChucNang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU CHỨC NĂNG =====");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc hai");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn chức năng (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    giaiPhuongTrinhBacNhat(scanner);
                    break;
                case 2:
                    giaiPhuongTrinhBacHai(scanner);
                    break;
                case 3:
                    tinhTienDien(scanner);
                    break;
                case 4:
                    System.out.println("Thoát chương trình. Hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập số từ 1 đến 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void giaiPhuongTrinhBacNhat(Scanner scanner) {
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình: x = " + x);
        }
    }

    public static void giaiPhuongTrinhBacHai(Scanner scanner) {
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            giaiPhuongTrinhBacNhat(scanner);
            return;
        }

        double delta = b * b - 4 * a * c;
        System.out.println("Delta = " + delta);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm thực.");
        }
    }

    public static void tinhTienDien(Scanner scanner) {
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();

        if (soDien < 0) {
            System.out.println("Số điện không hợp lệ!");
        } else {
            int tienDien;
            if (soDien <= 50) {
                tienDien = soDien * 1000;
            } else {
                tienDien = 50 * 1000 + (soDien - 50) * 1200;
            }
            System.out.println("Tiền điện phải trả: " + tienDien + " đồng");
        }
    }
}
