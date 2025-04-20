package practice.strings;

public class IndexOfFirstOccurance {

	public void firstOccurance(String haystack, String needle) {
		
		char firstNeedle = needle.charAt(0);
		int i =0;
		for( i=0; i< haystack.length(); i++) {
			if(haystack.charAt(i) == firstNeedle) {
				break;
			}
		}
		System.out.println("i value is:"+i);
		System.out.println(haystack.substring(i, (i+needle.length())));
		if(haystack.substring(i, (i+needle.length())).equals(needle)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndexOfFirstOccurance indexOfFirst = new IndexOfFirstOccurance();
		String haystack = "sadbutsad";
		String needle = "but";
		indexOfFirst.firstOccurance(haystack, needle);
	}

}
