package com.regex;

import java.util.regex.Pattern;

public class EmailUC5 {
	public static void main(String [] args) {
		  String email = "[a-z]{2}";
		  String str = "au";
		  System.out.println(Pattern.matches(email, str));
}
}