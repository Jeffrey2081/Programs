import java.util.*;
class EqMat
{
    int a[][],m,n;
    EqMat(int mm, int nn)
    {
        m=mm;n=nn;
        a=new int[m][n];
    }
    void readArray()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    int check(EqMat P, EqMat Q)
    {
        for(int i =0;i<m;i++)
        {
            for(int j = 0; j<n;j++)
            {
                if(P.a[i][j] != Q.a[i][j])
                return 0;
            }
        }
        return 1;
    }
    void print()
    {
        for(int i =0;i<m;i++)
        {
            for(int j =0; j<n;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(int a, int b)
    {
        EqMat P = new EqMat(a,b);
        EqMat Q = new EqMat(a,b);
        P.readArray();
        Q.readArray();
        if(P.check(P,Q) ==1)
        System.out.print("EqMat");
        else
        System.out.print("Not EqMat");
        P.print();
        Q.print();
    }
    }
