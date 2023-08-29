package service;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Utils {




    public static List readFile(String fileName) throws IOException {
        return Files.readAllLines(new File(fileName).toPath(), Charset.defaultCharset());
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
    public static String createString(String firstColumn, String secondColumn, String thirdColumn, String forthColumn,
                                       String fifthColumn, String sixthColumn, String seventhColumn, String eighthColumn, String ninthColumn, String tenthColumn) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = String.valueOf(stringBuilder.append((
                firstColumn + "," +
                        secondColumn + "," +
                        thirdColumn + "," +
                        forthColumn + "," +
                        "try-la-last"
        )));
        return string;
    }



//    public static void readResources(String pathResourcesIn, List<String> listOut) {
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClassLoader().getResourceAsStream(pathResourcesIn)))) {
//            while (br.ready())
//                listOut.add(br.readLine());
//        } catch (IOException ignored) {
//        }
//    }
}


