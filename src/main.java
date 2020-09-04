import java.sql.*;
public class main {
    public static void main(String[] args) throws SQLException {


        try {
            Connection conc = DriverManager.getConnection("jdbc:mysql://localhost:3306/heros", "root", "Goksravi99.");
            Statement sta = conc.createStatement();
            ResultSet res = sta.executeQuery("Select * from hero;");
            while (res.next())
            {
                System.out.println(res.getString("name")+" "+ res.getString("age"));
            }

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