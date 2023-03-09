import java.util.Scanner;
public class Weekday
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, rem;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        rem = n % 7;
        if(rem == 1)
            System.out.print("SUNDAY");
        else if(rem == 2)
            System.out.print("MONDAY");
        else if(rem == 3)
            System.out.print("TUESDAY");
        else if(rem == 4)
            System.out.print("WEDNESDAY");
        else if(rem == 5)
            System.out.print("THURSDAY");
        else if(rem == 6)
            System.out.print("FRIDAY");
        else
            System.out.print("SATURDAY");
    }
}