import java.util.*;
class Lucky
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int n = sc.nextInt();
        if(n>50 || n<1)
        {
            System.out.println("invalid");
            System.exit(0);
        }
        int a[] = new int[n];
        for(int i=0; i <n; i++)
        {
            a[i]= i+1;
        }
        int b=0, c=2,o=n,i=0;
        while(c<n)
        {  
            while(b%c!=0)
            {
                b++;
                i++;
            }
            b=0;
            
        }
    }
}
