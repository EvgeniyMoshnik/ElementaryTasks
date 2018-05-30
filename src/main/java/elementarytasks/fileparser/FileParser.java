package elementarytasks.fileparser;

import java.io.*;
import java.util.Scanner;

public class FileParser {

    StringBuffer fileReade(String path) {
        StringBuffer fileText = new StringBuffer();
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            Scanner scanner = new Scanner(br);
            while (scanner.hasNext()) {
                fileText.append(scanner.nextLine());
                fileText.append("\r\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Incorrect data!");
        }
        return fileText;
    }

    public int countString(StringBuffer text, String search) {
        int counter = 0;
        int index;
        index = text.indexOf(search);
        while (index >= 0) {
            counter++;
            index = text.indexOf(search, index + search.length());
        }
        return counter;
    }

    public StringBuffer searchReplace(StringBuffer text, String searchText, String replaceText) {
        int index;
        String secondHalf;
        index = text.indexOf(searchText);
        while (index >= 0) {
            secondHalf = text.substring(index + searchText.length());
            text.delete(index + searchText.length(), text.length());
            text.replace(index, index + replaceText.length(), replaceText);
            text.append(secondHalf);
            index = text.indexOf(searchText, index + replaceText.length());
        }
        return text;
    }

    void writeReplaced(StringBuffer text, String path) {
        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter(path))) {
            bw.write(text.toString());
        } catch (IOException e) {
            System.out.println("Write error!");
        }
    }
}
