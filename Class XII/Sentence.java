import java.util.*;
class Sentence 
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        int l = str.length();
        if(str.charAt(l-1)!='.'&& str.charAt(l-1)!= '?' && str.charAt(l-1) !='!')
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        str=str.toUpperCase();
        str = str.substring(0, l-1);
        String w[] = str.split(" ");
        int v=0, c=0;
        System.out.println("WORD \tCOUNT");
        for(int i =0; i<w.length; i++)
        {
            for(int j=0; j<w[i].length(); j++)
            {
                if("AEIOU".indexOf(w[i].charAt(j))>=0)
                {
                    v++;
                }
                else
                c++;
            }
            System.out.print(w[i]+ "\t");
            while(v>0)
            {
                System.out.print("v");
                v--;
            }
            System.out.println();
            System.out.print("\t");
            while(c>0)
            {
                System.out.print("c");
                c--;
            }
            System.out.println();
        }
    }
}