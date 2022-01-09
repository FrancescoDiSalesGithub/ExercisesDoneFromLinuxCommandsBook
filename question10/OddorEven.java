package question10;

import java.util.Scanner;

public class OddorEven 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number%2 == 0)
            System.out.println("Is even");
        else
            System.out.println("Is odd");

        scanner.close();

    }
    
}
