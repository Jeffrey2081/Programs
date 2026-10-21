import java.util.*;
class Deque
{
    int q[], f,r,size;
    Deque(int m)
    {
        size = m;
        f=0;
        r=0;
        q=new int[size];
    }
    void AddRear(int n)
    {
        if(r==size)
        {
            System.out.println("Overflow from rear");
        }
        else
        {
            q[r++]=n;
        }
    }
    void AddFront(int n)
    {
        if(f==0)
        System.out.println("Overflow at the front");
        else
        q[--f]=n;
    }
    int popRear()
    {
        if(f>r)
        {
            System.out.println("Underflow");
            return -99;
        }
        else
        {
            int d = q[--r];
            if(f==r)
            {
                f=0; r=0;
            }
            return d;
        }
    }
    int popFront()
    {
        if(f>r)
        {
            System.out.println("Underflow");
            return -99;
        }
        else
        {
            int d = q[f++];
            if(f==r)
            {
                f=0; r=0;
            }
            return d;
        }
    }
    void display()
    {
        if(f>r)
        System.out.println("Array is empty");
        else
        {
            for(int i =f; i<r; i++)
            {
                System.out.print(q[i] + " ");
            }
        }
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Deque d = new Deque(sc.nextInt());
        System.out.println("Enter number of runs");
        int n= sc.nextInt();
        for(int i =0; i<n; i++)
        {
            System.out.println("Enter choice \n1-AddFront\n2-AddRear \n3-PopFront \n4-PopRear \n5-Display array");
            int a = sc.nextInt();
            switch(a)
            {
                case 1:
                    d.AddFront(sc.nextInt());
                    break;
                case 2:
                    d.AddRear(sc.nextInt());
                    break;
                case 3:
                    int b = d.popFront();
                    break;
                case 4:
                    int c = d.popRear();
                    break;
                case 5:
                    d.display();
            }
        }
    }
}