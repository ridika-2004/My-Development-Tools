public class PrinterAdapter implements AdvancedPrinter {
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printBold(String text) {
        legacyPrinter.printText("**" + text + "**");
    }

    @Override
    public void printItalic(String text) {
        legacyPrinter.printText("_" + text + "_");
    }
}
