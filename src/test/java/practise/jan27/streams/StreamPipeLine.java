package practise.jan27.streams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamPipeLine {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader(new File(System.getProperty
                ("user.dir") + "//FetchText.txt"));
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {

           while((line=bufferedReader.readLine())!=null) {
               System.out.println(line);
           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
