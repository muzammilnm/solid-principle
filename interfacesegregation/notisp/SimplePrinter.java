package interfacesegregation.notisp;

import org.w3c.dom.Document;

public class SimplePrinter implements Printer {

    @Override
    public void print(Document document) {
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

    @Override
    public void scan(Document document) {
        throw new UnsupportedOperationException("Unimplemented method 'scan'");
    }

    @Override
    public void fax(Document document) {
        throw new UnsupportedOperationException("Unimplemented method 'fax'");
    }

    @Override
    public void printDuplex(Document document) {
        throw new UnsupportedOperationException("Unimplemented method 'printDuplex'");
    }
    
}
