package variab;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;




public class UtilsLocal {

    private static final Random random = new Random();
    private static final String numbers = "123456789";


    public static List readFile(String fileName) throws IOException {
        return Files.readAllLines(new File(fileName).toPath(), Charset.defaultCharset());
    }
    public static String randomNumber(int num)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < num; i++)
            stringBuilder.append(numbers.charAt(random.nextInt(numbers.length())));
        return stringBuilder.toString();
    }

//    public static void readResources(String pathResourcesIn, List<String> listOut) {
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClassLoader().getResourceAsStream(pathResourcesIn)))) {
//            while (br.ready())
//                listOut.add(br.readLine());
//        } catch (IOException ignored) {
//        }
//    }

}
