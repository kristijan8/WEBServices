//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.02.19 at 11:58:39 \u043f\u043e\u043f\u043b. CET 
//


package allapis.com.example.webservices;

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
 *         &lt;element name="clubInfo" type="{http://webservices.example.com.allapis}clubInfo"/>
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
    "clubInfo"
})
@XmlRootElement(name = "getClubResponse")
public class GetClubResponse {

    @XmlElement(required = true)
    protected ClubInfo clubInfo;

    /**
     * Gets the value of the clubInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClubInfo }
     *     
     */
    public ClubInfo getClubInfo() {
        return clubInfo;
    }

    /**
     * Sets the value of the clubInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClubInfo }
     *     
     */
    public void setClubInfo(ClubInfo value) {
        this.clubInfo = value;
    }

}
