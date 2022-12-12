package genFiles;

import java.util.ArrayList;
import java.util.List;

import variab.UtilsLocal;

import static variab.Numeric.randomNumber;

public class GenFile {

    private static String ctlLoading = randomNumber(8);

    public static void main(String[] args) {
        System.out.println(createParentList());

    }

    private static List<String> createParentList() {
        List<String> list = new ArrayList<String>() {{
            add(
                    "The first row" + "|" + "100" + "|" + ctlLoading + "\r\n" +
                    "The second row" + "|" + "200" + "|" + ctlLoading + "\r\n" +
                    "The third row" + "|" + "300" + "|" + ctlLoading + "\r\n"
            );
        }};
        return (list);
    }


}
