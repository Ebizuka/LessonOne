package com.example9;

public class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 2014;
		int y = 8;
		System.out.println("¼—ï"+x +"”N"   +y +"Œ‚Í" +getDays(x,y) +"“ú‚ ‚è‚Ü‚·");  

	}
	public static int getDays(int year,int month)
	{
	    if(month == 2){
	        if(year%4==0 && year%100!=0 || year%400==0){//‚¤‚é‚¤”N‚É‚Â‚¢‚Ä‚Ìˆ—
	            return 29;
	        }
	        return 28;
	    }
	    else if(month == 4 || month == 6 //‚SŒ@‚UŒ@‚XŒ@‚P‚PŒ‚Í@‚R‚O“ú
	     || month == 9 || month == 11){
	        return 30;            
	    }
	    return 31;//ã‚ÌğŒˆÈŠO‚ÌŒ‚É‚Â‚¢‚Ä‚Í@‚R‚P“ú
	}
}
