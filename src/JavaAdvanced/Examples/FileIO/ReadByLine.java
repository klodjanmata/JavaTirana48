package JavaAdvanced.Examples.FileIO;

import java.io.*;

public class ReadByLine {
    public static void main(String[] args) throws IOException {
        String inputFile = "Files\\input.txt";
        StringBuilder content = new StringBuilder();
        //String content = "";
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String line;
        while((line = br.readLine()) != null){
            //System.out.println(line);
            content.append(line).append(System.lineSeparator());
        }
        br.close();
        System.out.println(content);
    }
}
