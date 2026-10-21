class Dudeney {
    public static void main(int n){
    int sum=0,og=n;
        while(n>0){
        sum=sum+n%10;
        n=n/10;
    }
    if(Math.pow(sum,3)==og)
    System.out.println("Dudeney Number "+ og );
    else
    System.out.println("Not a Dudeney Number "+ og );
    }
    }
