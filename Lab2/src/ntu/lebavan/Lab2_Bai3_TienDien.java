package ntu.lebavan;

import java.util.Scanner;

public class Lab2_Bai3_TienDien {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

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
        scanner.close();
	}
}
