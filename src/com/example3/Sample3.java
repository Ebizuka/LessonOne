package com.example3;

public class Sample3 {

	
	public static void main(String[] args) {
		int x,y,z; 
		x = 300;
		y = 30;
		z = 3000;
		/*
		 *　集合Aの要素をb,c,dとするとき 
		 *　集合Aの最大値を求める。
		 * 集合Aの最大値がbであることは　c<=b かつ　d<=b　が成り立つことであることに注意 
		 */
	    if(x >= y && x >= z ){                   //　x>y または x>z , x=y または x>z , x>y または x=y ,　x=y または x=z　を意味する
			System.out.println("最大値は" +x);   
		}else if(y >= z ){                       // y>z ,　y=z を意味する
			System.out.println("最大値は" +y);    
		}else{
			System.out.println("最大値は" +z);    // zが最大値の場合
		}
	}

}