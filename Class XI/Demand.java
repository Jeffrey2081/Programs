class Demand
{
    String pid, pname;
    int pdemand;
    Demand(String a, String b, int n)
    {
        pid = a;
        pname = b; 
        pdemand = n;
    }
    void display()
    {
        System.out.println("Product id: " + pid +"\nProduct name: " + pname + "\nDemand: " + pdemand);
    }
    
}