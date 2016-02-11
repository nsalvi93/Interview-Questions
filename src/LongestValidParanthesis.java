//find the longest valid well formed paranthesis

public class LongestValidParanthesis 
{
	public static void main(String args[])
	{
		String para = "(((()))()()()))((())";
		FindLongestSub(para);
	}

	public static void FindLongestSub(String para) 
	{
		int marker=-1, count=0;
		for(int i =0; i< para.length(); i++)
		{
			System.out.println("Entered i for loop with i value "+ i);
			if(para.charAt(i)=='(')
			{
				System.out.println("valid start para at  "+ i);
				marker = 1;
				count = count +1;
			}
			
			else
			{
				continue;
			}
			
			for(int j = i+1; j< para.length(); j++)
			{
				System.out.println("Entered j for loop with j value "+ j);
				if(para.charAt(j)==')')
				{
					System.out.println("valid end para at  "+ j);
					marker =0;
					count = count+1;
					i = j;
					break;
				}
				
				else
				{
					continue;
				}
			
			}
		
		}
		
		System.out.println(count);
	}

}
