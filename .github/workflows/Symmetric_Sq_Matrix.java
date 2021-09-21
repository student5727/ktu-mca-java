package instruction;
import java.util.*;
class Symmetric_Sq_Matrix
{
    public static void main(String args[])
    {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter side of square matrix");
        int n=in.nextInt();
        while(n<2||n>10)
        {
            System.out.println("Wrong Input\nReEnter Number");
            n=in.nextInt();
        }
        System.out.println("Enter Numbers In Matrix");
        int arr[][] =new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int e=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            { 
                if(arr[i][j]==arr[j][i])
                   e++;
            }
        }
        if(e==n*n)
           System.out.println("\nIs a Symmetric Matrix");
        else
           System.out.println("\n Is not a Symmetric Matrix");
    }
}
