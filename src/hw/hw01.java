package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		
    	Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三數");
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		System.out.println("最小公倍數:"+lcm(lcm(x, y),z));
	}
	
	public static int lcm(int v1,int v2){
		return v1*v2/cm(v1,v2);
	}
	
	public static int cm(int v1,int v2){
		if(v2 == 0){
			return v1;
		}else{
			return cm(v2, v1%v2);
		}
	}
}