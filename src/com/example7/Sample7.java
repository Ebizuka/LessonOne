package com.example7;

public class Sample7 {

	/**
	 * —^‚¦‚ç‚ê‚½®”‚ğ‹t‚Ì‡”Ô‚Å•\¦‚³‚¹‚æ‚¤
	 */
	public static void main(String[] args) {
		int x = 1234; //—^‚¦‚ç‚ê‚½®”
		int y = 0;
		int z = 4; //—^‚¦‚ç‚ê‚½®”‚ÌŒ…”
		for(int i = 1; i< z; i++){
		x /= 10;
		y = x % 10;
		System.out.print(y);
		}
		
		
	}

}
