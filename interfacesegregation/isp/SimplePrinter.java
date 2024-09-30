package interfacesegregation.isp;

import org.w3c.dom.Document;

public class SimplePrinter implements Printer {

    @Override
    public void print(Document document) {
        System.out.println("print document : " + document.toString());
    }
    
}
