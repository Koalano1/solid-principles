package dependency_inversion;

import dependency_inversion.correct.DotMatrixPrinterPrinter;
import dependency_inversion.correct.Printer;
import dependency_inversion.correct.PrinterDesk;

public class Main {
    public static void main(String[] args) {
        Printer printer = new DotMatrixPrinterPrinter();
        PrinterDesk printerDesk = new PrinterDesk(printer);

        printerDesk.printFile();
    }
}