package com.example4;

public class Sample4 {

	
	public static void main(String[] args) {
		/*�P���~�����̏��i���������Ƃ��P���~�D���o�������̂��ނ�̂��D�ƍd�݂̖��������߂�v���O����
		 * ������i�������A���ނ�̂��D�̖�����d�݂̖����͍ŏ��ɂ��Ȃ���΂Ȃ�Ȃ��j
		 * ���D�̎�ނ́@�P���~�D�@�T���~�D�@�Q��~�D�@��~�D�@
		 * �d�݂̎�ނ́@500�~�@100�~�@50�~�@10�~�@5�~�@1�~
		 */

		int price,oturi,nokorikasu;
		price = 5600;
		oturi = 10000 - price;
		
		System.out.println("�T��~�D��" +(oturi/5000) +"�ł�");
		oturi = oturi % 5000;
		System.out.println("2��~�D��" +(oturi/2000) +"�ł�");
		oturi = oturi % 2000;
		System.out.println("1��~�D��" +(oturi/1000) +"�ł�");
		oturi = oturi % 1000;
		System.out.println("�@5�S�~��" +(oturi/500) +"�ł�");
		oturi = oturi % 500;
		System.out.println("�@�@�S�~��" +(oturi/100) +"�ł�");
		oturi = oturi % 100;
		System.out.println("�@5�\�~��" +(oturi/50) +"�ł�");
		oturi = oturi % 50;
		System.out.println("�@10�~�ʂ�" +(oturi/10) +"�ł�");
		oturi = oturi % 10;
		System.out.println("   �T�~��" +(oturi/5) +"�ł�");
		oturi = oturi % 5;
		System.out.println("   1�~��" +oturi +"�ł�");
	}

}
