import java.util.*;
class Date
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day, month , year");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if(month>=12 || day<0)
        {
            System.out.println("Invalid");
                return;
        
        }
        if((year%100==0 && year%400 ==0) || year%4==0)
        {
            if(month ==2&& day<=29)
            {
                System.out.println("Valid");
                return;
            }
        }
            if(month==2 && day<=28)
            {
            System.out.println("Valid");
            return;
        }
        else if(month==2)
        {
            System.out.println("Invalid");
            return;
        }
        
        if(month == 1|| month == 3 || month ==5|| month ==7 || month==8 || month == 10 || month ==12)
        {
            if(day<=31)
            {
                System.out.println("Valid");
                return;
            }
        }
        else
        {
            if(day<=30)
            {
                System.out.println("Valid");
                return;
            }
        }
        System.out.println("Invalid");
    }
}