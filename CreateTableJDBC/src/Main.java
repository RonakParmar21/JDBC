import java.sql.*;
public class Main {
    public static void main(String[] args) {
        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Ronak@21_11");

            // create query
            String query = "create table table1(tID int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            // process the data
            Statement st = con.createStatement();
            st.executeUpdate(query); // this statement give error if table is not create

            System.out.println("Table Created");

            // close connection

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}