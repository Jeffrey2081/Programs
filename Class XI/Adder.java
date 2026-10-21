import java.util.*;
class Adder
{
    int a[]=new int[2];
    Adder()
    {
        a[0]=0;
        a[1]=0;
    }
    void readtime()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours");
        a[0]=sc.nextInt();
        System.out.println("Enter minutes");
        a[1]=sc.nextInt();
        if(a[1]>60)
        {
        a[0]+=a[1]/60;
        a[1]%=60;
        
    }
    }
    void addtime(Adder X, Adder Y)
    {
        this.a[0]=X.a[0] + Y.a[0];
        this.a[1]=X.a[1] + Y.a[1];
            if(a[1]>=60)
        {
        a[0]+=a[1]/60;
        a[1]%=60;
        
    }
    }
    void disptime()
    {
        System.out.println("Hours: " + a[0] + "\nMinutes: " + a[1]);
    }
    public static void main()
    {
        Adder A = new Adder();
        Adder B = new Adder();
        Adder C = new Adder();
        B.readtime();
        C.readtime();
        A.addtime(B,C);
        A.disptime();
    }
    }
