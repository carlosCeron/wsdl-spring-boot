//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.07.25 a las 07:12:21 PM COT 
//


package com.carlosceron.usuarios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UsuarioDetalle" type="{http://carlosceron.com/usuarios}UsuarioDetalle"/>
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
    "usuarioDetalle"
})
@XmlRootElement(name = "GetUsuarioDetalleResponse")
public class GetUsuarioDetalleResponse {

    @XmlElement(name = "UsuarioDetalle", required = true)
    protected UsuarioDetalle usuarioDetalle;

    /**
     * Obtiene el valor de la propiedad usuarioDetalle.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioDetalle }
     *     
     */
    public UsuarioDetalle getUsuarioDetalle() {
        return usuarioDetalle;
    }

    /**
     * Define el valor de la propiedad usuarioDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioDetalle }
     *     
     */
    public void setUsuarioDetalle(UsuarioDetalle value) {
        this.usuarioDetalle = value;
    }

}
