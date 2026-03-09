package MultiThreading;

public class Timer implements Runnable {
 
	public void run() {
		try {
			int seconds=0;
			Thread.currentThread().sleep(1000);
			seconds+=1;
			System.out.println(seconds);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Thread t1=new Thread();
		t1.start();
	
	}
}


