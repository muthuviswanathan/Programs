import java.util.Scanner;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Upper Limit");
		int ulimit = in.nextInt();
		int start = 0;
		int next = 1;
		int inc;
		for (inc=0; inc <= ulimit; inc++)
		{
			System.out.println(start);
			int tot = start + next;
			start = next;
			next = tot;
		}
	}
}