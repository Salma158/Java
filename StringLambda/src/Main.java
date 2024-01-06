//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String betterString(String s1, String s2, BetterString lambda) {
        return lambda.isBetter(s1, s2) ? s1 : s2;
    }

    public static void main(String[] args) {
        String string1 = "salma";
        String string2 = "sherif";

        String longer = betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("longer string: " + longer);

        String first = betterString(string1, string2, (s1, s2) -> true);
        System.out.println("first string: " + first);
    }
}
