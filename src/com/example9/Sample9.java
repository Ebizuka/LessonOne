package com.example9;

public class Sample9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 2014;
		int y = 8;
		System.out.println("����"+x +"�N"   +y +"����" +getDays(x,y) +"������܂�");  

	}
	public static int getDays(int year,int month)
	{
	    if(month == 2){
	        if(year%4==0 && year%100!=0 || year%400==0){//���邤�N�ɂ��Ă̏���
	            return 29;
	        }
	        return 28;
	    }
	    else if(month == 4 || month == 6 //�S���@�U���@�X���@�P�P���́@�R�O��
	     || month == 9 || month == 11){
	        return 30;            
	    }
	    return 31;//��̏����ȊO�̌��ɂ��Ắ@�R�P��
	}
}
