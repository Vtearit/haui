import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBConnection {
    public static Connection getConnection() throws SQLException{
        
        
        Connection con = null;
        String s = "jdbc:sqlserver://localhost;databaseName=QLBH";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(s,"sa","123");
        } catch (Exception ex) {
            System.err.println("Khong ket noi dc");
        }
        return con;
    }
    public static void main(String args[]) throws SQLException{
        DBConnection t= new DBConnection();
        Connection c=t.getConnection();
          
      
          
        try{Statement st=c.createStatement();
        Statement st1=c.createStatement();
        

        ResultSet sr=st.executeQuery("select * from Dangki");
      
     
        while(sr.next()){
            
           
           System.out.println("NameDN : "+sr.getString(1)+"PassDN : "+sr.getString(2));
       
        
         
        }
        } catch(Exception e){
            System.out.println("khong ket noi dc : "+e);
        }
  
     
    }
}


