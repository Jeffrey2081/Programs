import java.util.Scanner;

public class StringConvert
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        str = str.toUpperCase();
        int l = str.length();
        
        String res = "";
        
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            if ("AEIOU".indexOf(ch) != -1) {
                res += (char)(ch + 1);
            }
            else if (Character.isLetter(ch)) {
                res += (char)(ch - 1);
            }
            else {
                res += ch;
            }
        }
        
        System.out.println("Output String:");
        System.out.println(res);
    }
}