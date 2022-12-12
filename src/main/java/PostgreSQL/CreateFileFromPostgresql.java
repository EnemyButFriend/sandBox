package PostgreSQL;

import java.io.IOException;
import java.sql.*;
import java.util.List;

import static PostgreSQL.CreateListPostgreSql.createList;
import static service.Utils.ListToFile;


public class CreateFileFromPostgresql {
    private static String outputFile = "outputFromBD.txt";

    public static void main(String args[]) throws SQLException, IOException {
        List<String> List = createList();
        ListToFile(List, outputFile);
    }
}









