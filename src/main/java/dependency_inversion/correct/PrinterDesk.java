package dependency_inversion.correct;

public class PrinterDesk {
    private final Printer printer;

    public PrinterDesk(Printer printer) {
        super();
        this.printer = printer;
    }

    public void printFile() {
        printer.print("File Context!");
    }

}
