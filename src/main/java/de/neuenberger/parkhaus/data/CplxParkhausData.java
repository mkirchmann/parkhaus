//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.14 um 02:12:39 PM CET 
//


package de.neuenberger.parkhaus.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse f�r CplxParkhausData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CplxParkhausData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="parking_facility_reference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originalname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="free" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="open" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="parking_facility_status_time" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="parking_facility_occupancy" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="totalNumberOfVacantParkingSpaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="freespaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="total_number_of_occupied_parking_spaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="occupiedspaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="allspaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="shortcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CplxParkhausData")
public class CplxParkhausData {

    @XmlAttribute(name = "parking_facility_reference")
    protected String parkingFacilityReference;
    @XmlAttribute(name = "originalname")
    protected String originalname;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "free")
    protected Boolean free;
    @XmlAttribute(name = "open")
    protected Boolean open;
    @XmlAttribute(name = "parking_facility_status_time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar parkingFacilityStatusTime;
    @XmlAttribute(name = "parking_facility_occupancy")
    protected Double parkingFacilityOccupancy;
    @XmlAttribute(name = "totalNumberOfVacantParkingSpaces")
    protected Integer totalNumberOfVacantParkingSpaces;
    @XmlAttribute(name = "freespaces")
    protected Integer freespaces;
    @XmlAttribute(name = "total_number_of_occupied_parking_spaces")
    protected Integer totalNumberOfOccupiedParkingSpaces;
    @XmlAttribute(name = "occupiedspaces")
    protected Integer occupiedspaces;
    @XmlAttribute(name = "allspaces")
    protected Integer allspaces;
    @XmlAttribute(name = "shortcode")
    protected String shortcode;

    /**
     * Ruft den Wert der parkingFacilityReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingFacilityReference() {
        return parkingFacilityReference;
    }

    /**
     * Legt den Wert der parkingFacilityReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingFacilityReference(String value) {
        this.parkingFacilityReference = value;
    }

    /**
     * Ruft den Wert der originalname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalname() {
        return originalname;
    }

    /**
     * Legt den Wert der originalname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalname(String value) {
        this.originalname = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der free-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFree() {
        return free;
    }

    /**
     * Legt den Wert der free-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFree(Boolean value) {
        this.free = value;
    }

    /**
     * Ruft den Wert der open-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpen() {
        return open;
    }

    /**
     * Legt den Wert der open-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpen(Boolean value) {
        this.open = value;
    }

    /**
     * Ruft den Wert der parkingFacilityStatusTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParkingFacilityStatusTime() {
        return parkingFacilityStatusTime;
    }

    /**
     * Legt den Wert der parkingFacilityStatusTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParkingFacilityStatusTime(XMLGregorianCalendar value) {
        this.parkingFacilityStatusTime = value;
    }

    /**
     * Ruft den Wert der parkingFacilityOccupancy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParkingFacilityOccupancy() {
        return parkingFacilityOccupancy;
    }

    /**
     * Legt den Wert der parkingFacilityOccupancy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParkingFacilityOccupancy(Double value) {
        this.parkingFacilityOccupancy = value;
    }

    /**
     * Ruft den Wert der totalNumberOfVacantParkingSpaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfVacantParkingSpaces() {
        return totalNumberOfVacantParkingSpaces;
    }

    /**
     * Legt den Wert der totalNumberOfVacantParkingSpaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfVacantParkingSpaces(Integer value) {
        this.totalNumberOfVacantParkingSpaces = value;
    }

    /**
     * Ruft den Wert der freespaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreespaces() {
        return freespaces;
    }

    /**
     * Legt den Wert der freespaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreespaces(Integer value) {
        this.freespaces = value;
    }

    /**
     * Ruft den Wert der totalNumberOfOccupiedParkingSpaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfOccupiedParkingSpaces() {
        return totalNumberOfOccupiedParkingSpaces;
    }

    /**
     * Legt den Wert der totalNumberOfOccupiedParkingSpaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfOccupiedParkingSpaces(Integer value) {
        this.totalNumberOfOccupiedParkingSpaces = value;
    }

    /**
     * Ruft den Wert der occupiedspaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccupiedspaces() {
        return occupiedspaces;
    }

    /**
     * Legt den Wert der occupiedspaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccupiedspaces(Integer value) {
        this.occupiedspaces = value;
    }

    /**
     * Ruft den Wert der allspaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllspaces() {
        return allspaces;
    }

    /**
     * Legt den Wert der allspaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllspaces(Integer value) {
        this.allspaces = value;
    }

    /**
     * Ruft den Wert der shortcode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcode() {
        return shortcode;
    }

    /**
     * Legt den Wert der shortcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcode(String value) {
        this.shortcode = value;
    }

}
