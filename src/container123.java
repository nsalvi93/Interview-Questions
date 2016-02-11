import java.util.Scanner;


public class container123 
{

	public static void main( String args[])
	{
		int n=0;
		System.out.println("Enter the numeber of values");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int array [] = new int[n];
		System.out.println("Enter the numbers");
		for(int i =0; i<n; i++)
		{
			array[i] = sc.nextInt();
		}
		CalArea(array);
		//SortArray(array);
		
				
		
	}

	public static void CalArea(int[] array) 
	{
		int area =0; int area123[] = new int[100]; int count =0;
		for(int i =0; i<array.length; i++)
		{
			for(int j =1; j<array.length; j++)
			{
				int min = min(array[i], array[j]);
				 area = mathArea(min, i, j);
				 area123[count] = area;
				 count++;
				 
			}
		}
		SortArray(area123);
		
	}

	public static int mathArea(int min, int i, int j) 
	{
		int area = min * (j - i);
		return area;
	}

	public static int min(int i, int j) 
	{
		if(i < j)
		{
			return i;
		}
		//return 0;
		else
		{
			return j;
		}
	}

	public static void SortArray(int[] array1) 
	{
		for(int i =0; i<array1.length; i++)
		{
			for(int j =i; j<array1.length; j++)
			{
			if(array1[i] > array1[j])
			{
				int temp = array1[j];
				array1[j] = array1[i];
				array1[i] = temp;
			}
			}
		}
		
		System.out.println(array1[array1.length - 1]);
		
		
	}
}
