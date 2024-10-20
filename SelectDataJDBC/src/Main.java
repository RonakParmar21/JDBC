import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class Main {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Ronak@21_11");

            String query = "select * from table1";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println("-----------------------------------------------");
                System.out.println("User id is : " + rs.getInt(1));
                System.out.println("User name is : " + rs.getString(2));
                System.out.println("User city is : " + rs.getString(3));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}