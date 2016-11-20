package ex;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * Author: 105021033 黃苡珊
 * 
 * 請寫一個程式，讓使用者輸入一個整數二維陣列，
 * 建立 var2()函式 及std2()可以分別計算二維陣列的變異數與標準差，
 * 並把結果回傳到主程式印出。
 */
public class ex03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		float data[][] = new float[v1][v1];
		float sum = 0;
		for (int i = 0; i < v1; i++) {
			for (int j = 0; j < v1; j++) {
			data[i][j] = scn.nextInt();
			sum += data[i][j];
		}
			}
		System.out.println(var2(data, v1, sum / (v1*v1)) / (v1*v1));
		System.out.println(std2(var2(data, v1, sum / (v1*v1)) / (v1*v1)));
	}

	public static float var2(float data[][], int v1, float sum) {
		float v2 = 0;
		for (int i = 0; i < v1; i++) {
			for (int j = 0; j < v1; j++) {
				v2 = (float) (v2 + Math.pow(data[i][j] - sum, 2));
			}
		}
		return v2;
	}

	public static double std2(double v3) {
		return Math.sqrt(v3);
	}
}
