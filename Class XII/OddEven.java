import java.util.*;
class OddEven
{
    int a[],m;
    OddEven(int mm)
    {
        m= mm;
        a=new int[m];
    }
    void fillarray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i =0;i<m; i++)
        {
            a[i]=sc.nextInt();
        }
    }
    OddEven arrange(OddEven P,OddEven Q)
    {
        OddEven R = new OddEven(P.m +Q.m);
        int x =0, i;
        for(i=0;i<P.m; i++)
        {
            if(P.a[i]%2==1)
            R.a[x++] = P.a[i];
        }
        for(i=0;i<Q.m; i++)
        {
            if(Q.a[i]%2==1)
            R.a[x++] = Q.a[i];
        }
        for(i=0;i<P.m; i++)
        {
            if(P.a[i]%2==0)
            R.a[x++] = P.a[i];
        }
        for(i=0;i<Q.m; i++)
        {
            if(Q.a[i]%2==0)
            R.a[x++] = Q.a[i];
        }
        return R;
    }
    void display()
    {
        for(int i=0; i<m; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void main(int a, int  b)
    {
        OddEven P = new OddEven(a);
        OddEven Q = new OddEven(b);
        OddEven R = new OddEven(a+b);
        P.fillarray();
        Q.fillarray();
        R = R.arrange(P,Q);
        P.display();
        Q.display();
        R.display();
    }
}
