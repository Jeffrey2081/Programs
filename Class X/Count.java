import java.util.Scanner;

public class Count
{
   public static void main(String args[]) 
   {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
             
        int len = str.length();

        int ac = 0;
        int sc = 0;
        int dc = 0;
        char ch;

        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (Character.isLetter(ch))  
                ac++;    
            else if (Character.isDigit(ch))
                dc++;
            else if (!Character.isWhitespace(ch))
                sc++;
        }
        
        System.out.println("No. of Digits = " + dc);
        System.out.println("No. of Alphabets = " + ac);
        System.out.println("No. of Special Characters = " + sc);
        
    }
}