package practice.strings;

public class ReverseWords {

	public void reverseWord(String str) {
		str = str.trim();
		String[] reverseStr = str.split(" ");
		StringBuilder newRevereStr = new StringBuilder();
		
		for (int i = reverseStr.length -1; i >=0; i--) {
			newRevereStr.append(reverseStr[i]+" ");
		}
		System.out.println(newRevereStr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWords reverse = new ReverseWords();
		String str =  "the sky is blue";
		reverse.reverseWord(str);
				
	}

}
