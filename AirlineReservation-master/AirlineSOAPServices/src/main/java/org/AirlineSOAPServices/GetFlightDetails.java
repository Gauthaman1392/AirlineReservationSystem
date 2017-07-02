
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
 *         &lt;element name="flightDetailsGetRequest" type="{http://www.example.org/FlightDetailsService/}flightDetailsGetRequestType"/>
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
    "flightDetailsGetRequest"
})
@XmlRootElement(name = "getFlightDetails")
public class GetFlightDetails {

    @XmlElement(required = true)
    protected FlightDetailsGetRequestType flightDetailsGetRequest;

    /**
     * Gets the value of the flightDetailsGetRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsGetRequestType }
     *     
     */
    public FlightDetailsGetRequestType getFlightDetailsGetRequest() {
        return flightDetailsGetRequest;
    }

    /**
     * Sets the value of the flightDetailsGetRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsGetRequestType }
     *     
     */
    public void setFlightDetailsGetRequest(FlightDetailsGetRequestType value) {
        this.flightDetailsGetRequest = value;
    }

}
