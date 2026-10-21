import java.util.Scanner;

public class LinearSearch
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        
        double arr[] = new double[20];
        int l = arr.length;
        int i = 0;
        
        System.out.println("Enter array elements: ");
        for (i = 0; i < l; i++) 
        {
            arr[i] = in.nextDouble();    
        }
        
        System.out.print("Enter the number to search: ");
        double n = in.nextDouble();
        
        for (i = 0; i < l; i++) 
        {
            if (arr[i] == n) 
            {
                break;
            }
        }
        
        if (i == l) 
        {
            System.out.println("Not found");
        }
        else 
        {
            System.out.println(n + " found at index " + i);
        }
    }
}