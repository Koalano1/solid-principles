package dependency_inversion.incorrect;

public class PrinterDesk {
    private final DotMatrixPrinterPrinter printer;

    public PrinterDesk(DotMatrixPrinterPrinter printer) {
        super();
        this.printer = printer;
    }

    public void printFile() {
        printer.print("File Context!");
    }
}
