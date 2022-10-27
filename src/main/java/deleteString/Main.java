package deleteString;

import javax.management.StringValueExp;
import java.io.*;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        removeLine(6);
    }
    public static void removeLine(int deleteLine){
        String tempFile = "src/main/resources/temp.properties";
        File oldFile = new File("src/main/resources/data2.properties");
        File newFile = new File(tempFile);
        int line = 0;
        String currentLine;

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader("src/main/resources/data2.properties");
            BufferedReader br = new BufferedReader(fr);

            while ((currentLine = br.readLine()) != null)
            {
                line++;

                if (deleteLine != line) {
                    pw.println(currentLine);
                }
            }

            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();
            oldFile.delete();
            File dump = new File("src/main/resources/data2.properties");
            newFile.renameTo(dump);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}



