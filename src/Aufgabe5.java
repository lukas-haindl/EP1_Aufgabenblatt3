/*
    Aufgabe 5) Rekursion
*/
public class Aufgabe5 {

    private static String orderCharGroups(String text) {
        if (text.length() <= 1) {
            return text;
        } else {
            String tmp = orderCharGroups(text.substring(1));
            if (text.charAt(0) == text.charAt(text.length() - 1)) {
                return text.charAt(0) + tmp;
            } else {
                return tmp + text.charAt(0);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(orderCharGroups(""));
        System.out.println(orderCharGroups("1"));
        System.out.println(orderCharGroups("12"));
        System.out.println(orderCharGroups("1212"));
        System.out.println(orderCharGroups("abbaaababbaa"));
        System.out.println(orderCharGroups("ABBA"));
        System.out.println(orderCharGroups("11221122"));
        System.out.println(orderCharGroups("AAAAAA"));
        System.out.println();

    }
}
