package com.example8;

public class Sample8 {

	/**
	 * �悎���̃t�B�{�i�b�`����̒l��\�������悤
	 * n=0 �̂Ƃ��@1 n=1�̂Ƃ��@1 n=2 �̂Ƃ��@1+1=2  n=3�̂Ƃ��@1+2=3 
	 * �Ƃ�����n=0 �̂Ƃ��@1 n=1�̂Ƃ��@1�@�Ł@�悎���́@��n-2��+��n-1���@�i��>=2)�̂悤�Ȑ���ł���B
	 */
	public static void main(String[] args) {
		int n = 7; //��n�����w�肷��
		int a,b,c;
		a = b = 1;
		c = 0;
		if(n == 0){
			System.out.println("�t�B�{�i�b�`����̑�0���̒l��" +1+"�ł�");
		}
		else if(n == 1){
			System.out.println("�t�B�{�i�b�`����̑�1���̒l��"+1+"�ł�");
		} else{
		for(int i = 2; i<= n; i++){
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println("�t�B�{�i�b�`����̑�"+n +"���̒l��"+c +"�ł�");
	}
	}
}
