import java.util.Scanner;

public class DigitSum
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int oneSum = 0, twoSum = 0, d = 0;
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers");
        int l = arr.length;
        
        for (int i = 0; i < l; i++) 
        {
            arr[i] = in.nextInt();
        }
        
        for (int i = 0; i < l; i++) 
        {
            if(arr[i] >= 0 && arr[i] < 10 )
                oneSum += arr[i];
            else if(arr[i] >= 10 && arr[i] < 100 )
                twoSum += arr[i];
        }
        
        System.out.println("Sum of 1 digit numbers = "+ oneSum);
        System.out.println("Sum of 2 digit numbers = "+ twoSum);
        
    }
}