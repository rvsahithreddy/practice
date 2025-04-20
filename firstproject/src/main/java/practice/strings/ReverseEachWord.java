package practice.strings;

public class ReverseEachWord {

	public void reverseWord(String str) {
		str = str.trim();
		String[] revArr = str.split(" ");
		StringBuilder newString = new StringBuilder();
		for(int i = revArr.length -1; i>=0; i--) {
			String tempWord = revArr[i];
			String tempStr = "";
			for(int j=tempWord.length()-1; j>=0; j--) {
				tempStr += tempWord.charAt(j);
			}
			System.out.println("Reverse Temp Word is:"+ tempStr);
			newString.append(tempStr+" ");
		}
		
		System.out.println(newString);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseEachWord rev = new ReverseEachWord();
		String str =  "the sky is blue";
		rev.reverseWord(str);

	}

}
