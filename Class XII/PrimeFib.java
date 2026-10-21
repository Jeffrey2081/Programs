class PrimeFib
{
    boolean isPrime(int n)
    {
        int c =0;
        for(int i= 1; i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c!=2)
        return false;
        else
        return true;
    }
    public static void main()
    {
        PrimeFib p  = new PrimeFib();
        int a=0,b=1,c=0;
        while(c<=1000)
        {
            c=a+b;
            a=b;
            b=c;
            if(p.isPrime(c))
            {
                if(c>10 && c<1000)
                {
                    System.out.print(c + " ");
                }
            }
        }
    }
}