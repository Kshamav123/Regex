package com.regex;

import java.util.regex.Pattern;

public class EmailUC4 {
	 public static void main(String [] args) {
		  String email = "[_+-.0-9a-z]*";
		  String str = "9.";
		  System.out.println(Pattern.matches(email, str));
	  }
}
