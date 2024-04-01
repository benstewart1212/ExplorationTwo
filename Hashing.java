import java.util.*;

public class Hashing 
{
	public static void main(String [] args)
	{
		int [] a = {1,2,3,4};
		
		System.out.println(HashMapNearlyIdentical(a));
	}
    public static int HashMapNearlyIdentical(int[] a)
    {
    	
    	
    	
        HashMap<Integer, Integer> H = new HashMap<>(a.length);
        
      
        for(int value = 0; value < a.length - 1; value++)
        {
            H.put(value, H.getOrDefault(value,0) + 1);
        }

        int longest = 0;
        
        for(int key : H.keySet())
        {
            if(H.containsKey(key + 1))
            {
                longest = Math.max(longest, H.get(key)+(int) H.get(key +1));
            }

        }
        
        
        return longest;
    }
    
    
	
}
