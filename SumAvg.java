import java.util.Scanner;
public class SumAvg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,a,n,sum=0;
        double avg;
        System.out.print("Enter the number of numbers: ");
        n = sc.nextInt();
        System.out.println("Enter the numbers: ");
        for(i=0;i<n;i++)
        {
            a = sc.nextInt();
            sum+=a;
        }
        avg=sum/n;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+avg);
    }
}