package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入一個正整數值(不含 0)");
		int v1 = scn.nextInt();
		System.out.println(ofdigits(v1, 0));
	}
	public static int ofdigits(int v1, int v2) {
		if (v1 == 0) {
			return v2;
		} else {
			return ofdigits(v1 / 10, (v2 + 1));
		}
	}
}