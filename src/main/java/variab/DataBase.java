package variab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static Connection connectToBD(String bdUrl, String user, String password) {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection(bdUrl,
                            user, password);
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        return connection;
    }

}
