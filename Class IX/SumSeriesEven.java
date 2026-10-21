class SumSeriesEven {
    //Calculate sum of even numbers from m to n
    public static void main(int m, int n){
        int sum=0;
        for(int i=m;i<=n;i++){
            if(i%2==0)
            sum=sum+i;
        }
        System.out.println("Sum of series from " + m+ " to " + n+ " is " + sum);
    }
}