import java.util.*;
class Stack
{
    int size, top,ctr;
    String st[];
    Stack()
    {
        size =0; top=0; ctr=0;}
    Stack(int cap)
    {
        size = cap;
        st=new String[size];
        top=-1;
    }
    void pushname(String n)
    {
        if(top==size-1)
        {
            System.out.println("Overflow");
        }
        else
        {
            top++;
            st[top]=n;
        }
    }
    String popname(){
        if(top==-1)
        {
            System.out.println("Underflow");
            return " ";
        }
        else{
            String a = st[top];
            top--;
            return a;
        }
    }
    void display()
    {
        for(int i=top; i>=0; i--)
        System.out.println(st[i]);
    }
    static void main(int s,String a)
    {
        Scanner sc = new Scanner(System.in);
        Stack St = new Stack(s);
        for(int i =0; i<s; i++)
        {
            St.st[i]=sc.next();
        }
        St.pushname(a);
        String ret =St.popname();
        System.out.println(ret);
        St.display();
    }
    }
