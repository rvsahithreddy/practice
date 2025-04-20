package practice.strings;

public class FindMissingNaturalNumbers {

	public void findMisssingNumbers(int[] arr) {
		int leng = 5;
		int sum = (leng*(leng+1))/2;
		int sumVal = 0;
		int sumProd = 0;
		System.out.println("Total Sum is:"+sum);
		for(int val: arr) {
			sumVal += val;
			sumProd += val*val;
		}	
		int sumSq = (leng*(leng+1) *(2*leng+1))/6;
		
		int sumRemainXSumY = sum - sumVal;
		int prodRemainXSqY = sumSq - sumProd;
		System.out.println("Sum value is:"+ sumRemainXSumY);
		System.out.println("Prod Value remain is:"+prodRemainXSqY);
		int prodRemainXProdY = ((sumRemainXSumY*sumRemainXSumY) - prodRemainXSqY)/2;
		System.out.println("Prod XY is:"+prodRemainXProdY);
		//finding value
		int  sqrtValue = (int) Math.sqrt((sumRemainXSumY*sumRemainXSumY)- 4*prodRemainXProdY);
		
		int value1 = (sumRemainXSumY + sqrtValue)/2;
		int value2 = (sumRemainXSumY - sqrtValue)/2;
		System.out.println("Value1 is:"+ value1);
		System.out.println("Value2 is:"+ value2);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5};
		FindMissingNaturalNumbers findMissing = new FindMissingNaturalNumbers();
		findMissing.findMisssingNumbers(arr);
	}

}
