package dependency_inversion.incorrect;

public class DotMatrixPrinterPrinter {

    private String inc;

    public String getInc() {
        return inc;
    }

    public void setInc(String inc) {
        this.inc = inc;
    }

    public void print(String text){
        System.out.println(text);
    }

    public void printLine(String text){
        System.out.println(text);
    }
}
