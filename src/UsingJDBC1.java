import java.sql.*;

public class UsingJDBC1 {


    public static void main(String[] args) throws SQLException {

        // Creation of connection

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TestBase?serverTimezone=UTC", "VVV","trinitron");

        // creation of  query / statement
        Statement stmt = con.createStatement();


        //SELECT USING
        String s = "select * from contact";

        // Execution of the statement

        ResultSet rs = stmt.executeQuery(s);
        //Catching information from table in database

        while (rs.next()){
            int id = rs.getInt("ID");
            String firstName =  rs.getString("first_name");
            String lastName =  rs.getString("last_name");

            System.out.println(id + " " + firstName + " " + lastName);
        }


        // Close connection
        con.close();

        System.out.println("Program was complited");
    }
}
