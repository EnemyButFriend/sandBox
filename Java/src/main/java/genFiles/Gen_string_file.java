package genFiles;

import service.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Gen_string_file {


    public static Random random = new Random();

    public static void main(String[] args) throws IOException {
        List <String> myList = createList();
        String outputFile = "Users.txt";
        System.out.println(myList);
        Utils.ListToFile(myList, outputFile);

    }

    private static List<String> createList() {

        List<String> list = new ArrayList<>();
        for (int c = 0; c < 40001; c++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(("user_" + c + "@x5-test.kronograf.ru" + "," + "123456"));
            list.add(stringBuilder.toString());
        }
        return list;
    }



}



