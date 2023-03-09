import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println("");
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
        }
    }
}