import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Ronak@21_11");

            String query = "update table1 set tName=?, tCity=? where tId=?";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter a name : ");
            String name = br.readLine();
            System.out.println("Enter city : ");
            String city = br.readLine();

            System.out.println("Enter User id : ");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, city);
            ps.setInt(3, id);

            ps.executeUpdate();

            System.out.println("Updated...");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}