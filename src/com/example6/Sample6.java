package com.example6;

public class Sample6 {

	/**
	 *
	 * 今はやりのピラミッドを表示させるプログラム
	 * n=2のとき　○* ***
	 * n=3のとき　○○* ○*** *****
	 */
	 
	public static void main(String[] args) {
		int n = 5; // 段数
		String moji = "*";
		for(int j = 1 ; j <= n ; j++){ // j段目についての処理
		for(int i = j; i <= n-1 ; i++){
			System.out.print(" ");
		}for(int k = 1; k <= 2*j-1; k ++){
			System.out.print("*");
		}
		System.out.println("");
	}

}
}
