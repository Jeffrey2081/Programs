import java.util.Scanner;

public class SuperSpy
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        
        int sum = 0;
        int dc = 0;
        int orgNum = num;
        
        while (num > 0) {
            int d = num % 10;
            sum += d;
            dc++;
            num /= 10;
        }
        
        if (sum == dc) {
            System.out.println(orgNum + " is a SUPERSPY number");
        }
        else {
            System.out.println(orgNum + " is not a SUPERSPY number");
        }
    }
}