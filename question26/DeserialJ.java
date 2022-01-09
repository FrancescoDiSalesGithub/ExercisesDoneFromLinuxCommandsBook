package question26;

import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class DeserialJ 
{

    public static void main(String[] args)
    {
        try
        {
            FileInputStream fileInput = new FileInputStream("mao.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);

            MAO mao = null;
            mao = (MAO)objectInputStream.readObject();

            objectInputStream.close();
            fileInput.close();

            System.out.println(mao.getId());
            System.out.println(mao.getContentMessage());

        }
        catch(Exception e)
        {

        }
        
    }
    
}
