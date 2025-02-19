package ntu.lebavan;

public class Lab3_Bai2_BangCuuChuong {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng cửu chương " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

        }
	}
}
