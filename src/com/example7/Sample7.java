package com.example7;

public class Sample7 {

	/**
	 * 与えられた整数を逆の順番で表示させよう
	 */
	public static void main(String[] args) {
		int x = 1234; //与えられた整数
		int y = 0;
		int z = 4; //与えられた整数の桁数
		for(int i = 1; i< z; i++){
		x /= 10;
		y = x % 10;
		System.out.print(y);
		}
		
		
	}

}
