package com.example10;

public class Sample10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CoinCase coinCase = new CoinCase();
		/*
		AddCoins(d‰İ‚Ìí—Ş,–‡”j
		
		
		*/
	    coinCase.AddCoins(1, 3);    
	    coinCase.AddCoins(5, 4);
	    coinCase.AddCoins(10, 14);
	    coinCase.AddCoins(50, 3);
	    coinCase.AddCoins(100, 8);
	    coinCase.AddCoins(500, 2);
	    coinCase.AddCoins(50, 2);
	    coinCase.AddCoins(10, 3);
	    coinCase.AddCoins(5, 1);
	    coinCase.AddCoins(1, 2);    

	    System.out.print("1‰~‹Ê‚ÍA"+coinCase.GetCount(1)+"–‡‚ÅA");
	    System.out.println(coinCase.GetAmount(1)+"‰~");
	    System.out.print("5‰~‹Ê‚ÍA"+coinCase.GetCount(5)+"–‡‚ÅA");
	    System.out.println(coinCase.GetAmount(5)+"‰~");
	    System.out.print("10‰~‹Ê‚ÍA"+coinCase.GetCount(10)+"–‡‚ÅA");
	    
	    System.out.println(coinCase.GetAmount(10)+"‰~");
	    System.out.print("50‰~‹Ê‚ÍA"+coinCase.GetCount(50)+"–‡‚ÅA");
	    System.out.println(coinCase.GetAmount(50)+"‰~");
	    System.out.print("100‰~‹Ê‚ÍA"+coinCase.GetCount(100)+"–‡‚ÅA");
	    System.out.println(coinCase.GetAmount(100)+"‰~");
	    System.out.print("500‰~‹Ê‚ÍA"+coinCase.GetCount(500)+"–‡‚ÅA");
	    System.out.println(coinCase.GetAmount(500)+"‰~");
	    System.out.println("d‰İ‚Ì‘–‡”‚ÍA"+coinCase.GetCount()+"–‡");
	    System.out.println("‡Œv‹àŠz‚ÍA"+coinCase.GetAmount()+"‰~");
	}
	}

