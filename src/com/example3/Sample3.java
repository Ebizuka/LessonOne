package com.example3;

public class Sample3 {

	
	public static void main(String[] args) {
		int x,y,z; 
		x = 300;
		y = 30;
		z = 3000;
		/*
		 *�@�W��A�̗v�f��b,c,d�Ƃ���Ƃ� 
		 *�@�W��A�̍ő�l�����߂�B
		 * �W��A�̍ő�l��b�ł��邱�Ƃ́@c<=b ���@d<=b�@�����藧���Ƃł��邱�Ƃɒ��� 
		 */
	    if(x >= y && x >= z ){                   //�@x>y �܂��� x>z , x=y �܂��� x>z , x>y �܂��� x=y ,�@x=y �܂��� x=z�@���Ӗ�����
			System.out.println("�ő�l��" +x);   
		}else if(y >= z ){                       // y>z ,�@y=z ���Ӗ�����
			System.out.println("�ő�l��" +y);    
		}else{
			System.out.println("�ő�l��" +z);    // z���ő�l�̏ꍇ
		}
	}

}