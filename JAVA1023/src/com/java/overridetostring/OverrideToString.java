package com.java.overridetostring;

class StringC {
	String a;
	String b;

	public StringC(String str1, String str2) {
		// TODO Auto-generated constructor stub
		a = str1;
		b = str2;
	}

	public String toString() {
		return a + b;
	}
}

public class OverrideToString {
	public static void main(String[] args) {
		StringC s = new StringC("cool", "java");
		System.out.println(s);
	}
}
