package com.cts.jsd.ui;

public class App3 {

	public static void main(String[] args) {
		String s = "parrot";
		
		String rev ="";
		/*for(int i=s.length()-1;i>=0;i--) {
			rev += s.charAt(i);
		}*/
		
		StringBuilder sb = new StringBuilder(s);
		rev = sb.reverse().toString();
		
		System.out.println(s);
		System.out.println(rev);
		System.out.println("Is Pallendrome " + s.equals(rev));
	}

}
