package practice.strings;

import java.util.concurrent.locks.ReentrantLock;

public class PrintEvenOddUsingTwoThreads {
	int value = 1;
	private int n;
	public PrintEvenOddUsingTwoThreads(int n) {
		this.n = n;
	}
	
	private static ReentrantLock lock = new ReentrantLock();
	
	public void evenNumber() {
		if(value <n ) {
			if(value %2 == 0) {
				lock.lock();
				System.out.println("Even value is:"+value);
				value++;
				lock.unlock();
				oddNumber();
			}
		}	
	}
	
	public void oddNumber() {
		if(value <n ) {
			if(value %2 != 0) {
				lock.lock();
				System.out.println("Odd value is:"+value);
				value++;
				lock.unlock();
				evenNumber();
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;

		PrintEvenOddUsingTwoThreads pevnodd = new PrintEvenOddUsingTwoThreads(n);
		
		Thread t1 = new Thread(pevnodd::evenNumber);
		
		Thread t2 = new Thread(pevnodd::oddNumber);
		
		t1.start();
		t2.start();
	}

}
