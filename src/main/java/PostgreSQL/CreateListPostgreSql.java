package PostgreSQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static PostgreSQL.DataBase.connectToBD;
import static service.Utils.createString;

public class CreateListPostgreSql {
    private static String bdUrl = "jdbc:postgresql://localhost:5432/demo";
    private static String user = "postgres";
    private static String password = "password";

    private static String sqlQuery = "select * from boarding_passes order by ticket_no limit 50000;";
    public static List<String> createList() throws SQLException {

        Connection c = connectToBD(bdUrl,user, password);
        Statement stmt = null;

        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(sqlQuery);


        List<String> list = new ArrayList<>();

        while (rs.next()) {
            String ticket_no = rs.getString("ticket_no");
            String flight_id = rs.getString("flight_id");
            String boarding_no = rs.getString("boarding_no");
            String seat_no = rs.getString("seat_no");
            String string = createString(ticket_no, flight_id, boarding_no, seat_no, null, null, null, null, null, null);
            list.add(string);
        }

//        System.out.println(list);
        rs.close();
        stmt.close();
        c.close();
        System.out.println("Operation done successfully");

        return list;
    }
}
