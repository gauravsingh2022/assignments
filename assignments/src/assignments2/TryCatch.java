package assignments2;

public class TryCatch {
	 

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      int arr[]= {10,20,45,57,65};
	      try {
	    	  int res=100/arr[5];
	    	  System.out.println("the result is "+res);
	      }catch(ArithmeticException e) {
	    	  System.out.println("divided by zero"+e);
	      }catch(ArrayIndexOutOfBoundsException e) {
	    	  System.out.println("Array index"+e);
	      }finally {
	    	  System.out.println("finally block");
	      }
	      System.out.println("done");
		}

}
