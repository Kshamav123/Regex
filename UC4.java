package com.regex;

import java.util.regex.Pattern;

public class UC4 {
	 public static void main(String [] args) {
		  String pincode = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		  String str = "400 488";
		  System.out.println(Pattern.matches(pincode, str));
	  }
}
