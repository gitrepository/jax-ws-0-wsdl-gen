package com.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.ws.model.Offender;

//All we need is @WebService annotation. Rest are optional and still can genetare the sample WSDL
@WebService(name="OffenderService", targetNamespace="http://dcs.ga.gov/ws/dcsoffender")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class OffenderService {

    @WebMethod(operationName = "getOffenderById", action = "urn:getOffenderById")
    @WebResult(name = "getOffenderByIdResponse")
    public Offender getOffenderById(String offenderId){
	return new Offender();
    }
}
