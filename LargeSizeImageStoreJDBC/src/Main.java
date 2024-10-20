import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {

            Connection c = ConnectionProvider.getConnection();

            String q = "insert into images(pic) values(?)";

            PreparedStatement ps = c.prepareStatement(q);

            JFileChooser jfc = new JFileChooser();

            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();

            FileInputStream fis = new FileInputStream(file);

            ps.setBinaryStream(1, fis, fis.available());

            ps.executeUpdate();

            System.out.println("Inserted...");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}