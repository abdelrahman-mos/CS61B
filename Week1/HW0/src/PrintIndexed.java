public class PrintIndexed {
    public static void printIndexed(String inString) {
        System.out.println(inString);
        StringBuilder newString = new StringBuilder();
        int inStringLength = inString.length();
        for (int i = inStringLength-1; i >= 0; i--) {
            newString.append(inString.charAt(inStringLength - 1 - i));
            newString.append(i);
        }
        String output_string = newString.toString();
        System.out.println(output_string);
    }

    public static void main(String[] args) {
        printIndexed("ZELDA");
    }
}
