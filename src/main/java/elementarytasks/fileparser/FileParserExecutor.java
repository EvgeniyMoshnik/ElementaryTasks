package elementarytasks.fileparser;

public class FileParserExecutor {

    private static String help = "File parser";

    public static void main(String[] args) {

        if (args.length <= 1) {
            System.out.println(help);
            return;
        }
        String path = args[0];
        String strCount = args[1];
        FileParser fileParser = new FileParser();
        StringBuffer sb = fileParser.fileReade(path);

        if (args.length == 2) {
            int quantity;
            quantity = fileParser.countString(sb, strCount);
            System.out.print("Quantity " + "\""+ strCount + "\": " + quantity);
        } else {
            String strReplace = args[2];
            fileParser.searchReplace(sb, strCount, strReplace);
            fileParser.writeReplaced(sb, path);
            System.out.println("String " + strCount + " replaced on " + strReplace + ".");
        }
    }
}
