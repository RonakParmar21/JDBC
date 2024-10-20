import java.sql.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {

            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Ronak@21_11");

            // create query
            String query = "insert into table1(tName, tCity) values(?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter name : ");
            String name = br.readLine();

            System.out.println("Enter City : ");
            String city = br.readLine();

            ps.setString(1, name);
            ps.setString(2, city);

            // process data
            ps.executeUpdate();

            System.out.println("record inserted...");

            // close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}