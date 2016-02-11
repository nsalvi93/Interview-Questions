import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree 
{

	 int [] heights;
    public static void main(String[] args) 
    {
       UtopianTree tree = new UtopianTree();
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter test case");
       int t = in.nextInt();
       int [] temp = new int[t];
       for(int a0 = 0; a0 < t; a0++)
        {
            System.out.println("Enter the cycle");
    		int n = in.nextInt();
             temp[a0] = tree.calculateHeight(n, t);
            
        }
       System.out.println(temp.toString());
    }

	private int calculateHeight(int n, int t) 
	{
		
		int height =1;
		int summer=0, spring=0;
		if(n%2!=0)
		{
			summer = n/2;
			spring = summer + 1;
		}
		else
		{
			summer = n/2;
			spring = n - summer;
		}
		while(summer!= 0 || spring!=0)
		{
			if(spring!=0)
			{
				height = height * 2;
				spring--;
			}
			if(summer!=0)
			{
				height = height + 1;
				summer--;
			}
		}
		return height;
		
		
		
	}
}
