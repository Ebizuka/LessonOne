package com.example8;

public class Sample8 {

	/**
	 * 第ｎ項のフィボナッチ数列の値を表示させよう
	 * n=0 のとき　1 n=1のとき　1 n=2 のとき　1+1=2  n=3のとき　1+2=3 
	 * といったn=0 のとき　1 n=1のとき　1　で　第ｎ項は　第n-2項+第n-1項　（ｎ>=2)のような数列である。
	 */
	public static void main(String[] args) {
		int n = 7; //第n項を指定する
		int a,b,c;
		a = b = 1;
		c = 0;
		if(n == 0){
			System.out.println("フィボナッチ数列の第0項の値は" +1+"です");
		}
		else if(n == 1){
			System.out.println("フィボナッチ数列の第1項の値は"+1+"です");
		} else{
		for(int i = 2; i<= n; i++){
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println("フィボナッチ数列の第"+n +"項の値は"+c +"です");
	}
	}
}
