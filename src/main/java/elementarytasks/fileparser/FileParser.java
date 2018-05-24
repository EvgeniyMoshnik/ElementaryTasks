package elementarytasks.fileparser;

import java.io.*;
import java.util.Scanner;

public class FileParser {

    StringBuffer fileReade(String path) {
        StringBuffer fileText = new StringBuffer();
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path));) {
            Scanner scanner = new Scanner(br);
           // scanner.useDelimiter("\n");

            while (scanner.hasNextLine()) {
                fileText.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Incorrect data!");
        }
        return fileText;
    }

    int countString(StringBuffer text, String search) {
        int counter = 0;
        int index;
        index = text.indexOf(search);
        while (index >= 0) {
            counter++;
          index = text.indexOf(search, index + search.length());
        }

        return counter;
    }

    StringBuffer searchReplace(StringBuffer text, String searchText, String replaceText) {
        int index;
     //   String firstHalf;
        String secondHalf;
        index = text.indexOf(searchText);
        while (index >= 0) {
          //  firstHalf = text.substring(0, index + searchText.length());
            secondHalf = text.substring(index + searchText.length());
           // String s = replaceText + substring;
            text.delete(index + searchText.length(), text.length());
            text.replace(index, index + replaceText.length(), replaceText);
            text.append(secondHalf);
            index = text.indexOf(searchText, index + replaceText.length());
        }
        return text;
    }

    void writeReplaced(StringBuffer text, String path) {
        try(BufferedWriter bw =
        new BufferedWriter(new FileWriter(path))) {
            bw.write(text.toString());
        } catch (IOException e) {
            System.out.println("Write error!");
        }
    }
}
