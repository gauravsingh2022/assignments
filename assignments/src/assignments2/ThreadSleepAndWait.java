package assignments2;

class Threads extends Thread{
	public void run(){
		System.out.println("this thread is running");
	}
}
public class ThreadSleepAndWait {

	public static void main (String[] args) throws  InterruptedException {
		// TODO Auto-generated method stub
		Threads th1=new Threads();
		
		Thread.sleep(5000);
		th1.start();
		synchronized(th1){
			th1.wait(5000);
			System.out.println("th1+");
			
		}
	}

}