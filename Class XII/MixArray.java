import java.util.*;
class MixArray
{
    int arr[],cap;
    MixArray(int mm)
    {
        cap=mm;
        arr=new int[cap];
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        for(int i=0; i<cap;i++)
        arr[i]=sc.nextInt();
    }
    MixArray mix(MixArray P, MixArray Q)
    {
        MixArray R = new MixArray(6);
        for(int i=0; i<3;i++)
        R.arr[i]=P.arr[i];
        for(int j=0;j<3;j++)
        R.arr[j+3]=Q.arr[j];
        return R;
    }
    void display()
    {
        for(int i=0;i<cap;i++)
        System.out.print(arr[i] + " ");
    }
    public static void main(int a,int b)
    {
        MixArray P = new MixArray(a);
        MixArray Q = new MixArray(b);
        MixArray R = new MixArray(6);
        P.input();
        Q.input();
        R= R.mix(P,Q);
        R.display();
    }
}