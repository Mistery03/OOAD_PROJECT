import java.sql.*;
public class Database 
{
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    ResultSetMetaData rsmd = null;

    String db = "jdbc:mysql://localhost:3306/courseproject";
    String username = "root";
    String password = "";


    public Database(String db, String username, String password) throws SQLException
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(db, username, password);
            System.out.print("Success");

            String query = "Select `CourseName` FROM `course` WHERE `CourseName` = 'ECE'";
            statement = connection.createStatement();   
            resultSet = statement.executeQuery(query);
            rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            while(resultSet.next())
            {
                
                System.out.print("\n"+resultSet.getString("Coursename") + " ");
                
                System.out.println();
            }
           
            resultSet.close();
            statement.close();
            connection.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        
    }

    public static void main(String [] args)
    {
        try {
            Database db = new Database("jdbc:mysql://localhost:3306/courseproject","root", "");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
  
    
}
