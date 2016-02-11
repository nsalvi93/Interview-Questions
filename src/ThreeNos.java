//The below program finds 3 such nos. from array who sum is equal to
// 0 and sorts them in ascending order and returns them

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ThreeNos 
{
	public static void main(String args[])
	{
		int n=0;
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		System.out.println("Enter the length");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int array[] = new int[n];
		int array1[] = new int[n];
		System.out.println("Enter numbers");
		for(int i =0; i< array.length; i++)
		{
			array[i] = sc.nextInt();
		}
		
		//array1 = sortarray(array);
		
		/*for(int i =0; i<array1.length; i++)
		{
		System.out.println(array1[i]);
		}*/
		 
		 
		 
		// sumIt(array1, n);
		
	
	list2 = threeSum(array);
	//System.out.println(list2);
	
	}

	 public static ArrayList threeSum(int[] array1)
	 {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0,1);
		list.add(1,1);
		list.add(2,1);
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		for(int i =0; i< array1.length; i++)
		{
			for(int j =i+1; j< array1.length; j++)
			{
				
				for(int k = j+1; k< array1.length; k++)
				{
					if( array1[i] + array1[j] + array1[k] == 0)
					{
						//System.out.println("value of i j k elements "+ array1[i] +" "+ array1[j] +" "+ array1[k]);
						
						list.set(0,array1[i]);
						list.set(1,array1[j]);
						list.set(2,array1[k]);
						Collections.sort(list);
						System.out.println(list);
						//list1.add(list);
						//System.out.println(list1);
						
						
					}
				}
			}
			
		}
		 
		 return list1;
	        
	    }
	
}
