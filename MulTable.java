import java.util.Scanner;
public class MulTable
{
    public static void main(String[] args)
    {
        int n,i,pro;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        n = sc.nextInt();
        for(i=1;i<=10;i++)
        {
            pro = n * i;
            System.out.println(""+pro);
        }
    }
} 