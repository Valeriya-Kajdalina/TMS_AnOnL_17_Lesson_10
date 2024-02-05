import java.util.ArrayList;

public class Printer {
    public static void printBlocksOfNumbers(String nameDocument) {
        System.out.println(nameDocument.substring(0, 4) + nameDocument.substring(9, 13));
    }
    public static void printBlocksNoLetters(String nameDocument) {
        nameDocument = nameDocument.replaceAll("[A-Za-z]{3}", "***");
        System.out.println(nameDocument);
    }

    public static void onlyLettersLowRegister(String nameDocument) {
        nameDocument = nameDocument.substring(5, 8) + nameDocument.substring(14, 17) +
                nameDocument.substring(19, 20)+ nameDocument.substring(21, 22);
        nameDocument = nameDocument.toLowerCase();
        StringBuffer letter = new StringBuffer(nameDocument);
        letter.insert(3, "/");
        letter.insert(7, "/");
        letter.insert(9, "/");
        System.out.println(letter);
    }
    public static void upperRegister (String nameDocument) {
        nameDocument = nameDocument.substring(5, 8) + nameDocument.substring(14, 17) +
                nameDocument.substring(19, 20)+ nameDocument.substring(21, 22);
        nameDocument = nameDocument.toUpperCase();
        StringBuilder firstWord = new StringBuilder("Letters");
        StringBuilder letter = new StringBuilder(nameDocument);
        letter.insert(3, "/");
        letter.insert(7, "/");
        letter.insert(9, "/");
        letter.insert(0, "Letters:");
        System.out.println(letter);
    }

    public static void ABC (String nameDocument) {
        String str1 = nameDocument.substring(0,4);
        String str2 = nameDocument.substring(9, 13);
        if (str1.compareToIgnoreCase("ABC") || str2.compareToIgnoreCase("ABC"))
            System.out.println("Номер доумента содержит последовательность АВС или abc");
        else
            System.out.println("Номер доумента не содержит последовательность АВС или abc");
    }

    public static void Start555 (String nameDocument) {
        System.out.println(nameDocument.startsWith("555") );
    }

    public static void End1a2b (String nameDocument) {
        String str1 = nameDocument.substring(18, 22);
        if (str1.compareToIgnoreCase("1a2b"))
            System.out.println("Номер доумента содержит последовательность 1a2b");
        else
            System.out.println("Номер доумента не содержит последовательность 1a2b");
    }
}