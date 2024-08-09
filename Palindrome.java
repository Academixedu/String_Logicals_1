public class Palindrome
{
// prepare a Code to findout whether a String is Palindrome or not

    void pal(String s)
    {   

        String rev="";
        String temp=s;

        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }

        if(temp.equals(rev))
        {

            System.out.println(temp+" is a palindrome String ..!!");
        }
        else
        {            
            System.out.println(temp+" is not a palindrome String ..!!");
        }
    }

    public static void main(String[] args)
    {
        String s="nayan";

        Palindrome obj=new Palindrome();
        obj.pal(s);
    }

}
