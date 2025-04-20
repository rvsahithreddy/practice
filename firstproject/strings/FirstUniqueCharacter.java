package practice.strings;

public class FirstUniqueCharacter {

	public void firstUniqueChar(String str) {
		for(int i =0; i<str.length(); i++) {
			int count = 0;
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println(i);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		FirstUniqueCharacter firstUniq = new FirstUniqueCharacter();
		String str =  "loveleetcode";
		firstUniq.firstUniqueChar(str);
	}

}
