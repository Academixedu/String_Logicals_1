public class PrintingEven
{  
// Write the Code to printEven Length Words With  their Length
    
    void pal(String s)
    {   
        String[] word=s.split(" ");
        int [] wordsLength= new int[word.length];

        for (int i=0;i<=word.length-1;i++)
        {
            
            wordsLength[i]=word[i].length();
        }

        for(int i=0;i<=word.length-1;i++)
        {
            if (wordsLength[i]%2==0)
            {
                System.out.println(word[i] +" : "+word[i].length());
                // System.out.println(word[i] +" : "+wordsLength[i]);
            }
        }
   


    }

    public static void main(String[] args)
    {
        String s="Robert Kiosky is the author of Rich Dad Poor Dad";    

     PrintingEven obj=new PrintingEven();
     obj.pal(s);

    }


}
