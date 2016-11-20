package hw;

import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int sum = 0;
		System.out.print(fun(v1, sum));
	}
	public static int fun(int v1, int sum) {
		if (v1 == 0) {
			return sum;
		} else {
			sum = sum * 10;
			return fun(v1 / 10, sum + v1 % 10);
		}
	}
}