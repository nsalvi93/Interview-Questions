import java.util.Scanner;
public class LongestPalin 
{
	public static void main(String args[])
	{
		String string; int justone =0;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		string = sc.next();
		if(string.length()== 1)
		{
			 justone = 1;
			 System.out.println("Length of the longest substring palindrome is 1");
		}
		if(justone == 0)
		{
		findLongestPalin(string);
		}
		
	}

	public static int findLongestPalin(String string) 
	{
		int length =1; String temp; int check =0;
		for(int i=0; i<string.length()- 1; i++)
		{
			System.out.println("Entered i loop for "+ i + " time");
			
			for(int j=i+1; j<string.length(); j++)
			{
				System.out.println("Entered j loop for "+ j + " time");
				
				if(string.charAt(i)== string.charAt(j))
				{
					System.out.println("Entered first if");
					check = checkpalin(string, i , j);
					System.out.println("Value of check is "+ check);
					
					if(check==1 && length <= j-i+1 )
					{
						 length = j-i+1;
						 System.out.println("Current longest length is "+ length);
						 
						 if(length == string.length())
						 {
							 System.out.println("Length of the longest substring palindrome is "+ length);
							 return 0;
						 }
					}
				}
				
			}
		}
		if(check == 1)
		{
			System.out.println("No palin was found");
			//length = 1;
		}
		
		System.out.println("Length of the longest substring palindrome is "+ length);
		return 0;
	
			
	}

	public static int checkpalin(String string, int i, int j) 
	{
		System.out.println("Entered function check palin");
		System.out.println("String in question "+ string);
		int x=0,y=0,flag=0;
		for( x=i,  y=j; x<=j&& y>=i; x++, y-- )
		{
			if(string.charAt(x) == string.charAt(y))
			{
				 flag =1;
				 System.out.println("Match found for "+ string.charAt(x) +" and "+ string.charAt(y));
			}
			else
			{
				flag =0;
				System.out.println("Match not found for"+ string.charAt(x) +" and "+ string.charAt(y));
				break;
			}
		}
		
		return flag;
	}

	public static void displayString(int start, int end, String string) 
	{
		for(int i = start; i<= end; i++)
		{
			System.out.println(string.charAt(i));
		}
		
	}
}
