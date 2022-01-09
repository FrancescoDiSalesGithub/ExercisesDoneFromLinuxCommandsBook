package question8;

import java.util.Scanner;

public class EquivalenceNumbers 
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if(firstNumber == secondNumber)
        {
            System.out.println("they are equals");
        }
        else
            System.out.println("they are not equals");

        scanner.close();
    }
    
}
