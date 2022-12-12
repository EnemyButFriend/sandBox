package variab;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class UtilsLocal {

    private static final Random random = new Random();
    private static final String numbers = "123456789";


    public static List readFile(String fileName) throws IOException {
        return Files.readAllLines(new File(fileName).toPath(), Charset.defaultCharset());
    }

    public static String randomNumber(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++)
            stringBuilder.append(numbers.charAt(random.nextInt(numbers.length())));
        return stringBuilder.toString();
    }

    public static void ListToFile(List<String> listName, String outputFile) throws IOException {
        FileWriter writer = new FileWriter(outputFile);
        for (String str : listName) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();

    }

    public static void ListToFile2(List<String> listName, String outputFile) {
        Path output = Paths.get(outputFile);
        try {
            Files.write(output, listName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    public static Statement ConnectionPostgreSQL(String serverUrl, String user, String password) {
//        Connection c = null;
//        Statement stmt = null;
//        try {
//            Class.forName("org.postgresql.Driver");
//            c = DriverManager
//                    .getConnection(serverUrl,
//                            user, password);
//            c.setAutoCommit(false);
//            System.out.println("Opened database successfully");
//            stmt = c.createStatement();
//
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//            System.exit(0);
//        }
//
//        return stmt;
//    }


//    public static void readResources(String pathResourcesIn, List<String> listOut) {
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClassLoader().getResourceAsStream(pathResourcesIn)))) {
//            while (br.ready())
//                listOut.add(br.readLine());
//        } catch (IOException ignored) {
//        }
//    }
}


