package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入兩個整數");
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		System.out.println((C(v1) / (C(v2) * C(v2 - v1))));

	}

	public static int C(int v4) {
		int sum = 1;
		for (int i = 1; i <= v4; i++) {
			sum = sum * i;
		}
		return sum;
	}
}
