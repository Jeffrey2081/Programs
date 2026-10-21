import java.util.*;
class BoundSort
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][]= new int[n][n], b[] = new int[4*(n-1)],i,j,c=0;;
        for(i =0; i<n; i++)
        {
            for(j=0;j<n; j++)
            {
                a[i][j]=sc.nextInt();
                if(i==0 || j== 0 || i==n-1 || j==n-1)
                {
                b[c] = a[i][j];
                c++;
            }
            }
        }
        for(int k =0; k<c;k++)
            {
                for(j = 0; j<c-k-1; j++)
                {
                    if(b[j]>b[j+1])
                    {
                        int t = b[j];
                        b[j]=b[j+1];
                        b[j+1]=t;
                    }
                }
            }
            c=0;
            for(i =0; i<n; i++)
        {
            for(j=0;j<n; j++)
            {
                if(i==0 || j== 0 || i==n-1 || j==n-1)
                {
                b[c] = a[i][j];
                c++;
            }
            }
        }
    }
}