package com.example10;

public class Sample10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CoinCase coinCase = new CoinCase();
		/*
		AddCoins(�d�݂̎��,�����j
		
		
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

	    System.out.print("1�~�ʂ́A"+coinCase.GetCount(1)+"���ŁA");
	    System.out.println(coinCase.GetAmount(1)+"�~");
	    System.out.print("5�~�ʂ́A"+coinCase.GetCount(5)+"���ŁA");
	    System.out.println(coinCase.GetAmount(5)+"�~");
	    System.out.print("10�~�ʂ́A"+coinCase.GetCount(10)+"���ŁA");
	    
	    System.out.println(coinCase.GetAmount(10)+"�~");
	    System.out.print("50�~�ʂ́A"+coinCase.GetCount(50)+"���ŁA");
	    System.out.println(coinCase.GetAmount(50)+"�~");
	    System.out.print("100�~�ʂ́A"+coinCase.GetCount(100)+"���ŁA");
	    System.out.println(coinCase.GetAmount(100)+"�~");
	    System.out.print("500�~�ʂ́A"+coinCase.GetCount(500)+"���ŁA");
	    System.out.println(coinCase.GetAmount(500)+"�~");
	    System.out.println("�d�݂̑������́A"+coinCase.GetCount()+"��");
	    System.out.println("���v���z�́A"+coinCase.GetAmount()+"�~");
	}
	}

