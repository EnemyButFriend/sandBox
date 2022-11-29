package readResources;

import variab.UtilsLocal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReadResource {

    public static List<String> myList = new ArrayList();
    public static Random random = new Random();



    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/data.properties";
        myList = UtilsLocal.readFile(fileName);
        String[] line = myList.get(random.nextInt(myList.size())).split(",");
        System.out.println(line[0]);

    }
}
