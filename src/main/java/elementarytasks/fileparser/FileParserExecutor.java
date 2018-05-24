package elementarytasks.fileparser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileParserExecutor {

    public static void main(String[] args) throws IOException {
        String path = "TextForParse.txt";
       // String line1 = args[1];
     //   String line2 = args[2];
     //   File file = new File("TextForParse.txt");
     //   file.createNewFile();
        FileParser fileParser = new FileParser();
        StringBuffer sb = fileParser.fileReade(path);
        System.out.println(sb);
        fileParser.searchReplace(sb, "gh", "OOO");
        System.out.println(sb);

        System.out.println(fileParser.countString(sb, "OOO"));
        fileParser.writeReplaced(sb, path);
    }
}
