
public class CallByValue {


		   public static void swap(Integer i1, Integer j2)  
		   { 
		    
		      i1 = j2; 
		      j2 = i1; 
		   } 
		   public static void main(String[] args)  
		   { 
		      Integer i = new Integer(10); 
		      Integer j = new Integer(20); 
		      swap(i, j); 
		      System.out.println("i = " + i + ", j = " + j); 
		   } 

	}


