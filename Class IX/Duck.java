class Duck{
    public static void main(int n){
        while(n>0){
            if(n%10==0){
                System.out.println("Duck Number");
                return;
            }
            n=n/10;
        }
    }
}