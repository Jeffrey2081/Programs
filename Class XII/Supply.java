class Supply extends Demand
{
    int pproduced,prate;
    Supply(String a, String b, int n,int pp,int pr)
    {
        super(a,b,n);
        pproduced = pp;
        prate = pr;
    }
    double calculation()
    {
        return (pproduced-pdemand)*prate;
    }
    void display()
    {
        super.display();
        double d = calculation();
        System.out.println(d);
    }
    public static void main(String a, String b, int n,int pp,int pr)
    {
        Supply s = new Supply(a,b,n,pp,pr);
        s.display();
    }
}