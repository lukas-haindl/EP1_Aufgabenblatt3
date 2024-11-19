/*
    Aufgabe 2) Überladen von Methoden
*/
public class Aufgabe2 {

    private static void addChar(String text, char character) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            if (!(i == text.length() - 1)) {
                if (i % 2 != 0){
                    System.out.print(character);
                }else{
                    System.out.print(character + "" + character);
                }
            }
        }
        System.out.println();
    }

    private static void addChar(int number, char character) {
        addChar(Integer.toString(number), character);
    }

    private static void addChar(String text, String characters) {
        if (characters.length() > 0) {
            addChar(text, characters.charAt(0));
            addChar(text, characters.substring(1));
        }
    }

    private static void addChar(String text) {
        addChar(text, '=');
    }

    public static void main(String[] args) {
        String text0 = "";
        String text1 = "A";
        String text2 = "CW";
        String text3 = "EP1";
        String text4 = "Index";

        addChar(text0, '&');
        addChar(text1, '+');
        addChar(text2, '*');
        addChar(text3, '-');
        addChar(text4, '#');
        System.out.println();

        addChar(1, '.');
        addChar(42, ':');
        addChar(148, '$');
        addChar(2048, ')');
        addChar(131719, '%');
        System.out.println();

        addChar(text2, "!O(");
        addChar(text4, "T1#+");
        System.out.println();

        addChar(text1);
        addChar(text2);
        addChar(text3);
    }
}
