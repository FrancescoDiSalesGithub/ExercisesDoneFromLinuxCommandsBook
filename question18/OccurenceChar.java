package question18;

public class OccurenceChar 
{


    public static void main(String[] args)
    {
        char toFindChar = 'e';
        String sentence = "mi piace il pane";
        int frequency = 0;

        for(int i=0;i<sentence.length();i++) 
        {
            if(toFindChar == sentence.charAt(i))
            {
                frequency++;
            }
        }

        System.out.println("Occurence found: " + frequency);

    }

    
}
