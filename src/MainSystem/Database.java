package MainSystem;
import java.sql.*;
import java.util.ArrayList;
public class Database 
{
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    ResultSetMetaData rsmd = null;

    String db = "jdbc:mysql://";
    String query = "SELECT * FROM";

    int size = 0;

    ArrayList<String> tempList;



    public Database(String localHost, String databaseName, String username, String password) throws SQLException
    {
        this.db = "jdbc:mysql://"+localHost+"/"+databaseName;
        
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(this.db, username, password);
            System.out.print("Connection to database is successful!");

            /*String query = "Select `CourseName` FROM `course` WHERE `CourseName` = 'ECE'";
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
            connection.close();*/
        }catch(Exception e)
        {
            
            System.out.println("[PLEASE RUN XAMPP OR THE DATABASE INFORMATIONS ARE INVALID!!!]");
            e.printStackTrace();
        }

        
    }

    public ArrayList getColumnData(String columnName, String modelName)
    {
        try
        {
            tempList = new ArrayList<>();
            this.query = "Select `"+columnName+"` FROM `"+modelName+"`";
            this.statement = this.connection.createStatement();   
            this.resultSet = this.statement.executeQuery(query);
            while(this.resultSet.next())
            {
                tempList.add(resultSet.getString(columnName));
            }
            /*this.size = rsmd.getColumnCount();
            for(int i = 0; i <= size; i++)
            {
                System.out.println(resultSet.getString(i));
            }*/
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return this.tempList;
    }

    /*public void getAllData(String objectName) throws SQLException
    {
        try
        {
            this.query = "SELECT * FROM `"+objectName+"`";
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery(this.query);

           

            while(this.resultSet.next())
            {
               for(int i = 1; i < this.resultSet.getRow()+1;i++)
                 System.out.println("\n"+this.resultSet.getString(i));
            
            }

            this.resultSet.close();
            this.statement.close();
            this.connection.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }*/

    /*public static void main(String [] args)
    {
        try {
            Database db = new Database("localhost:3306","courseproject","root", "");
            db.getAllData("course");
        } catch (SQLException e) {
           
            e.printStackTrace();
        }

       
        
    }*/
  
    
}
