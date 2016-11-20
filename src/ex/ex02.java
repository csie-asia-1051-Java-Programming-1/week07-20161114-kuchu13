package ex;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * Author: 105021033 黃苡珊
 * 
 * 承上題，除了var() 函數之外，再用建立一個 std() 函數，
 * 程式在接收完使用者輸入的一維整數陣列之後，呼叫std()函式可得到陣列的標準差，
 * 特別注意，不要只用 std() 函數算結果，
 * 必須由std()去呼叫 var() 函數之後回到 std()，
 * 函式處理完再傳回給主程式，主程式再把結果印出。
 */
public class ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		float data[] = new float[v1];
		float sum = 0;
		for (int i = 0; i < v1; i++) {
			data[i] = scn.nextInt();
			sum = sum + data[i];
		}
		System.out.println(std(var(data, v1, sum / v1) / v1));
	}

	public static float var(float data[], int v1, float sum) {
		float v2 = 0;
		for (int i = 0; i < v1; i++) {
			v2 = (float) (v2 + Math.pow(data[i] - sum, 2));
		}
		return v2;
	}
	public static double std(double v2) {
		return Math.sqrt(v2);
}
}