import java.util.Scanner;

public class ValidateGmail
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Gmail ID: ");
        String gmailId = in.nextLine();
        int len = gmailId.length(); 

        if (gmailId.endsWith("@gmail.com")
        && gmailId.indexOf('@') == len - 10)
        {
            System.out.println(gmailId + " is a valid Gmail ID.");
        }
        else
        {
            System.out.println(gmailId + " is NOT a valid Gmail ID.");
        }
    }
}