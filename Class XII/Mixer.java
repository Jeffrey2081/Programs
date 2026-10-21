import java.util.*;
class Mixer
{
    int arr[], n;
    Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array"); 
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    Mixer mix(Mixer A)
    {
        Mixer C = new Mixer(A.n + n);
        for(int i =0; i<A.n; i++)
        {
            C.arr[i]=arr[i];
        }
        for(int i =0; i<n; i++)
        {
            C.arr[A.n+i]=arr[i];
        }
        return C;
     }
     void display(){
         for(int i  =0 ;i<n; i++)
         {
             System.out.print(arr[i] + " ");
         }
     }
     static void main(int a, int b)
     {
         Mixer A = new Mixer(a);
         Mixer B = new Mixer(b);
         A.accept();
         B.accept();
         Mixer C = B.mix(A);
         A.display();
         B.display();
         C.display();
     }
}