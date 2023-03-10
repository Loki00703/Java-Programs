import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int rem, sum = 0, temp = n;
		while(n>0)
		{
		    int fact = 1;
		    rem = n % 10;
		    for(int i = 1; i <= rem; i++)
		    {
		        fact = fact*i;
		    }
		    sum = sum + fact;
		    n = n / 10;
		}
		if(sum == temp)
		    System.out.print(temp+" is a Peterson number.");
		else
		    System.out.print(temp+" is not a Peterson number.");
	}
}