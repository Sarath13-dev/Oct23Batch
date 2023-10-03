package org.login;

import java.util.Set;
import java.util.TreeSet;

public class Sample3 {
	
	public static void main(String[] args) {
		
		String s = "application";
		String r = "";
		for(int i=s.length()-1; i>=0; i--) {
			r = r + s.charAt(i);
		}
		System.out.println(r);
		if(s.equals(r)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a plaindrome String");
		}
	}

}
