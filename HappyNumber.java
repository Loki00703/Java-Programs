import java.util.Scanner;
class HappyNumber
{
    public static int isHappyNumber(int num)
    {
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int b = a;
        while(b!=1 && b!=4)
        {
            b = isHappyNumber(b);
        }
        if(b==1)
        {
            System.out.print(a+" is a happy number");
        }
        else
        {
            System.out.print(a+" is not a happy number");
        }
    }
}