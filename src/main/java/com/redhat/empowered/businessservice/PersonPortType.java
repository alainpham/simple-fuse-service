package com.redhat.empowered.businessservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.4.redhat-621090
 * 2016-09-26T00:40:43.786+03:00
 * Generated source version: 3.0.4.redhat-621090
 * 
 */
@WebService(targetNamespace = "http://www.redhat.com/empowered/businessService", name = "personPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PersonPortType {

    @WebMethod
    @WebResult(name = "person", targetNamespace = "http://www.redhat.com/empowered/businessService", partName = "parameters")
    public Person getPersonOp(
        @WebParam(partName = "parameters", name = "queryPerson", targetNamespace = "http://www.redhat.com/empowered/businessService")
        QueryPerson parameters
    );
}
