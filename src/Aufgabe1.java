/*
    Aufgabe 1) Codeanalyse, Codingstyle und Methoden
*/
public class Aufgabe1 {
    //TODO zu Punkt a): Beschreiben Sie hier in 1-2 Sätzen was der Spaghetticode macht
    //Es wird ein Pattern erstellt, welches durch hohe Anzahl an verschachtelten Schleifen schwer nachvollziehbar ist
    //
    //

    //TODO zu Punkt b): Beschreiben Sie in 1-2 Sätzen was Sie ändern würden und warum
    //Ich würde den Code der öfter vorkommt in Methodenschreiben, weil damit er leichter zu verstehen ist
    //Die Fortmatierung würde ich ändern vor allem die Einrückungen
    //


    //TODO zu Punkt c und d): Implementieren Sie hier die Methoden Ihrer Lösung
    public static void printStartEndLine(int n){
        System.out.print("#");
        for (int i = 1; i <= n; i++) {System.out.print("+");}
        System.out.println("#");
    }
    public static void printTriangleTop(int n){
        for (int i = 1; i < (n/2 + 1); i++) {
            System.out.print("#");
            for (int j = 2; j <= (n / 2 - i + 1); j++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 2; j <= (n / 2 - i + 1); j++) {
                System.out.print(".");
            }
            System.out.print("#");System.out.println();
        }
    }
    public static void printTriangleBottom(int n){
        for (int i = 1; i < (n / 2 + 1); i++) {
            System.out.print("#");
            for (int j = 2; j <= i; j++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int j = 1; j <= (n - 2 * i); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 2; j <= i; j++) {
                System.out.print(".");
            }
            System.out.print("#");
            System.out.println();
        }
    }
    public static void printMiddlePart(int n){
        System.out.println("#|" + " ".repeat(n-2) + "|#");
    }


    public static void main(String args[]) {
        //********************************************************
        //TODO zu Punkt c,d und e): Implementieren Sie hier Ihre Lösung für die Angabe
        System.out.println("Ihre Ausgabe:");
        int n = 8;
        printStartEndLine(n);
        printTriangleTop(n);
        printMiddlePart(n);
        printTriangleBottom(n);
        printStartEndLine(n);
        //********************************************************

        System.out.println();
        System.out.println("Ausgabe Spaghetticode:");

        System.out.print("#");
        for (int i = 1; i <= 8; i++) {System.out.print("+");}
        System.out.println("#");

        for (int i = 1; i < 5; i++) {
        System.out.print("#");
        for (int j = 2; j <= (8 / 2 - i + 1); j++) {System.out.print(".");
        }
        System.out.print("/");
        for (int j = 1; j <= 2 * (i - 1); j++) {
            System.out.print(" ");
        }
            System.out.print("\\");
            for (int j = 2; j <= (8 / 2 - i + 1); j++) {
            System.out.print(".");
            }System.out.print("#");System.out.println();
        }

        System.out.println("#|      |#");
        for (int i = 1; i < 5; i++) {
        System.out.print("#");
        for (int j = 2; j <= i; j++) {
            System.out.print(".");
        }
            System.out.print("\\");
for (int j = 1; j <= (8 - 2 * i); j++) {
    System.out.print(" ");
}
            System.out.print("/");
            for (int j = 2; j <= i; j++) {
                System.out.print(".");
}
            System.out.print("#");
            System.out.println();
}

        System.out.print("#");
        for (int i = 1; i <= 8; i++) {
        System.out.print("+");}
        System.out.println("#");
    }
}


