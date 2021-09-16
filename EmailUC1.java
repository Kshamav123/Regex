package com.regex;

import java.util.regex.Pattern;

public class EmailUC1 {
	 public static void main(String [] args) {
		  String email = "^[0-9a-z]+";
		  String str = "abc";
		  System.out.println(Pattern.matches(email, str));
	  }
}
