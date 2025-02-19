package ntu.lebavan;

import java.util.Scanner;

public class Lab3_Bai1_SNTo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int N = scanner.nextInt();

        boolean ok = true;

        if (N < 2) {
            ok = false; 
        } else {
            for (int i = 2; i < N; i++) { 
                if (N % i == 0) { 
                    ok = false;
                    break; 
                }
            }
        }

        if (ok) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không phải là số nguyên tố.");
        }

        scanner.close();
	}
}

