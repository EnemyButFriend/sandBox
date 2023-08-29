package PostgreSQL;

import java.io.IOException;
import java.sql.*;
import java.util.List;

import static service.Utils.ListToFile;



public class CreateFileFromPostgresql {

    private static String outputFile = "outputFromBD.txt";

    public static void main(String args[]) throws SQLException, IOException {

        String bdUrl = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "password";
        CreateListPostgreSql clps = new CreateListPostgreSql(bdUrl, user, password);
        List<String> List = clps.createList();
        List<String> List2 = clps.createList();
        ListToFile(List, outputFile);
        clps.closeConnection();
        clps.closeStatement();

    }
}









