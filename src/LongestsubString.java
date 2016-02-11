import java.util.Scanner;


public class LongestsubString 
{
	public static void main(String args[])
	{
		String string;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		string = sc.next();
		System.out.println(string);
		int stringcount = LengthString(string);
		System.out.println("Length of Longest string is "+ stringcount);
		
		
	}

	public static int LengthString(String string) 
	{
		int count =0;
		if(string.length()==1 || string.charAt(0)==string.charAt(1))
		{
			return count+1;
		}
		for(int i =1; i<string.length(); i++)
		{
			//System.out.println("Entered i loop with i value "+ i);
			for(int j = i-1; j>=0; j-- )
			{
				//System.out.println("Entered j loop with j value "+ j);
				if(string.charAt(i)== string.charAt(j))
				{
					//System.out.println("Entered if");
					
					
					return i;
					
					
				}
				else
				{
					//System.out.println("Entered else");
					//count = count + 1;
					count = i+1;
				}
			}
			
		}
		return count;
		
	}
	
}
