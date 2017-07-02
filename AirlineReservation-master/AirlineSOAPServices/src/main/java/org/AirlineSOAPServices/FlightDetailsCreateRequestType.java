
package org.AirlineSOAPServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightDetailsCreateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightDetailsCreateRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flightDepartureDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="availableSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightDetailsCreateRequestType", propOrder = {
    "flightId",
    "flightDepartureDate",
    "price",
    "availableSeats"
})
public class FlightDetailsCreateRequestType {

    protected int flightId;
    @XmlElement(required = true)
    protected String flightDepartureDate;
    protected double price;
    protected int availableSeats;

    /**
     * Gets the value of the flightId property.
     * 
     */
    public int getFlightId() {
        return flightId;
    }

    /**
     * Sets the value of the flightId property.
     * 
     */
    public void setFlightId(int value) {
        this.flightId = value;
    }

    /**
     * Gets the value of the flightDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDepartureDate() {
        return flightDepartureDate;
    }

    /**
     * Sets the value of the flightDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDepartureDate(String value) {
        this.flightDepartureDate = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the availableSeats property.
     * 
     */
    public int getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Sets the value of the availableSeats property.
     * 
     */
    public void setAvailableSeats(int value) {
        this.availableSeats = value;
    }

}
