package com.regex;

import java.util.regex.Pattern;

public class EmailUC3 {
	 public static void main(String [] args) {
		  String email = ".co|com";
		  String str = ".co";
		  System.out.println(Pattern.matches(email, str));
	  }
}
