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
		Scanner scn =new Scanner(System.in);
		int v1 =scn.nextInt();
		int data[] = new int[v1];
		for(int i=0;i<v1;i++){
			data[i]=scn.nextInt();
		}
//		System.out.println(var(v1,data));
//	}
//	public static int var(int v2, int[] v3){
//		
//		

		System.out.println(data);
	}
}
