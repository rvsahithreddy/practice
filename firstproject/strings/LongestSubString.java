package practice.strings;

import java.util.HashSet;

public class LongestSubString {

	public void longestSubStr(String s) {
		
		 HashSet<Character> set = new HashSet<>();
	        int left = 0, maxLength = 0;

	        for (int right = 0; right < s.length(); right++) {
	            while (set.contains(s.charAt(right))) {
	                set.remove(s.charAt(left));
	                left++;
	            }
	            set.add(s.charAt(right));
	            maxLength = Math.max(maxLength, right - left + 1);
	        }
System.out.println(maxLength);
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubString longStr = new LongestSubString();
		String str = "abbabcbb";
		longStr.longestSubStr(str);
	}

}
