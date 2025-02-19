package ntu.lebavan;

import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        double canhNho = Math.min(chieuDai, chieuRong);

        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ hơn: " + canhNho);

        scanner.close();
	}
}
