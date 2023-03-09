import java.util.Scanner;
class SpyNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, pro = 1;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        while(n>0)
        {
            int rem = n % 10;
            sum = sum + rem;
            pro = pro * rem;
            n = n / 10;
        }
        if(sum == pro)
            System.out.print("The given number is a Spy number.");
        else
            System.out.print("The given number is not a Spy number.");
    }
}