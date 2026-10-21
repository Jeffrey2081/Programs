import java.util.*;
class Arrange
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine().toUpperCase();
        String w[]=s.split(" "),v="",co="";
        int c =0;
        
        for(int i =0; i< w.length; i++)
        {
            String a = w[i];
            if("AEIOU".indexOf(a.charAt(0))>=0 && "AEIOU".indexOf(a.charAt(a.length()-1))>=0)
            {
                c++;
                v=v+" "+ w[i];
            }
            else
            {
                co=co+" " + w[i];
            }
            
        }
        System.out.println(v + " " +co);
        System.out.println("No of vowel words " + c);
    }
}
