//The below program return the index if the target no.
//is found in the sorted array or else returns the position
//if the number was present in it...
//The below can be done using only the j for loop



public class ReturnIndex 
{
	public static void main(String args[])
	{
		int [] array = {2,3,4,6};
		int target = 5;
		returnIndex( array, target);
	}

	public static void returnIndex(int[] array, int target) 
	{
		//System.out.println("Entered function");
		int flag =-1;
		for(int i =0; i< array.length; i++)
		{
			if(array[i] == target)
			{
				//System.out.println("Entered matched if");
				System.out.println(i);
				flag = 1;
				break;
			}
			
		}
			if(flag== -1)
			{
				for(int j =0; j< array.length; j++)
				{
					if(array[j] < target)
					{
						//System.out.println("Entered non matched if");
						continue;
					}
					
					else
					{
						System.out.println(j);
						break;
					}
				}
					
			}
		
		
	}
}
