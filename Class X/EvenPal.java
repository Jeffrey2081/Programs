import java.util.Scanner;

public class EvenPal
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int org = num;
        int rev = 0;
        int sum = 0;
        
        while (num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            sum += d;
            num /= 10;
        }
        

        if (org == rev && sum % 2 == 0) {
            System.out.println(org + " is an EvenPal number.");
        } else {
            System.out.println(org + " is not an EvenPal number.");
        }
    }
}