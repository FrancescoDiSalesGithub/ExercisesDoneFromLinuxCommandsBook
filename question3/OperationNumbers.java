package question3;

import java.util.Scanner;

public class OperationNumbers 
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
    
            int sum = firstNumber + secondNumber;
            int subtract = firstNumber - secondNumber;
            int multiply = firstNumber * secondNumber;
            int div = firstNumber / secondNumber;

            System.out.println(sum);
            System.out.println(subtract);
            System.out.println(multiply);
            System.out.println(div);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            scanner.close();
        }
  
    }
    
}
