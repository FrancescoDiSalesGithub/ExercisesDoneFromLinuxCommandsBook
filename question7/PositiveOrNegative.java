package question7;

import java.util.Scanner;

public class PositiveOrNegative 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number > 0)
            System.out.println("Positive number");
        else
            System.out.println("Negative number");

        scanner.close();

    }
    
}
