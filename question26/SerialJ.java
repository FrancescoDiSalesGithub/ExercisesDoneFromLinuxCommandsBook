package question26;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialJ 
{


    public static void main(String args[]) 
    {
        MAO mao = new MAO();
        mao.setId("1234");
        mao.setContentMessage("the secret message");

        try
        {
            FileOutputStream serialFile = new FileOutputStream("mao.ser");
            ObjectOutputStream objectStreamer = new ObjectOutputStream(serialFile);

            objectStreamer.writeObject(mao);
            objectStreamer.close();

            serialFile.close();
            System.out.println("file serialized");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        

    }
    
}
