package deleteString;

import java.io.*;
import java.io.IOException;


public class DeleteUsedData {
    public static String filePath = "src/main/resources/data2.properties";
    public static void main(String[] args) throws IOException {
        removeLine(filePath, 1);
    }
    public static void removeLine(String filePath, int deleteLine){
        String tempFile = "temp.properties";
        File oldFile = new File(filePath);
        File newFile = new File(tempFile);
        int line = 0;
        String currentLine;

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(filePath);
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



