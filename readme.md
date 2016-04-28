* This project is to generate a dummy WSDL + Schema (Contract Last) rather than writing it from scratch.
* Generated WSDL will then be fine tuned to meet the requirement and used for generating 
  -both Server (wsgen) and Client (wsimport) stubs (Contract First).
  
* @WebService(name="OffenderService") : <portType name="OffenderService">
* @WebMethod(operationName = "getOffenderById") : <message name="getOffenderById"> && <message name="getOffenderByIdResponse">

* @WebParam(name="offenderId") : <xs:element name="offenderId" ../> INSTEAD OF <xs:element name="arg0" ../>
* @WebResult(name = "getOffenderByIdResponse") : <xs:element name="getOffenderByIdResponse" ../> INSTEAD OF <xs:element name="return" ../>
 