package com.regex;

import java.util.regex.Pattern;

public class EmailUC2 {
	 public static void main(String [] args) {
		  String email = "@[a-z]+";
		  String str = "@bridgelabz";
		  System.out.println(Pattern.matches(email, str));
	  }
}
