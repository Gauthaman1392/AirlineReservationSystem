
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
 *         &lt;element name="flightDetailsCreateRequest" type="{http://www.example.org/FlightDetailsService/}flightDetailsCreateRequestType"/>
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
    "flightDetailsCreateRequest"
})
@XmlRootElement(name = "createFlightDetails")
public class CreateFlightDetails {

    @XmlElement(required = true)
    protected FlightDetailsCreateRequestType flightDetailsCreateRequest;

    /**
     * Gets the value of the flightDetailsCreateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsCreateRequestType }
     *     
     */
    public FlightDetailsCreateRequestType getFlightDetailsCreateRequest() {
        return flightDetailsCreateRequest;
    }

    /**
     * Sets the value of the flightDetailsCreateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsCreateRequestType }
     *     
     */
    public void setFlightDetailsCreateRequest(FlightDetailsCreateRequestType value) {
        this.flightDetailsCreateRequest = value;
    }

}
