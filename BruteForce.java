
public class BruteForce 
{
	
	public static void main(String [] args)
	{
		int [] a = {1,2,3,4};
		System.out.println(BruteForceNearlyIdentical(a));
	}
    public static int BruteForceNearlyIdentical(int[] arrayOfIntegers)
    {
    	
        int longest = 0;
        for(int i = 0; i < arrayOfIntegers.length - 1; i++){
            int count = 0;
            boolean nextPresent = false;
            for(int j = 0; j < arrayOfIntegers.length - 1; j++){
                if(arrayOfIntegers[j] == arrayOfIntegers[i]){
                    count++;
                } 
                else if (arrayOfIntegers[j] + 1 == arrayOfIntegers[i]){
                    count++;
                    nextPresent = true;
                }

                if(nextPresent){
                    longest = Math.max(count, longest);
                }
            }
        }
  
        
        return longest;
    }
    

    
 
}
