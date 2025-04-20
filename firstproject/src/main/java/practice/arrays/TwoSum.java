package practice.arrays;

import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//input [2,7,11,15] , target = 9
//output[0,1]
//input[0] = 2, input[1] = 7 2+7 = 9
public class TwoSum {
	
	//brute force
	public void bruteForce() {
		int[] input = {2,7,11,15};
		int target = 9;
		for(int i=0; i< input.length-1; i++) {
			for(int j = i+1; j < input.length; j++) {
				if(input[i] + input[j] == target) {
					System.out.println("Pair is:"+i+","+j);
				}
			}
		}
	}
	
	//optimal solution
	public void optimal1() {
		int[] input = {2,7,11,15};
		int target = 9;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i< input.length; i++) {
			int temp = input[i];
			int val = target - temp;
			if(map.containsKey(temp)) {
				int index = map.get(temp);
				System.out.println("Pair is:"+index+","+i);
			}else {
				map.put(val, i);
			}
		}
	}
	
	//using two pointer technique 
	public void approach2() {
		int[] input = {2,7,11,15};
		int target = 9;
		int left = 0;
		int right = input.length-1;
		
		while(left < right) {
			
			int val = input[left] + input[right];
			
			if(val == target) {
				System.out.println("Pair is:"+left+","+right);
				break;
			}else if(val > target) {
				right--;
			}else {
				left++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum two =  new TwoSum();
		two.bruteForce();
		two.optimal1();
		two.approach2();
	}

}
