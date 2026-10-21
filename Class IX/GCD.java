class GCD{
    public static void main(int a,int b){
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println("GCD=" + a);
    }
}