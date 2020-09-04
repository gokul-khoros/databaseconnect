import java.sql.*;
public class main {
    public static void main(String[] args) throws SQLException {


        try {
            Connection conc = DriverManager.getConnection("jdbc:mysql://localhost:3306/heros", "root", "Goksravi99.");
            /*Statement stat = conc.createStatement();
            ResultSet rst = stat.executeQuery();
            */
        }
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }
        //learn and execute the crud


    }
}