interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

interface MultifunctionalPrinter extends Printer, Scanner, Fax { }

class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

class PrinterScanner implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

class FullyFunctionalPrinter implements MultifunctionalPrinter {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("Sending fax...");
    }
}

public class Main {
    public static void main(String[] args) {
       
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print();

        PrinterScanner printerScanner = new PrinterScanner();
        printerScanner.print();
        printerScanner.scan();

        MultifunctionalPrinter fullPrinter = new FullyFunctionalPrinter();
        fullPrinter.print();
        fullPrinter.scan();
        fullPrinter.fax();
    }
}
