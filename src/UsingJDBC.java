import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingJDBC {


    public static void main(String[] args) throws SQLException {

        // Creation of connection

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestBase?serverTimezone=UTC", "VVV","trinitron");

        // creation of  query / statement
        Statement stmt = con.createStatement();


        //inserting
        String s = "insert into contact values ('1','Ivan', 'Ivanov')";
        //String s = "insert into contact values ('2','Vasiliy', 'Vasilyev')";
        //updating
        //String s = "update contact set first_name= 'Peter'where id =1 ";
        //Deleting
        //String s = "delete from contact where id =1 ";
        //String s = "delete contact where first_name = 'Peter' ";


        // Execution of the statement

        //stmt.executeQuery(s);
        stmt.executeUpdate(s);

        // Close connection
        con.close();

        System.out.println("Program was complited");
    }
}
