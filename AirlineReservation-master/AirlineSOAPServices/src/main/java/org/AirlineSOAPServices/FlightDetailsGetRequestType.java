
package org.AirlineSOAPServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightDetailsGetRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightDetailsGetRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flightDepartureDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightDetailsGetRequestType", propOrder = {
    "flightId",
    "flightDepartureDate"
})
public class FlightDetailsGetRequestType {

    protected int flightId;
    @XmlElement(required = true)
    protected String flightDepartureDate;

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

}
