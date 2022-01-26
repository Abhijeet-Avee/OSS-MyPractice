package day1;

public class Hello {
	public static void main(String args[])
	{
		int sum = 0;
		for(int i=0; i<args.length; i++)
		{
			sum+= Integer.parseInt(args[i]);
		}
		System.out.println("Sum of numbers: "+ sum);
	}
}
