package com.example6;

public class Sample6 {

	/**
	 *
	 * ���͂��̃s���~�b�h��\��������v���O����
	 * n=2�̂Ƃ��@��* ***
	 * n=3�̂Ƃ��@����* ��*** *****
	 */
	 
	public static void main(String[] args) {
		int n = 5; // �i��
		String moji = "*";
		for(int j = 1 ; j <= n ; j++){ // j�i�ڂɂ��Ă̏���
		for(int i = j; i <= n-1 ; i++){
			System.out.print(" ");
		}for(int k = 1; k <= 2*j-1; k ++){
			System.out.print("*");
		}
		System.out.println("");
	}

}
}
