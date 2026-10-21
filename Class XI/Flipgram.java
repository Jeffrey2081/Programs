import java.util.*;
class Flipgram
{
    String word;
    Flipgram(String s)
    {
        word = s;
    }
    boolean ishetero()
    {
        for(int i =0; i<word.length(); i++)
        {
            for(int j =i+1; j<word.length(); j++)
            {
                if(word.charAt(i) == word.charAt(j))
                return false;
            }
        }
        return true;
    }
    String flip()
    {
        if(ishetero())
        {
            System.out.println("HETEROGRAM");
            System.exit(0);
        }
        else
        {
        if(word.length()%2==0)
        {
            word = word.substring(word.length()/2)+ word.substring(0, word.length()/2 );
        }
        else
        word = word.substring(word.length()/2 +1) + word.charAt(word.length()/2) +  word.substring(0,word.length()/2);
    }
    return word;
}
    void display()
    {
        System.out.println(flip());
        
    }
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String w = sc.next();
        Flipgram f = new Flipgram(w);
        f.display();
    }
}