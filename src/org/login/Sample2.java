package org.login;

public class Sample2 {
	
	
	public static void main(String[] args) {
		
		int [] a = {10, 7, 99, 6, 2};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int a1: a) {
			System.out.print(a1+" ");
		}
		System.out.println();
		//Find the nth max nth min
		System.out.println("the first max "+a[0]);
		System.out.println("the second max "+ a[1]);
		
		System.out.println("the first min "+ a[a.length-1]);
	}

}
