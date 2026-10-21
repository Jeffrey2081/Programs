/*
 alternetae capitals only - A ,C E, CHAR MAX
 no repetitions
 */
import java.util.*;
class Codes
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code");
        String s = sc.next();
        int l= s.length();
        if(l>6)
        {
            System.out.println("Invalid code, Length is not allowed");
            return;
        }
        for(int i =0; i<l;i++)
        {
            char c= s.charAt(i);
            if("ACEGIK".indexOf(c)<0)
            {
                System.out.println("Letter is not allowed, Invalid input");
                return;
            }
            for(int j =i+1 ;j<l;j++)
            {
                if(s.charAt(j) == c)
                {
                    System.out.println("No reptitions allowed, Invalid Input");
                    return;
                }
            }
        }
        System.out.println("Code is Valid");
    }
}