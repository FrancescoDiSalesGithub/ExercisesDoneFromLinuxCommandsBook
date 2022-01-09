package question24;

import java.io.InputStreamReader;

public class ReadConsole 
{

    public static void main(String[] args)
    {
        InputStreamReader in = new InputStreamReader(System.in);

        try
        {
            char c;
            do
            {
                c = (char)in.read();
                System.out.println(c);
            }
            while(c !='q');
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
