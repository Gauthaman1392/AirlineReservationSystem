
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
 *         &lt;element name="flightDetailsDeleteResponse" type="{http://www.example.org/FlightDetailsService/}flightDetailsDeleteResponseType"/>
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
    "flightDetailsDeleteResponse"
})
@XmlRootElement(name = "deleteFlightDetailsResponse")
public class DeleteFlightDetailsResponse {

    @XmlElement(required = true)
    protected FlightDetailsDeleteResponseType flightDetailsDeleteResponse;

    /**
     * Gets the value of the flightDetailsDeleteResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsDeleteResponseType }
     *     
     */
    public FlightDetailsDeleteResponseType getFlightDetailsDeleteResponse() {
        return flightDetailsDeleteResponse;
    }

    /**
     * Sets the value of the flightDetailsDeleteResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsDeleteResponseType }
     *     
     */
    public void setFlightDetailsDeleteResponse(FlightDetailsDeleteResponseType value) {
        this.flightDetailsDeleteResponse = value;
    }

}
