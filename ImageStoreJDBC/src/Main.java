import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {

            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Ronak@21_11");

            // create query for images table
             String query = "create table images(id int primary key auto_increment, pic blob)";

            // process data
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("table created");

            // close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}