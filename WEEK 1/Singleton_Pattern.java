class Printer {
    private static Printer singlePrinter;
    private Printer() {
        System.out.println("Printer is ready.");
    }
    public static Printer createObject() {
        if (singlePrinter == null) {
            singlePrinter = new Printer();
        }
        return singlePrinter;
    }
    public void printDocument(String fileName) {
        System.out.println("Printing: " + fileName);
    }
}

public class Singleton_Pattern {
    public static void main(String[] args) {
        Printer p1 = Printer.createObject();
        p1.printDocument("File1.pdf");

        Printer p2 = Printer.createObject();
        p2.printDocument("File2.pdf");

        if (p1 == p2) {
            System.out.println("Both are the same printer.");
        } else {
            System.out.println("Different printers.");
        }
    }
}
