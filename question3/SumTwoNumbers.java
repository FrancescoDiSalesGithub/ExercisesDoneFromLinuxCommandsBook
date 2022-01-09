package question3;

import java.util.Scanner;

public class SumTwoNumbers 
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("sum: "+sum);

        scanner.close();

    }
    
}
