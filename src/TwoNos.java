import java.util.Scanner;


public class TwoNos {

	public static void main(String args[])
	{
		System.out.println("How big you want array ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter "+ size +" nos ");
		
		
		for(int i =0; i<size; i++)
		{
			array[i] = sc.nextInt();
		}
		//displayArray(array);
		System.out.println("Enter the target ");
		int target = sc.nextInt();
		int array2[] = twoSum(array, target);
		displayArray(array2);
		
	}

	public static int[] twoSum(int[] array, int target) 
	{
		int array1[] = new int[2];
		for(int i =0; i<array.length ; i++)
		{
			System.out.println("Enter i for loop with value of i "+ i);
			for(int j=i+1; j<array.length; j++)
			{
				System.out.println("Enter j for loop with value of j "+ j);
				if((array[i] + array[j])== target && i<j)
				{
					System.out.println("Enter if  with value of i "+ i+"value of j "+ j);
					array1[0] = i+1;
					array1[1] = j+1;
				}
			}
		}
		return array1;
		
	}

	public static void displayArray(int[] array) 
	{
		System.out.println("Elements are ");
		for(int i =0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		
	}
	
}
