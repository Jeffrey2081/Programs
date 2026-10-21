import java.util.*;
class Insort
{
    int arr[],size;
    Insort(int s)
    {
        size=s;
        arr=new int[size];
    }
    void getArray()
    {
        Scanner sc= new Scanner(System.in);
        for(int i =0 ;i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    void insertionsort()
    {
        int i, key,j;
        for(i=1; i<size; i++)
        {
            key= arr[i]; 
            j=i-1;
            while(j>=0&&  key>arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    double find()
    {
        double avg=0; int c=0;
        for(int i =0; i<size; i++)
        {
            if(arr[i]%2!=0)
            {
                avg+=arr[i];
                c++;
            }
        }
        return avg/c;
    }
    void display()
    {
        System.out.println("Sorted array");
        insertionsort();
        for(int i =0;i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Average of odd" + find());
    }
    static void main(int a){
        Insort i = new Insort(a);
        i.getArray();
        i.display();
    }
}