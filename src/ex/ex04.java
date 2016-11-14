package ex;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * Author: 105021033 黃苡珊
 * 
 * 讓使用者輸入一個正整數 n，接著使用遞迴呼叫印出 n! 的結果。

 */
public class ex04 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int v1 =scn.nextInt();
		System.out.println(fun(v1));
	}
		public static int fun(int v2) {
			if(v2==1){
				return v2;
			}else{
				return v2*fun(v2-1);
		}
	}
}
