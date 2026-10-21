import java.util.*;
class Markov
{
    public static void main(int n)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter elements of array");
        double a[][] = new double[n][n];
        for(int i =0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j] = s.nextDouble();
                if(a[i][j]>1||a[i][j]<0)
                {
                    System.out.println("Wrong input");
                    System.exit(0);
                }
            }
        }
        double sr =0, sc=0;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                sr +=a[i][j];
                sc+=a[j][i];
            }
            if(sr==1.0 && sc ==1.0)
            {
            sr=0.0;
            sc=0.0;
        continue;}
            else
            {
                System.out.println("Not Doubly Markov matrix");
                System.exit(0);
            }
            
        }
        System.out.println("Doubly Markov matrix");
    }
}