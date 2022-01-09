package question23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;



public class IOJ {
    

    public static void main(String args[])
    {
        try
        {
      

            FileReader in = null;
      
            in = new FileReader("ciao.txt");
            
            while(in.read()!=-1)
            {
                System.out.println((char)in.read());
            }
            
            in.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

}
