 package practice.strings;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*Key Concept: condition.await() Releases the Lock
When a thread calls condition.await(), it does two things:

Releases the lock (lock.unlock()) so that another thread can acquire it.

Puts the current thread into a waiting state until another thread signals it (condition.signal()).*/

public class PrintEvenOddUsingTwoThreadsAnotherMethod {
	private int value = 1;
	private int n;
	public PrintEvenOddUsingTwoThreadsAnotherMethod(int n) {
		this.n = n;
	}
	
	private static final ReentrantLock lock = new ReentrantLock();
	private static final Condition cond = lock.newCondition();
	
	public void printEven() {
		
		while(value <= n) {
			lock.lock();
			try {
				while(value %2 != 0) {
					cond.await();
				}
				if(value <= n) {
					System.out.println("Even value is:"+value);
					value++;
				}
				cond.signal();
			}catch(InterruptedException ex) {
				
			}finally {
				lock.unlock();
			}
		}
	}
	
public void printOdd() {
		
		while(value <= n) {
			lock.lock();
			try {
				while(value %2 == 0) {
					cond.await();
				}
				if(value <= n) {
					System.out.println("Odd value is:"+value);
					value++;
				}
				cond.signal();
			}catch(InterruptedException ex) {
				
			}finally {
				lock.unlock();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
PrintEvenOddUsingTwoThreadsAnotherMethod pe = new PrintEvenOddUsingTwoThreadsAnotherMethod(n);
Thread t1 = new Thread(pe::printEven);
Thread t2 = new Thread(pe::printOdd);
t1.start();
t2.start();


	}

}
