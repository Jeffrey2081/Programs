import java.util.*;
class Hamming
{
    boolean isPrime(int a)
    {
        int c= 0;
        for(int i=1; i<=a; i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Hamming h=new Hamming();
        System.out.println("Enter Number to check");
        int n = sc.nextInt();
        for(int i =2; i<n; i++){
        if(h.isPrime(i) && n%i==0)
        {
            if(i==2 || i== 3 || i==5)
            {
                continue;
            }
            else
            {
                System.out.println("Not Hamming number. " + n + "is divisible by " + i);
                System.exit(0);
            }
        }
    }
    System.out.println(n +" Hamming number");
}
}