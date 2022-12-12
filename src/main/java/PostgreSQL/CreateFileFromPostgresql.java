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

    public static void main(String args[]) throws SQLException {
        createList();
    }
}









