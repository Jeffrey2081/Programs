import java.util.*;
class Paragraph
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paragraph");
        String s = sc.nextLine().toUpperCase();
        String w[] = s.split(" ");
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== '?' ||s.charAt(i)== '.')
            c++;
        }
        if(c>4)
        {
            System.out.println("Incorrect number of sentences");
            System.exit(0);
        }
        c=w.length;
        System.out.println("Number of words: " + c);
        int n=0;
        int a[] =new int[c];
        for(int i =0; i<c; i++)
        {
            for(int j=0;j<c;j++)
            {
                if(w[i]==w[j])
                n++;
            }
            a[i]=n;
            n=0;
        }
        for(int i=0;i<c;i++)
        {
            for(int j =0; j<c-i-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    int  t =a[j];
                    a[j]= a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    
    }

//no of sentences  if more than 4 then print error
//no of words
//ascending order of frequency
//sentences ends with ? . 