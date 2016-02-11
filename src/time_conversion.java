import java.util.Scanner;

public class time_conversion 
{
	public static void main ( String args[])
	{
		StringBuffer time1 = new StringBuffer();
		System.out.println("Enter output.... ");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		String [] buffer = string.split(":");
		System.out.println("String[0] "+ buffer[0]);
		System.out.println("String[1] "+ buffer[1]);
		System.out.println("String[2] "+ buffer[2]);

		if(buffer[2].charAt(2) == 'P')
		{
			if(Integer.parseInt(buffer[0])==12)
			{
				time1.append(buffer[0]);
				time1.append(":"+ buffer[1]);
				time1.append(":"+ buffer[2].charAt(0));
				time1.append( buffer[2].charAt(1));
			}
			else
			{

				int hours = Integer.parseInt(buffer[0]) + 12;
				time1.append(hours);
				time1.append(":"+ buffer[1]);
				time1.append(":"+ buffer[2].charAt(0));
				time1.append( buffer[2].charAt(1));
			}

		}

		if(buffer[2].charAt(2) == 'A')
		{
			if(Integer.parseInt(buffer[0])==12)
			{
				time1.append("00");
				time1.append(":"+ buffer[1]);
				time1.append(":"+ buffer[2].charAt(0));
				time1.append( buffer[2].charAt(1));
			}

			else
			{
				time1.append(buffer[0]);
				time1.append(":"+ buffer[1]);
				time1.append(":"+ buffer[2].charAt(0));
				time1.append( buffer[2].charAt(1));
			}


		}
		System.out.println(time1.toString());



	}
}
