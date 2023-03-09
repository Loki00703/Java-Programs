import java.util.Scanner;
public class AddtwoArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c];
        int[][] m3 = new int[r][c];
        System.out.println("Enter the elements of first matrix.");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix.");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("The resultant matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}