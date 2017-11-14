//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.14 um 02:12:39 PM CET 
//


package de.neuenberger.parkhaus.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.neuenberger.parkhausdata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Root_QNAME = new QName("http://www.neuenberger.de/parkhausdata/", "Root");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.neuenberger.parkhausdata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CplxParkhausData }
     * 
     */
    public CplxParkhausData createCplxParkhausData() {
        return new CplxParkhausData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.neuenberger.de/parkhausdata/", name = "Root")
    public JAXBElement<String> createRoot(String value) {
        return new JAXBElement<String>(_Root_QNAME, String.class, null, value);
    }

}
