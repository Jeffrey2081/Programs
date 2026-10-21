import java.util.*;
class Day
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int  y=sc.nextInt();
        System.out.println("Enter day");
        int d = sc.nextInt();
        System.out.println("Enter N");
        int n = sc.nextInt();
        if(d>=366||d<1||n>100||n<1)
        {
            System.out.println("Invalid☹️");
           return;
        }
        int arr[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String m[]={" ","Jan", "Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        if(y%4==0)
        arr[2]=29;
        int c =1;
        while(d>arr[c])
        {
            d=d-arr[c];
            c++;
            if(c>12)
            {c=1;
            y++;
        }}
        System.out.println(d+ m[c] + " , "+ y);
        d=d+n;
        while(d>arr[c])
        {
            d=d-arr[c];
            c++;
            if(c>12){
            c=1;
            y++;
        }
        }
        System.out.println(d+ m[c] + " , "+ y);
        
    }
}
