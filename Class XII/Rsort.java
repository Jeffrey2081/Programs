/*
 * m,n>2 m,n<10
 * displat matrix
 * sort rows
 * display new matrix
 * 
 */
import java.util.*;
class Rsort
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m>10 || n>10 || m<2 || n<2)
        {
            System.out.println("Invalid input");
            return;
        }
        int a[][]= new int[m][n],i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("ORIGINAL MATRIX");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(a[i][j] + " ");
            System.out.println();
        }
        for(i =0; i<m; i++)
        {
            int b[]= new int[n];
            for(j=0; j<n; j++)
            b[j]=a[i][j];
            
            for(int k =0; k<n;k++)
            {
                for(j = 0; j<n-k-1; j++)
                {
                    if(b[j]>b[j+1])
                    {
                        int t = b[j];
                        b[j]=b[j+1];
                        b[j+1]=t;
                    }
                }
            }
            
            for(j=0; j<n; j++)
            a[i][j]=b[j];
        }
        System.out.println("NEW MATRIX");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}