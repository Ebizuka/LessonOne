package com.example4;

public class Sample4 {

	
	public static void main(String[] args) {
		/*１万円未満の商品をかったとき１万円札を出した時のお釣りのお札と硬貨の枚数を求めるプログラム
		 * をつくる（ただし、お釣りのお札の枚数や硬貨の枚数は最少にしなければならない）
		 * お札の種類は　１万円札　５万円札　２千円札　千円札　
		 * 硬貨の種類は　500円　100円　50円　10円　5円　1円
		 */

		int price,oturi,nokorikasu;
		price = 5600;
		oturi = 10000 - price;
		
		System.out.println("５千円札は" +(oturi/5000) +"です");
		oturi = oturi % 5000;
		System.out.println("2千円札は" +(oturi/2000) +"です");
		oturi = oturi % 2000;
		System.out.println("1千円札は" +(oturi/1000) +"です");
		oturi = oturi % 1000;
		System.out.println("　5百円は" +(oturi/500) +"です");
		oturi = oturi % 500;
		System.out.println("　　百円は" +(oturi/100) +"です");
		oturi = oturi % 100;
		System.out.println("　5十円は" +(oturi/50) +"です");
		oturi = oturi % 50;
		System.out.println("　10円玉は" +(oturi/10) +"です");
		oturi = oturi % 10;
		System.out.println("   ５円は" +(oturi/5) +"です");
		oturi = oturi % 5;
		System.out.println("   1円は" +oturi +"です");
	}

}
