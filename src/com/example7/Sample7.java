package com.example7;

public class Sample7 {

	/**
	 * �^����ꂽ�������t�̏��Ԃŕ\�������悤
	 */
	public static void main(String[] args) {
		int x = 1234; //�^����ꂽ����
		int y = 0;
		int z = 4; //�^����ꂽ�����̌���
		for(int i = 1; i< z; i++){
		x /= 10;
		y = x % 10;
		System.out.print(y);
		}
		
		
	}

}
