import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        String filename = "src/main/resources/data/data.properties";
        List<String> list = Utils.readByJava7(filename);


        String[] list2 = list.get(Utils.random.nextInt(list.size())).split(",");
        String first = list2[0];
        String second2 = list2[1];
        System.out.printf("" + first + "," + second2);
        System.out.printf("" + first + "," + second2);

    }

}