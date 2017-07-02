
package org.AirlineSOAPServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightDetailsDeleteRequest" type="{http://www.example.org/FlightDetailsService/}flightDetailsDeleteRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightDetailsDeleteRequest"
})
@XmlRootElement(name = "deleteFlightDetails")
public class DeleteFlightDetails {

    @XmlElement(required = true)
    protected FlightDetailsDeleteRequestType flightDetailsDeleteRequest;

    /**
     * Gets the value of the flightDetailsDeleteRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsDeleteRequestType }
     *     
     */
    public FlightDetailsDeleteRequestType getFlightDetailsDeleteRequest() {
        return flightDetailsDeleteRequest;
    }

    /**
     * Sets the value of the flightDetailsDeleteRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsDeleteRequestType }
     *     
     */
    public void setFlightDetailsDeleteRequest(FlightDetailsDeleteRequestType value) {
        this.flightDetailsDeleteRequest = value;
    }

}
