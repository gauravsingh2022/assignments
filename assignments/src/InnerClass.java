import java.util.*;
public class InnerClass{

		 private String msg="Welcome back gaurav"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning codding");}  
		 }  


		public static void main(String[] args) {

			InnerClass obj=new InnerClass();
			InnerClass.Inner in=obj.new Inner();  
			in.hello();  
		}
	}

