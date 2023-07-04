import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

  static final String DB_URL = "jdbc:oracle:thin:@localhost:1522:XE";
  static final String USER = "system";
  static final String PASS = "system";
  static final String QUERY = "insert into testTable values (4,'mohamed',30)";

  public static void main(String[] args) {
    //    // Open a connection
    try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
      Statement stmt = conn.createStatement();
      stmt.executeUpdate(QUERY);
      // Extract data from result set
//      while (rs.next()) {
//        // Retrieve by column name
//        System.out.print("ID: " + rs.getInt("id"));
//        System.out.print(", name: " + rs.getString("name"));
//        System.out.println(", age: " + rs.getInt("age"));
//      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
