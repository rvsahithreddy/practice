package practice.strings;

import java.util.HashSet;

public class AllSubStringsShouldbeSame {

	public void subString(String str) {
		int left = 0;
		HashSet<Character> set = new HashSet<>();
		for(int right = 0; right < str.length(); right++) {
			if(!set.contains(str.charAt(right))) {
				set.add(str.charAt(right));
			}else {
				break;
			}
		}
		
		int count = set.size();
		
		String value = "";
		for(Character s:set) {
			value += s;
		}
		for(int j= count; j<=str.length()-count; j = j+count) {
			
			String value1 = str.substring(j, j+count);
			System.out.println(value1);
			if(value.equalsIgnoreCase(value1)){
				
			}else {
				System.out.println("Not a fully recursive string");
				break;
			}
		}
		System.out.println("It is a fully recursive string");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllSubStringsShouldbeSame allSub = new AllSubStringsShouldbeSame();
		String str = "abcabcabb";
		allSub.subString(str);
	}

}
