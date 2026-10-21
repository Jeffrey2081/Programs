import java.util.*;
class Bin
{
    int Adno[] =new int[5];
    int binSearch(int l, int u, int v)
    {
        int m = (l+u)/2;
        if(m==l && Adno[m] !=v)
        return 0;
        else
        {
            if(Adno[m]>v)
            return binSearch(l,m,v);
            else if(Adno[m]<v)
            return binSearch(m,u,v);
            else
            return 1;
        }
        
    }
    public static void main(int v)
    {
         Bin b = new Bin();
         Scanner sc = new Scanner(System.in);
         for(int i =0; i<5;i++)
         
         {
             b.Adno[i]= sc.nextInt();
         }
         if(b.binSearch(0,4,v)==1)
         System.out.println("Yes");
         else
         System.out.println("no");
    }
}