import java.util.*;
class Queue
{
    int que[];
    int f,r,size;
    Queue(int cap)
    {
        que=new int[size];
        f=0;
        r=0;
    }
    void rearadd(int v)
    {
        if(r==size)
        System.out.println("Queue is full");
        else 
        que [r++]=v;
        System.out.println(r);
    }
    int popfront()
    {
         if(f==0 && r==0)
         {
             System.out.println("Underflow");
             return 9;
         }
         else 
         {
             int x =que[f++];
             if(f==r)
             {
                 f=0;
                 r=0;
             }
         return x;
        }
    }
    void display()
    {
        if(f==0 && r==0)
        System.out.println("Underflow");
        else
        {
            for(int i=f;i<r;i++)
            System.out.println(que[i]);
        }
    }
    static void main(int cap)
    {
        Queue q=new Queue(cap);
        q.display();
    }
}