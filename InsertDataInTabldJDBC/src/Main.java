import com.sun.tools.jconsole.JConsoleContext;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        // INSERT RECORD USING PREPARE STATEMENT

        try {
            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Ronak@21_11");


            // create query
            String query = "insert into table1(tName, tCity) values(?, ?)";
            PreparedStatement st = con.prepareStatement(query);

            // process data
            st.setString(1, "Ronak");
            st.setString(2, "Bhalgam");

            st.executeUpdate();

            System.out.println("Record inserted...");

            // close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}