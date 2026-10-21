import java.util.Scanner;

public class CharBubbleSort
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        char ch[] = new char[10];
        System.out.println("Enter 10 characters:");
        for (int i = 0;  i < ch.length; i++) {
            ch[i] = in.nextLine().charAt(0);
        }

        System.out.println("Original Array");
        for (int i = 0;  i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        
        //Bubble Sort
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - 1 - i; j++) {
                if (ch[j] > (ch[j + 1])) {
                    char t = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = t;
                }
            }
        }
        
        System.out.println("\nSorted Array");
        for (int i = 0;  i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
    }
}