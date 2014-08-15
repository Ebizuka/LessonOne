package com.example5;

public class Sample5 {

	/**
	 * 直角三角形を表示するプログラムを作る
	 * 段数は２段以上とする。
	 * 
	 */
	public static void main(String[] args) {
		int n = 10;           //段数を決める
		String kome = "*";
		for(int i = 1; i <= n ;  i++ ){
			System.out.println(kome);
			kome = kome + "*";
		}
		
		
	}

}
