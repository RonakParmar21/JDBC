import java.io.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {

            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Ronak@21_11");

            // create query
            String query = "insert into images(pic) values(?)";

            // process data
            PreparedStatement ps = con.prepareStatement(query);

//            FileInputStream fis = new FileInputStream("a.jpg");

            FileInputStream fis = new FileInputStream("C:/a.jpg");

            ps.setBinaryStream(1, fis, fis.available());

            ps.executeUpdate();

            System.out.println("image inserted");

            // close connection
            con.close();



        } catch (Exception e) {
            System.out.println(e);
        }
    }
}