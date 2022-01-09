package question14;

import java.util.Scanner;

public class IncDecNumber 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numberOne = 0;
        int numberTwo = 0;

        System.out.println("insert Value for Number One: ");
        numberOne = scanner.nextInt();

        System.out.println("insert Value for Number Two: ");
        numberTwo = scanner.nextInt();

        int tmpIncNumberOne = numberOne+ 1;
        int tmpDecNumberOne = numberOne- 1;

        int tmpIncNumberTwo = numberTwo+ 1;
        int tmpDecNumberTwo = numberTwo- 1;

        System.out.println("Number One: "+numberOne);
        System.out.println("Incremented Value: "+tmpIncNumberOne);
        System.out.println("Decremented Value: "+tmpDecNumberOne);

        System.out.println("Number Two: "+numberTwo);
        System.out.println("Incremented Value: "+tmpIncNumberTwo);
        System.out.println("Decremented Value: "+tmpDecNumberTwo);


        scanner.close();
    }
    
}
