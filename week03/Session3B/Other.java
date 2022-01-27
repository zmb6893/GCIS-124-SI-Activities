package week03.Session3B;

public class Other {
    public static void main(String[] args) {
        // trim
        String justYourTypicalString = "\n\tthis is just a string ;) \tstill a string :)";
        System.out.println(justYourTypicalString);
        String strippedString = justYourTypicalString.trim();
        System.out.println(strippedString);

        // parse
        String[] parsedString = justYourTypicalString.split(" ");
        for (String string: parsedString){
            System.out.println((string));
        }
    }
}
