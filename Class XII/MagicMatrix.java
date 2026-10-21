import java.util.*;
class MagicMatrix
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]= new int[n][n];
        if(n%2==0)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            int j=n-1;
            for(int i=0;i<n/2;i++)
            {
                int t=a[i][i];
                a[i][i]=a[j][j];
                a[j][j]=t;
                int s=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=s;
                j--;
            }
            for(int i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
        else
        {
            for(int i =0;i<n;i++)
            for( int j=0;j<n;j++)
            a[i][j]=0;
            int i=0;int j=n/2;int k=1;
            while(k<=n*n)
            {
                a[i][j]=k++;
                i--;
                j++;
                if(i<0&&j>n-1)
                {
                    i=i+2;
                    j--;
                }
                else if(i<0)
                i=n-1;
                else if(j>n-1)
                j=0;
                else if(a[i][j]>0)
                {
                    i=i+2;
                    j--;
                }
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
    }
}