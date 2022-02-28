package estruturas;

import java.util.Locale;

public class FuncoesString {
    public static void main(String[] args) {

        String original = "ABC defg HIJ abc DEFg  ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2,9);
        String s06 = original.replace('a','x');
        String s07 = original.concat("a "+"b");

        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring: -" + s04 + "-");
        System.out.println("substring: -" + s05 + "-");
        System.out.println("replace: -" + s06 + "-");
        System.out.println("concat: -" + s07 + "-");
    }
}
