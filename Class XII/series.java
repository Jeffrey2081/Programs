class series extends Number
{
    int sum;
    series(int x)
    {
        super(x);
        sum=0;
    }
    void calsum()
    {
        int i;
        for(i=1;i<=n;i++)
        sum = sum+factorial(i);
    }
    void display()
    {
        super.display();
        System.out.println(sum);
    }
    public static void main(int a)
    {
        series s = new series(a);
        s.calsum();
        s.display();
    }
}