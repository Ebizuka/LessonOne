package com.example9;

public class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 2014;
		int y = 8;
		System.out.println("西暦"+x +"年"   +y +"月は" +getDays(x,y) +"日あります");  

	}
	public static int getDays(int year,int month)
	{
	    if(month == 2){
	        if(year%4==0 && year%100!=0 || year%400==0){//うるう年についての処理
	            return 29;
	        }
	        return 28;
	    }
	    else if(month == 4 || month == 6 //４月　６月　９月　１１月は　３０日
	     || month == 9 || month == 11){
	        return 30;            
	    }
	    return 31;//上の条件以外の月については　３１日
	}
}
