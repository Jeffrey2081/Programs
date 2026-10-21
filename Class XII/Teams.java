/*
 * no of teams - n
 * 2<n<9
 * vertically display elements 
 */
import java.util.*;
class Teams
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),max=0;
        if(n<2 || n>9)
        {
            System.out.println("Invalid number");
            return;
        }
        String w[] = new String[n];
        for(int i =0; i<n; i++)
        {
            w[i]= sc.nextLine();
            if(max<w[i].length())
            {
                max = w[i].length();
            }
        }
        
        for(int i =0; i<max; i++)
        {
            for(int j =0; j< n; j++)
            {
                try{
                System.out.print(w[j].charAt(i) + " ");
            }
            catch(StringIndexOutOfBoundsException e){
                System.out.print("  ");
            }
            }
            System.out.println();
        
        }
        
    }
}
