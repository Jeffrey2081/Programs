import java.util.*;
class vertical
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s[] = new String[N];
        int i,mx=0;
        for(i =0 ;i<N; i++)
        {
            s[i]= sc.next();
        }
        for(i =0; i<N; i++){
            if(mx<s[i].length())
            {
                mx=s[i].length();
            }
        }
        for(i =0; i<mx; i++)
        {
            for(int j =0; j<N; i++)
            {
                try
                {
                    System.out.print(s[j].charAt(i) + " ");
                }
                catch(StringIndexOutOfBoundsException e )
                {
                    
                }
            }
            System.out.println();
        }
    }
    
}
