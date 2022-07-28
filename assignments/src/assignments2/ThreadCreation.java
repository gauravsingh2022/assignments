package assignments2;
//extending the thread class
class Threads1 extends Thread{
	public void run(){
		System.out.println("this thread is running");
	}
}
public class ThreadCreation {
   public static void main(String args[]) {
	   Threads1 th=new Threads1();
	   th.start();
   }
}