import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/module_4";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private final Connection connection;


    // Конструктор Database() встановлює з'єднання з базою даних, використовуючи
    Database() {
        try {
            connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD); // . Якщо стається помилка при підключенні, вона обробляється і викидається RuntimeException.
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return connection;
    } //Метод getConnection() повертає об'єкт Connection, який можна використовувати для взаємодії з базою даних.

}
