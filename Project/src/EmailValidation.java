
import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation{

    public static void main(String[] args)
    {
        
        //arrray list to store email ids
    	ArrayList<String> emailID = new ArrayList<String>();
        int c=0;
        
        emailID.add("gaurav@fbz.com");
        emailID.add("gauravsingh@tlc.com");
        emailID.add("hero@yahi.com");
        emailID.add("heroine@gml.com");
        emailID.add("harry@hogw.com");
        emailID.add("chacha@gix.com");
        emailID.add("chachi@gmi.com");
        emailID.add("paras@ply.com");
        emailID.add("ashok@ork.com");
        emailID.add("maharana@jig.com");
        
        //string to take input from user
         String echeck = null;
         
         
        	 System.out.println("Enter the email to search");
             Scanner in = new Scanner(System.in);
             echeck = in.nextLine();
               
              
               
        
         
           for (String eloop : emailID)
           {
        	   if (eloop.equals(echeck))
        	   { 
        	      System.out.println(eloop +" is present");
        	      c=1;
        	      break;
        	   }
        	      
        	}
           // c is a flag to check if value was present in list or not.
           if (c==0)
        	   System.out.println("NOT PRESENT");
                 
    }

    }