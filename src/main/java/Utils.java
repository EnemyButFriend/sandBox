import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;

public class Utils {

    public static Random random = new Random();

    public static List readByJava7(String fileName) throws IOException {
        return Files.readAllLines(new File(fileName).toPath(), Charset.defaultCharset());
    }
}
