import java.util.*;
class Evil
{
    int num;
    String bin ="";
    void acceptNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        num = sc.nextInt();
        if(num<0)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
    }
    void rec_bin(int x)
    {
        if(x==0)
        return;
        else
        {
            int r = x%2;
            x=x/2;
            bin = (char)r + bin;
            rec_bin(x);
    }
}
void check()
{
    rec_bin(num);
    int c =0;
    for(int i =0;i<bin.length();i++)
    {
        if(bin.charAt(i) ==1)
        {
            c++;
        }
    }
    if(c%2==0)
    {
        System.out.println("Evil number");
    }
    else
    System.out.println("Not evil");
}
static void main()
{
    Evil e = new Evil();
    e.acceptNum();
    e.check();
}
}