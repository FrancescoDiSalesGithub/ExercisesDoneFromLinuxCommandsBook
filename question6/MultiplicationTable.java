package question6;

import java.util.Scanner;

public class MultiplicationTable 
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for(int i=0;i<11;i++)
        {
            System.out.println(String.valueOf(number)+" X "+String.valueOf(i));
            int elementTable = number*i;
            System.out.println(elementTable);
        }

        scanner.close();
    }
    
}
