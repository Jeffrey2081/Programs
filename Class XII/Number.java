class Number
{
    int n;
    Number(int nn)
    {
        n=nn;
    }
    int factorial(int a)
    {
        int i, f=1;
        for(i =1; i<=a;i++)
            f=f*i;
        return f;
    }
    void display()
    {
        System.out.println(n);
    }
}