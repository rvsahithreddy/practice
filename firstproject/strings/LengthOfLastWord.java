package practice.strings;

public class LengthOfLastWord {

	public void lengthLastWord(String str) {
		String[] strArr = str.split(" ");
		System.out.println(strArr[strArr.length-1].length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthOfLastWord len = new LengthOfLastWord();
		String str = "luffy is still joyboy";
		len.lengthLastWord(str);
	}

}
