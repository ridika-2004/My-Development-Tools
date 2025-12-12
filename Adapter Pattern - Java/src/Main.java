public class Main {
    public static void main(String[] args) {
        LegacyPrinter oldPrinter = new LegacyPrinter();

        AdvancedPrinter printer = new PrinterAdapter(oldPrinter);

        printer.printBold("This is a bold text");
        printer.printItalic("This is a italic text");
    }
}
