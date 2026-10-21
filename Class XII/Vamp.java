import java.util.*;
class Vamp
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter m and n");
       int m=sc.nextInt();
      // int n=sc.nextInt();
       int A[]=new int [4];
      // for(int i=m;i<=n;i++)
      // { 
          int k=0;
           int fl=0;
           int z=0;
           int x=m;
            int v=m;
         while(x>0)
           {
               int d=x%10;
               x=x/10;
               A[k++]=d;
           }
          int B[]=new int [16];
           int p=0;
           for(int q=0;q<4;q++)
           {
               z=A[q];
               for(int w=0;w<4;w++)
               {
                   B[p++]=(10*z)+A[w];
               }
           }
           for(int e=0;e<4;e++)
           {
               for(int r=0;r<4;r++)
               {
                   if((B[e]*B[r]==v))
                   {
                       fl=1;
                       break;
                   }
               }
               if(fl==1)
               break;
           }
           if(fl==1)
           {
               System.out.print(v+"   ");
           }
       }
    }
//}