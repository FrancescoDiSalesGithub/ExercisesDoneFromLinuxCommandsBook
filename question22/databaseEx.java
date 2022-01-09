package question22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class databaseEx 
{


    public static void main(String args[])
    {

        Connection conn = null;
        PreparedStatement stmt = null;

        try
        {
            conn = DriverManager.getConnection("");
            stmt = conn.prepareStatement("SELECT * from persona where name = ? and surname = ?");

            stmt.executeQuery();
            ResultSet rs = stmt.getResultSet();

            while(rs.next())
            {
                System.out.println(rs.getString(""));
            }
            conn.close();
  
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

    }
    
}
