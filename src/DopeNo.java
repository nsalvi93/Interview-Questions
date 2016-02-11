//Below program finds duplicate no.s in a sorted array 
// removes them and returns the length of the new array


public class DopeNo 
{
	
	public static void main(String args[])
	{
		int count=0;
		int array[] = {1,2,2,3,3,3,4};
		int array2[] = new int[array.length];
		array2 = removeDope(array);


		for(int i =0; i<array.length; i++)
		{
			if(array2[i]!=-1)
			{
			System.out.println(array2[i]);
			count++;
			
			}
		}
		
		System.out.println("Length is "+ count);
	}

	public static int [] removeDope(int[] array) 
	{
		for(int i =0; i< array.length-1; i++)
		{
			if(array[i]==array[i+1])
			{
				for(int j =i+1; j<array.length; j++)
				{
					if(array[i]==array[j])
					{
						array[j] = -1;
					}
				}
			}
		}
		
		return array;
	}

}
