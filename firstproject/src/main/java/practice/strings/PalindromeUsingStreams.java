package practice.strings;

import java.util.stream.IntStream;

public class PalindromeUsingStreams {
 
	public void palindromeStream(String str) {
	Boolean	 value = IntStream.range(0, str.length()/2).allMatch(i -> str.charAt(i) == str.charAt(str.length()-i-1));
	
	if(value == true) {
		System.out.println("It is palindrome");
	}else {
		System.out.println("It is not a palindrome");
	}
	
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PalindromeUsingStreams pus = new PalindromeUsingStreams();
		String str = "madam";
		pus.palindromeStream(str);
	}

}
