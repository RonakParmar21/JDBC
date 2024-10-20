import java.sql.*;

public class ConnectionProvider {
    private  static Connection con;

    public static  Connection getConnection() {

        try {

            if(con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Ronak@21_11");



            }

        } catch (Exception e) {
            System.out.println(e);
        }

    return  con;
    }

}
