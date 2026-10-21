import java.util.*;
class Factory
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of boxes");
        int n = sc.nextInt();
        if(n>5000)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        int total=0,i=0;
        int a[] = {58,24,14};
        while(n>0 && i<3)
        {
            System.out.println((n/a[i])+"*" + a[i]);
            total+=n/a[i];
            n=n%a[i];
            i++;
            if(n<=6)
        {
            System.out.println(n+"*1="+ n);
            total+=1;
            n=0;
        }
            if(n<14 && n!=0)
            {
            total+=1;
            
        }
        
        }
        System.out.println("Total number of cartons: "+total);
    }
}
