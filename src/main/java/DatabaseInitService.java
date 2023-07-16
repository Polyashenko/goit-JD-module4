import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) {
        // Виконання SQL-запитів
        Database database = new Database();
        Connection connection = database.getConnection(); //
        try {
            Statement statement = connection.createStatement();
            String file = "sql/init_db.sql";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println("sql: " + line);
                statement.executeUpdate(line);
            }
            System.out.println("База даних успішно проініціалізована.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
