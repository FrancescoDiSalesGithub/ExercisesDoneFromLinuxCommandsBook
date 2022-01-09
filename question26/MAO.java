package question26;

public class MAO implements java.io.Serializable 
{

    private String id;
    private transient String contentMessage;


    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }

    public void setContentMessage(String contentMessage)
    {
        this.contentMessage = contentMessage;
    }

    public String getContentMessage()
    {
        return contentMessage;
    }
    
}
