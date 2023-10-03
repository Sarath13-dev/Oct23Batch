package org.login;

public class Sample4 {
	
	public static void main(String[] args) {
		
		String s = "applleejj";
		String o = "";//ap
		
		for(int i=0; i<s.length(); i++) {
			if(o.contains(String.valueOf(s.charAt(i)))) {
				System.out.println(s.charAt(i));
			}
			else {
				o = o + s.charAt(i);
			}
			
		}
		
	}

}
