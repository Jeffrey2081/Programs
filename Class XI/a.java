import java.util.*;
class SortAlpha
{
    String sent; int n;
    SortAlpha()
    {
        n=0;
        sent="";
    }
    void acceptsent()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        sent = sc.nextLine().toUpperCase();
    }
    void sort(SortAlpha P)
    {
        String w[]= P.sent.split(" ");
        int l=w.length;
        for(int i =0;i<l;i++)
        {
            for(int j =0; j<i-l-1;j++)
            {
                if(w[j].charAt(0)>w[j+1].charAt(0))
                {
                    String t=w[j];
                    w[j]=w[j+1];
                    w[j+1]=t;
                }
            }
        }
        for(int k=0;k<l;k++)
        {
            sent=  sent + w[k] + " ";
        }
    }
    void display()
    {
        System.out.println("Sorted sentence");
        System.out.println(sent);
    }
    public static void main()
    {
        SortAlpha a = new SortAlpha();
        SortAlpha b = new SortAlpha();
        b.acceptsent();
        b.sort(a);
        b.display();
    }
}
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class a
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class a
     */
    public a()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
