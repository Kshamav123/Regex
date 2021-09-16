package com.regex;

import java.util.regex.Pattern;

public class UC1 {
  public static void main(String [] args) {
	  String pincode = "[1-9]{1}[0-9]{5}";
	  String str = "000088";
	  System.out.println(Pattern.matches(pincode, str));
  }
}
