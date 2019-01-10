import java.util.Scanner;
public class Factorial 
{
	void Factori(int num)
	{
		int fact =1;
		int i;
		for (i=1;i<=num;i++)
		{
			fact = fact*i;
			System.out.println("Factorial of " + i + " is " + fact);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till what you want to know the factorial:");
		int choice = sc.nextInt();
		Factorial f = new Factorial();
		f.Factori(choice);
	}
}