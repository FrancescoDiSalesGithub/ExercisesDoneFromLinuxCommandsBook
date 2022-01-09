package question4;

public class AverageElementsArray 
{


    public static void main(String[] args)
    {
        int arrayNumbers [] = {1,2,3,4,5,6,7};
        int tmpCalculated = 0;

        for(int i = 0; i < arrayNumbers.length; i++)
        {
            tmpCalculated += arrayNumbers[i];
        }

        int average = tmpCalculated / arrayNumbers.length;
        System.out.println("Average: "+average);


    }
    
}
