import variab.UtilsLocal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CreateFileFromPostgresql {
    private static String bdUrl = "jdbc:postgresql://localhost:5432/demo";
    private static String user = "postgres";
    private static String password = "password";
    private static String outputFile = "outputFromBD.txt";
    private static String sqlQuery = "select * from boarding_passes order by ticket_no limit 50000;";

    public static void main(String args[]) {

        createList();

    }

    private static void createList() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection(bdUrl,
                            user, password);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuery);


            List<String> list = new ArrayList<>();

            while (rs.next()) {
                String ticket_no = rs.getString("ticket_no");
                String flight_id = rs.getString("flight_id");
                String boarding_no = rs.getString("boarding_no");
                String seat_no = rs.getString("seat_no");
                String string = createString(ticket_no, flight_id, boarding_no, seat_no);
                list.add(string);
            }

            UtilsLocal.ListToFile(list, outputFile);
//        System.out.println(list);
            rs.close();
            stmt.close();
            c.close();
            System.out.println("Operation done successfully");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    private static String createString(String firstColumn, String secondColumn, String thirdColumn, String forthColumn) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = String.valueOf(stringBuilder.append((
                firstColumn + "|" +
                        secondColumn + "," +
                        thirdColumn + "," +
                        forthColumn + "," +
                        "try-la-last"
        )));
        return string;
    }

}





