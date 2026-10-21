import java.util.*;
class Composite
{
    int arr[][],m,n;
    Composite(int mm, int nn)
    {
        m=mm; 
        n=nn;
        arr= new int[m][n];
    }
    int isComposite(int p)
    {
        for(int i =2; i<p; i++)
        if(p%i ==0)
        return 1;
        return 0;
    }
    void fill()
    {
        int c=4;
        for(int i = 0; c<n;i++)
        {
            for(int j =0;j<m; j++)
            {
            while(isComposite(c)!=1)
            {
                c++;
            }
            arr[j][i]=c;
        }
    }
    }
}