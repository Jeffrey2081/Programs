import java.util.*;
class Coding
{
    String wrd;
    int len;
    Coding()
    {
        wrd="";
        len =0;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        wrd =sc.next();
        len = wrd.length();
    }
    void find()
    {
        System.out.println("Character\tASCII value");
        int l=wrd.charAt(0),h=wrd.charAt(0);
        for(int i =0 ; i<len; i++)
        {
            char c =wrd.charAt(i);
            System.out.println(c + "\t\t" + (int)c);
            if(l>c)
            l=c;
            if(h<c)
            h=c;
        }
        System.out.println("Lowest ASCII " + l);
        System.out.println("Highest ASCII " + h);

    }
    void show()
    {
        find();
    }
    static void main(){
        Coding c = new Coding();
        c.accept();
        c.show();
    }
}