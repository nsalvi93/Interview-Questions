//Binary search algorithm complexity: O(n)


public class BinarySearch 
{
	public static void main(String args[])
	{
		int [] array = {1, 4, 5, 6, 10, 14};
		int number = 5;
		int start =0;
		int end = array.length;
		int indicator = -1;
		
		System.out.println("End value before function "+ end);
		System.out.println("Start value before function "+ start);
		
		indicator = BinarySearch1(array, number, start, end);
		
		if(indicator == -1 )
		{
			System.out.println("Element not found");
			
		}
		else
		{
			System.out.println("Element is at "+ indicator +" position " );
		}
	}

	public static int BinarySearch1(int[] array, int number, int start, int end) 
	{
		System.out.println("Entering function");
		
		if(end >= start )
		{
			System.out.println("End value "+ end);
			System.out.println("Start value "+ start);
			
			
			int m =  (end+start)/2;
			
			System.out.println("Value of m "+ m);
		
			
			if(number == array[m])
			{
				System.out.println("Entered if since number equal");
				return m;
			}
			
			if(number < array[m])
			{
				System.out.println("Entered if since number "+ number +" was less than "+ array[m]);
				return BinarySearch1(array, number, start, m-1);
			}
			
			else
			{
				System.out.println("Entered if since number "+ number +" was greater than "+ array[m]);
				return BinarySearch1(array, number, m+1, end);
			}
			
			
		}
		
		return -1;
		
	}
}
