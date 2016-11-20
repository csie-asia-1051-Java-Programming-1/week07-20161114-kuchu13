package ex;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * Author: 105021033 黃苡珊
 * 
 * 請寫一個程式，用陣列儲存使用者輸入的 n 個整數，
 * 透過函式 var() 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
 */
public class ex01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		float data[] = new float[v1];
		float sum = 0;
		for (int i = 0; i < v1; i++) {
			data[i] = scn.nextInt();
			sum = sum + data[i];
		}
		System.out.println(var(data, v1, sum / v1) / v1);
	}

	public static float var(float data[], int v1, float sum) {
		float v2 = 0;
		for (int i = 0; i < v1; i++) {
			v2 = (float) (v2 + Math.pow(data[i] - sum, 2));
		}
		return v2;
	}
}
