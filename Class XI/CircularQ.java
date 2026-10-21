import java.util.*;
class CircularQ
{
    int cq[],f,r,cap;
    CircularQ(int max)
    {
        cap=max;
        f=0;r=0;
        cq=new int[cap];
    }
    void push(int v)
    {
        if(cap==0)
        {
            System.out.println("full");
        }
        else
        {
            cq[r]=v;
            r=(r+1)%cq.length;
            cap--;
        }
    }
    int pop()
    {
        if(cap==cq.length)
        {
            return -9999;
        }
        else
        {
            int v = cq[f];
            f=(f+1)%cq.length;
            cap++;
            if(f==r)
            {
                f=r=0;
            }
            return v;
        }
    }
    void display()
    {
        if(cap==cq.length)
        System.out.print("empty");
        else
        {
            int i = f;
            int ctr = cq.length;
            while(ctr>=cap)
            {
                System.out.print(cq[i] + " ");
                i=(i+1)%cq.length;
                ctr--;
            }
            System.out.println();
        }
    }
    static void main(int a)
    {
        CircularQ c = new CircularQ(a);
        Scanner sc = new Scanner(System.in);
        for(int i= 0;i<a;i++)
        {
            c.push(sc.nextInt());
        }
        int d = c.pop();
        
        c.display();
    }
}