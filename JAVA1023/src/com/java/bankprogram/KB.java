package com.java.bankprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KB {
	public static String scan() {

		// TODO Auto-generated method stub
		String str = "";
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(
					System.in));
			str = buf.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return str;
	}
}
