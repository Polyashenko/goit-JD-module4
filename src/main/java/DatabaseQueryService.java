import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    public List<MaxProjectCountClient> findMaxProjectsClient() {
        List<MaxProjectCountClient> resultClients = new ArrayList<>();
        Database database = new Database();
        Connection connection = database.getConnection(); // У методі main створюється об'єкт класу Database, і викликається метод getConnection(), щоб отримати з'єднання з базою даних.
        try {
            Statement statement = connection.createStatement(); // Створюється об'єкт Statement, який використовується для виконання SQL-запитів.
            String file = "sql/find_max_projects_client.sql";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println("sql: " + line);
                ResultSet rs = statement.executeQuery(line);
                while(rs.next()){
                    //Display values
                    System.out.print("NAME: " + rs.getString("NAME"));
                    System.out.print(", PROJECT_COUNT: " + rs.getString("PROJECT_COUNT"));
                    resultClients.add(new MaxProjectCountClient(rs.getString("NAME"), rs.getInt("PROJECT_COUNT")));
                }
            }
            System.out.println(" База даних успішно проініціалізована.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return resultClients;
    }

    public List<FindLongestProject> findFindLongestProject() {
        List<FindLongestProject> resultProjects = new ArrayList<>();
        Database database = new Database();
        Connection connection = database.getConnection(); // У методі main створюється об'єкт класу Database, і викликається метод getConnection(), щоб отримати з'єднання з базою даних.
        try {
            Statement statement = connection.createStatement(); // Створюється об'єкт Statement, який використовується для виконання SQL-запитів.
            String file = "sql/find_longest_project.sql";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println("sql: " + line);
                ResultSet rs = statement.executeQuery(line);
                while(rs.next()){
                    //Display values
                    System.out.print("ID: " + rs.getInt("ID"));
                    System.out.print(", DURATION: " + rs.getInt("DURATION"));
                    resultProjects.add(new FindLongestProject(rs.getInt("ID"), rs.getInt("DURATION")));
                }
            }
            System.out.println(" База даних успішно проініціалізована.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return resultProjects;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorker() {
        List<MaxSalaryWorker> resultSalary = new ArrayList<>();
        Database database = new Database();
        Connection connection = database.getConnection(); // У методі main створюється об'єкт класу Database, і викликається метод getConnection(), щоб отримати з'єднання з базою даних.
        try {
            Statement statement = connection.createStatement(); // Створюється об'єкт Statement, який використовується для виконання SQL-запитів.
            String file = "sql/find_max_salary_worker.sql";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println("sql: " + line);
                ResultSet rs = statement.executeQuery(line);
                while(rs.next()){
                    //Display values
                    System.out.print("NAME: " + rs.getString("NAME"));
                    System.out.print(", SALARY: " + rs.getInt("SALARY"));
                    resultSalary.add(new MaxSalaryWorker(rs.getString("NAME"), rs.getInt("SALARY")));
                }
            }
            System.out.println(" База даних успішно проініціалізована.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return resultSalary;
    }

    public List<YoungestEldestWorkers> findYoungestEldestWorkers() {
        List<YoungestEldestWorkers> resultWorkers = new ArrayList<>();
        Database database = new Database();
        Connection connection = database.getConnection(); // У методі main створюється об'єкт класу Database, і викликається метод getConnection(), щоб отримати з'єднання з базою даних.
        try {
            Statement statement = connection.createStatement(); // Створюється об'єкт Statement, який використовується для виконання SQL-запитів.
            String file = "sql/find_youngest_eldest_workers.sql";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println("sql: " + line);
                ResultSet rs = statement.executeQuery(line);
                while(rs.next()){
                    //Display values
                    System.out.print("TYPE: " + rs.getString("TYPE"));
                    System.out.print(", NAME: " + rs.getString("NAME"));
                    System.out.print(", BIRTHDAY: " + rs.getString("BIRTHDAY"));
                    resultWorkers.add(new YoungestEldestWorkers(rs.getString("TYPE"), rs.getString("NAME"),
                            rs.getString("BIRTHDAY")));
                }
            }
            System.out.println(" База даних успішно проініціалізована.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return resultWorkers;
    }

}

