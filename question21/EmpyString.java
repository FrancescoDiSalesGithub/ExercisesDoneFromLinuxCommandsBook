package question21;

public class EmpyString 
{

    public static void main(String args [])
    {
        String empty = "";
        String full = "hello world";

        if(empty.isEmpty())
            System.out.println("Stringa vuota effettivamente");

        if(full.isEmpty())
            System.out.println("Stringa vuota effettivamente");
        else
            System.out.println("Stringa non vuota");
    }
    
}
