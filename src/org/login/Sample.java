package org.login;



public class Sample {

	public static void main(String[] args) {
		int a = 12345;
		int r = 0;
		int temp = a;
		int count = 0;
		int sum = 0;
		while(a>0){
		int b = a/10;
		int c = a%10;
		r = c + (r*10);
		count++;
		sum = sum + c;
		a=b;
		}
		
		System.out.println(r);
		if(temp==r) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}
		System.out.println("the no of digits "+ count);
		System.out.println("the sum of digits "+ sum);
	}

}
