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
    String pureIP1 = "192.168.1.1";
    String pureIP2 = "10.0.0.5";

    String ipWithPath1 = "192.168.1.1/path/to/resource";
    String ipWithPath2 = "10.0.0.5/another/path";

    String protocolIPPath1 = "http://192.168.1.1/path/to/resource";
    String protocolIPPath2 = "https://10.0.0.5/another/path";

    String website1 = "example.com";
    String website2 = "testsite.org";

    String websiteWithPath1 = "example.com/path/to/resource";
    String websiteWithPath2 = "testsite.org/another/path";

    String protocolWebsitePath1 = "http://example.com/path/to/resource";
    String protocolWebsitePath2 = "https://testsite.org/another/path";


}
