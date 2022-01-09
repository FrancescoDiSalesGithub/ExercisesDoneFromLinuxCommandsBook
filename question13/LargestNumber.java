package question13;

import java.util.Scanner;

public class LargestNumber {
 
    
public static void main(String[] args) 
{

    int max = 0;
    int numbers [] = new int[3];
    Scanner scanner = new Scanner(System.in);

    for(int i=0;i<numbers.length;i++)
    {
        numbers[i] = scanner.nextInt();
    }

    for(int i=0;i<numbers.length;i++)
    {
        if(numbers[i] > max)
            max = numbers[i];
    }

    System.out.println("MAX of the three numbers is " + max);
    scanner.close();
}

}
