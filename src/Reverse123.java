import java.util.Scanner;


public class Reverse123 
{
	public static void main(String args[])
	{
		int number=0;int reversed=0;
		System.out.println("Enter a number to reverse");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		reversed = reverseit(number);
		System.out.println(reversed);
	}

	public static int reverseit(int number) 
	{
		int n =0; int temp =0; int reverse =0;
		while(number!=0)
		{
			n = number % 10;
			reverse = reverse * 10 + n;
			number = number / 10;
			
			
					
		}
		return reverse;
	}
}
