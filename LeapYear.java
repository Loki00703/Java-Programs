import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        int yr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        yr=sc.nextInt();
        if(yr%4==0)
        {
            if(yr%100==0 && yr%400!=0)
                System.out.println("It is not a Leap Year.");
            else
                System.out.println("It is a Leap Year");
        }
        else
            System.out.println("It is not a Leap Year");
    }
}