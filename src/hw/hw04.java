package hw;

import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入兩個整數");

		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
		System.out.println(gcd(v1, v2));

	}
	public static int gcd(int v1, int v2) {

		int sum = v1 % v2;
		if (sum == 0) {
			return v2;
		} else {
			return gcd(v2, sum);
		}
	}
}