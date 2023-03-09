import java.util.Scanner;
class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,rev=0;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        while(n>0)
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.print("The reverse of the number is: "+rev);
    }
}



