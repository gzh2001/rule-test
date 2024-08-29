package org.example;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceClient;

@WebService(targetNamespace="http://www.git1.com")
@XmlElementDecl(namespace = "http://www.git2.com")
@XmlType(namespace = "http://www.git3.com")
@WebServiceClient(wsdlLocation = "http://www.git4.com")
@WebParam(targetNamespace = "http://www.git5.com")
@javax.xml.bind.annotation.XmlSchema(namespace = "http://www.git6.com")
@XmlSchema(namespace = "http://www.git7.com")
public class test04_wsdl {

    private final static QName QNAME = new QName("http://www.git123qname.com", "test3");


}
