import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String str = "1432-Fgr-8765-SvR-5F7i";
        Printer.printBlocksOfNumbers(str);
        Printer.printBlocksNoLetters(str);
        Printer.onlyLettersLowRegister(str);
        Printer.upperRegister(str);
        Printer.ABC(str);
        Printer.Start555(str);
        Printer.End1a2b(str);
    }
}