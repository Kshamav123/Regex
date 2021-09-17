package com.regex;

import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {

		String email = "^[a-z0-9+_.-]+[a-z0-9]+@[a-z]+[.][a-z]*\\.[a-z]*{2}$";
		String str = "abcgh_xyz@bridgelabz.co.in";
		System.out.println(Pattern.matches(email, str));
	}
}