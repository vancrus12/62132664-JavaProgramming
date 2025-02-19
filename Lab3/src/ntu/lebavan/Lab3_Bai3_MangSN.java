package ntu.lebavan;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Bai3_MangSN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        
        int[] a = new int[n]; 

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        System.out.println("\nMảng sau khi sắp xếp tăng dần: " + Arrays.toString(a));

        int min = a[0]; 
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);

        int tong = 0, dem = 0;
        for (int num : a) {
            if (num % 3 == 0) {
                tong += num;
                dem++;
            }
        }
        if (dem > 0) {
            double trungBinh = (double) tong / dem;
            System.out.println("Trung bình cộng các số chia hết cho 3: " + trungBinh);
        } else {
            System.out.println("Không có số nào chia hết cho 3 trong mảng.");
        }
        scanner.close();

	}

}
