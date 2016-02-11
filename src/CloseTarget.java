import java.util.Collections;

//Out of given array of no.s the following program finds
// 3 no.s whose sum is closest to the target


public class CloseTarget 
{
	public static void main(String args[])
	{
		int [] array = {5,4,2,1,3};
		int target =2;
		int[] array2 = new int[array.length];
		array2 = sortArray(array);
		//printArray(array2);
		int [] array1 = new int [3];
		array1 = closestTarget(array2, target, array1);
		printArray(array1);
		
	}

	public static void printArray(int[] array2) 
	{
		for(int i =0; i<array2.length; i++)
		{
			System.out.println(array2[i]);
		}
		
	}

	public static int[] sortArray(int[] array) 
	{
		int temp =0;
		for(int i=0; i<array.length-1; i++)
		{
			for(int j = i+1; j< array.length; j++ )
			{
				if(array[j] < array[i])
				{
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

	public static int[] closestTarget(int[] array, int target, int[] array1) 
	{	
		int count =0; 
		
				for(int i =0; i< array.length; i++)
					
				{
					for(int j =i+1; j< array.length; j++)
					{
						for(int k = i+2; k< array.length; k++)
						{
								int temp = array[i] + array[j] + array[k];
		
						
								
								if(temp > count && temp< target || temp < count && temp > target  )
						{
									if(array[i]!= array[j] && array[i]!= array[k] && array[j]!=array[k])
									{
										count = array[i] + array[j] + array[k];
										array1[0] = array[i];
										array1[1] = array[j];
										array1[2] = array[k];
						
									}
									
						}
							
							
						}
					}
				}
					
		
		return array1;
	}
}
