import java.util.*;
class Alliquot
{
    int sum(int n)
    {
        int s=0;
        for(int i= 1; i<n; i++)
        {
            if(n%i==0)
            s+=i;
        }
        return s;
    }
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Alliquot a = new Alliquot();
        System.out.print(num + " ");
        while(a.sum(num)>0)
        {
            System.out.print(a.sum(num) + " ");
            num =a.sum(num);
        
        }
        System.out.print("0");
    }
}