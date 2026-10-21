//convert Hexadecimal to decimal
import java.util.*;
class HexaDec
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hexadecimal string");
        String hex = sc.next();
        int dec=0,p=-1;
        for(int i =0 ;i<hex.length(); i++) 
        {
            if(hex.charAt(i)>='A')
            dec=dec+(int)(hex.charAt(i)-55)*(int)Math.pow(16,hex.length()-i-1);
            else
            dec=dec+(int)hex.charAt(i)*(int)Math.pow(16,hex.length()-i-1);
        }
        System.out.println("Decimal value: " + (dec*311/39));
    }
}