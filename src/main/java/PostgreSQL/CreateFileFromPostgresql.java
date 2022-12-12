package PostgreSQL;

import variab.UtilsLocal;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static PostgreSQL.CreateListPostgreSql.createList;
import static variab.DataBase.connectToBD;
import static variab.UtilsLocal.ListToFile;
import static variab.UtilsLocal.createString;


public class CreateFileFromPostgresql {
    private static String outputFile = "outputFromBD.txt";

    public static void main(String args[]) throws SQLException, IOException {
        List<String> List = createList();
        ListToFile(List, outputFile);
    }
}









