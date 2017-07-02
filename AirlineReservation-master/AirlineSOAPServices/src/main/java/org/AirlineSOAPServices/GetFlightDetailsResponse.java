
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
 *         &lt;element name="flightDetailsGetResponse" type="{http://www.example.org/FlightDetailsService/}flightDetailsGetResponseType"/>
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
    "flightDetailsGetResponse"
})
@XmlRootElement(name = "getFlightDetailsResponse")
public class GetFlightDetailsResponse {

    @XmlElement(required = true)
    protected FlightDetailsGetResponseType flightDetailsGetResponse;

    /**
     * Gets the value of the flightDetailsGetResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsGetResponseType }
     *     
     */
    public FlightDetailsGetResponseType getFlightDetailsGetResponse() {
        return flightDetailsGetResponse;
    }

    /**
     * Sets the value of the flightDetailsGetResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsGetResponseType }
     *     
     */
    public void setFlightDetailsGetResponse(FlightDetailsGetResponseType value) {
        this.flightDetailsGetResponse = value;
    }

}
