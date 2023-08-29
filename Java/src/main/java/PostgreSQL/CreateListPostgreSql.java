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

    Statement stmt;
    private final Connection connection;
    private static String SQL_QUERY = "select * from boarding_passes order by ticket_no limit 50000;";

    public CreateListPostgreSql(String bdUrl, String user, String password) throws SQLException {

        connection = connectToBD(bdUrl,user, password);
        stmt = connection.createStatement();

    }


    public List<String> createList() throws SQLException {

        List<String> list = new ArrayList<>();
        ResultSet rs = stmt.executeQuery(SQL_QUERY);


        while (rs.next()) {
            String ticket_no = rs.getString("ticket_no");
            String flight_id = rs.getString("flight_id");
            String boarding_no = rs.getString("boarding_no");
            String seat_no = rs.getString("seat_no");
            String string = createString(ticket_no, flight_id, boarding_no, seat_no, null, null, null, null, null, null);
            list.add(string);
        }

//        System.out.println(list);
//        Переделать на логирование, коннект через мавен, переменные через пропети.
//        Прислать МНТ Косте.
//        Узнать агенты мониторинга на серверах.
//        Собрать метрики в дашборд.
//        Кафка тулл. Подключиться к конфигурации БД чере SpringBoot.


        rs.close();

        return list;
    }
    public void closeConnection () throws SQLException {
        connection.close();
    }
    public void closeStatement () throws SQLException {
        stmt.close();
    }

}
