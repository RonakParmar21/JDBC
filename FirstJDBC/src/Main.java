import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            // load driver
            Class.forName("com.mysql.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Ronak@21_11");

            if(con.isClosed()) {
                System.out.println("Connection close");
            } else {
                System.out.println("Connection created...");
            }

            // Create a query

            // process the data

            // close conneciton


        } catch (Exception e) {
            System.out.println("Exception is : " + e);
        }


    }
}