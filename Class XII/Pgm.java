class Pgm
{
    int m[],size,sp;
    Pgm(int s)
    {
        size=s;
        m=new int[size];
        sp=-1;
    }
    void Push(int x)
    {
        if(sp==size-1)
        {
            System.out.println("Overflow");
            
        }
        else
        {
            sp++;
            m[sp]=x;
        }
    }
    void pop()
    {
        if(sp==-1)
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.print(m[sp] + "is deleted");
            sp--;
        }
    }
    void display(int s)
    {
        Pgm p=new Pgm(s);
        p.pop();
    }
}
