package question25;

import java.io.File;
import java.io.FileOutputStream;

public class OSO 
{


    public static void main(String[] args)
    {
        try
        {
            File file = new File("/home/frank/projects/javaex/magia");
            file.mkdir();
    
            System.out.println("directory creata");

            File content = new File("/home/frank/projects/javaex/magia/secret.txt");
            content.createNewFile();

            String contentFolder [] = file.list();

            for (String contentDirectory : contentFolder)
            {
                System.out.println(contentDirectory);
            }

            FileOutputStream outputStream = new FileOutputStream("/home/frank/projects/javaex/magia/secret.txt");
            String messagge = "hello java";
            byte mex [] = messagge.getBytes();

            outputStream.write(mex);
            outputStream.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        

    }
    
}
