package org.example;

import javax.xml.namespace.QName;

@WebService(targetNamespace="http://www.git.com")
@XmlElementDecl(namespace = "http://www.git.com")
public class test3 {
    private final static QName QNAME = new QName("http://www.git.com", "test3");


}
