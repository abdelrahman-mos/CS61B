public class Stutter {
    public static void stutter(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.print(ch);
            System.out.print(ch);
        }
    }
    public static void main(String[] args) {
        stutter("Hello");
    }
}
