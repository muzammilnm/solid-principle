package interfacesegregation.isp;

import org.w3c.dom.Document;

public class MiltiFunctionPrinter implements Printer, Scanner, Fax, DuplexPrinter {

    @Override
    public void printDuplex(Document document) {
        System.out.println("print duplex : " + document.toString());
    }

    @Override
    public void fax(Document document) {
        System.out.println("print fax : " + document.toString());
    }

    @Override
    public void scan(Document document) {
        System.out.println("scan : " + document.toString());
    }

    @Override
    public void print(Document document) {
        System.out.println("print : " + document.toString());
    }
    
}
