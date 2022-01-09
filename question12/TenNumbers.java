package question12;

import java.util.Scanner;

public class TenNumbers 
{

    public static void main(String args[])
    {
        int numbers [] = new int[10];
        
        int tmpSum = 0;
        int tmpAverage = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("insert numbers");
        for(int i=0;i<11;i++)
        {
            numbers[i] = scanner.nextInt();
        }

        for(int i=0;i<numbers.length;i++)
        {
            tmpSum += numbers[i];
        }

        tmpAverage = tmpSum /numbers.length;

        System.out.println("sum of the numbers: "+tmpSum);
        System.out.println("Average of the numbers: "+tmpAverage);

        scanner.close();

    }
    
}
