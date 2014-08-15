package com.example4;

public class Sample4 {

	
	public static void main(String[] args) {
		/*‚P–œ‰~–¢–‚Ì¤•i‚ğ‚©‚Á‚½‚Æ‚«‚P–œ‰~D‚ğo‚µ‚½‚Ì‚¨’Ş‚è‚Ì‚¨D‚Æd‰İ‚Ì–‡”‚ğ‹‚ß‚éƒvƒƒOƒ‰ƒ€
		 * ‚ğ‚Â‚­‚éi‚½‚¾‚µA‚¨’Ş‚è‚Ì‚¨D‚Ì–‡”‚âd‰İ‚Ì–‡”‚ÍÅ­‚É‚µ‚È‚¯‚ê‚Î‚È‚ç‚È‚¢j
		 * ‚¨D‚Ìí—Ş‚Í@‚P–œ‰~D@‚T–œ‰~D@‚Qç‰~D@ç‰~D@
		 * d‰İ‚Ìí—Ş‚Í@500‰~@100‰~@50‰~@10‰~@5‰~@1‰~
		 */

		int price,oturi,nokorikasu;
		price = 5600;
		oturi = 10000 - price;
		
		System.out.println("‚Tç‰~D‚Í" +(oturi/5000) +"‚Å‚·");
		oturi = oturi % 5000;
		System.out.println("2ç‰~D‚Í" +(oturi/2000) +"‚Å‚·");
		oturi = oturi % 2000;
		System.out.println("1ç‰~D‚Í" +(oturi/1000) +"‚Å‚·");
		oturi = oturi % 1000;
		System.out.println("@5•S‰~‚Í" +(oturi/500) +"‚Å‚·");
		oturi = oturi % 500;
		System.out.println("@@•S‰~‚Í" +(oturi/100) +"‚Å‚·");
		oturi = oturi % 100;
		System.out.println("@5\‰~‚Í" +(oturi/50) +"‚Å‚·");
		oturi = oturi % 50;
		System.out.println("@10‰~‹Ê‚Í" +(oturi/10) +"‚Å‚·");
		oturi = oturi % 10;
		System.out.println("   ‚T‰~‚Í" +(oturi/5) +"‚Å‚·");
		oturi = oturi % 5;
		System.out.println("   1‰~‚Í" +oturi +"‚Å‚·");
	}

}
