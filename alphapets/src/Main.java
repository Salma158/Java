//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean containsOnlyAlphabets(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String input = "HelloWorld";

        if (containsOnlyAlphabets(input)) {
            System.out.println("The string contains only alphabets.");
            } else {
            System.out.println("The string does not contain only alphabets.");
        }
    }

}