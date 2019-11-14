package co_creation2.exercise05;

import co_creation2.exercise01.Printer;

public class MagazineApplication {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();
        Printer printer = new Printer();
        printer.printMagazine(magazine);
    }


}
