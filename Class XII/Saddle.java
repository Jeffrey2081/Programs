import java.util.*;
class Saddle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int m=sc.nextInt();
        int a[][]=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            int min=a[i][0];
            int max=a[i][0];
            int r;int c;
            for(int j=0;j<m;j++)
            {
                if(a[i][j]<min)
                {
                    min=a[i][j];
                }
                r=i;c=j;
                for(int k=0;k<m;k++)
                {
                    if(a[k][c]>max)
                    {
                        max=a[k][c];
                        if(min==max)
                        {
                            System.out.println("Saddle point"+r+" "+c);
                            System.exit(0);
                        }
                    }
                    System.out.println("no saddle point");
                }
            }
        }
    }
}
