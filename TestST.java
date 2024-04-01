import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Random;

public class TestST 
{
	public static void main(String [] args)
	{
		test(10);
		test(100);
		test(1000);
		test(10000);
		test(100000);
		
	}
	
	 public static void test(int length)
	    {
		 
		 
		 int [] a = randomArray(length);
		 Hashing hashing = new Hashing();
	    	Instant start = Instant.now();
	    	
	    	
	        int result = hashing.HashMapNearlyIdentical(a);
	        
	        Instant finish = Instant.now();
	        long timeElapsed = Duration.between(start, finish).toNanos();
			//Convert to milliseconds
			double timeElapsedMs = (double) timeElapsed / 1000000.0;
	        System.out.println("Time Elapsed: " + timeElapsedMs);

	        
	        
	    }
	 public static int [] randomArray(int length)
		{
			int [] a = new int[length];
			Random random = new Random();
			for(int i = 0; i < a.length; i++)
			{
				a[i] = random.nextInt(10) + 1;
			}
			
			
			
			return a;
		}

}
