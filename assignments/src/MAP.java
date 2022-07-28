

import java.util.*;

public class MAP{
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
    map.put(8,"jai");    
    map.put(9,"viru");    
    map.put(10,"don");       
    
    System.out.println("\nThe elements of TreeMap are ");  
    for(Map.Entry l:map.entrySet()){    
     System.out.println(l.getKey()+" "+l.getValue());    
    	}
    }
}
	