import service.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static service.Utils.readFile;

public class CreateFile {


    public static Random random = new Random();

    public static void main(String[] args) throws IOException {
        List <String> myList = createList();
        String outputFile = "output.txt";
        System.out.println(myList);
        Utils.ListToFile(myList, outputFile);

    }

    private static List<String> createList() {
        String fileName = "src/main/resources/data.properties";
        List<String> example;
        try {
            example = readFile(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> list = new ArrayList<>();
        for (int c = 0; c < 101; c++) {
            StringBuilder stringBuilder = new StringBuilder();

            String[] line = example.get(random.nextInt(example.size())).split(",");
            stringBuilder.append((
                    //a externalsystemclientid
                    line[0] + "|" +
                            //b Parent_key
                            line[1] + "|" +
                            //c Epk_id
                            c + "|" +
                            //d  (externalsystemclientid)
                            "try-la-la" + "|" +
                            //e  (equivalentsystemtype_code )
                            "try-la-la" + "|" +
                            //f
                            "try-la-la" + "|" +
                            //g
                            "try-la-la" + "|" +
                            //h //
                            "try-la-la" + "|" +
                            //i
                            "" + "|" +
                            //version
                            "try-la-la" + "|" +
                            //k //
                            "try-la-la" + "|" +
                            //l //TODO дата, час,мин
                            "try-la-la" + "|" +
                            "try-la-la" + "|" +
                            //ctlLoading
                            "try-la-last"
            ));
            list.add(stringBuilder.toString());
        }
        return list;
    }

}
