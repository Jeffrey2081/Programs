import java.util.*;
class SumSeriesOdd {
    //Calculate sum of odd numbers from m to n
    public static void main(){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter m");
        int m=sc.nextInt();
        System.out.println("Enter m");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            if(i%2==1)
            sum=sum+i;
        }
        System.out.println("Sum of series from " + m+ " to " + n+ " is " + sum);
    }
}