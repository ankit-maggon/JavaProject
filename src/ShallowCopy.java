import java.util.Arrays;

public class ShallowCopy { 
  
    private int[] data; 
  
    // makes a shallow copy of values 
    /*public ShallowCopy(int[] values) { 
        data = values; 
    } 
  */
    public ShallowCopy(int[] values) { 
        data = new int[values.length]; 
        for (int i = 0; i < data.length; i++) { 
            data[i] = values[i]; 
        } 
    }
    
    public void showData() { 
        System.out.println( Arrays.toString(data) ); 
    } 
} 