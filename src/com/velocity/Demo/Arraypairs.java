package com.velocity.Demo;

public class Arraypairs {

	public static void main(String[] args) {int[] a= {2,4,6,8,1,9,5,3,7};
	int num =10;
	findThePairs(a, num);
}

public static void findThePairs(int[] a, int num) {
	for(int i=0; i< a.length; i++){
		for(int j=i+1; j< a.length; j++) {
			if(a[i]+ a[j] == num) {
				System.out.println(a[i]+ "+" +a[j]+ ":" + num);
			}
			
		}
		

	}

}
}
