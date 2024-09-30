package interfacesegregation.notisp;

import org.w3c.dom.Document;

public interface Printer {
    void print(Document document);
    void scan(Document document);
    void fax(Document document);
    void printDuplex(Document document);
}
