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
    String pureIP3 = "127.0.0.1";

    String ipWithPath1 = "192.168.1.1/path/to/resource";
    String ipWithPath2 = "10.0.0.5/another/path";
    String ipWithPath3 = "127.0.0.1:9999/another/path";

    String protocolIPPath1 = "http://192.168.1.1/path/to/resource";
    String protocolIPPath2 = "https://10.0.0.5/another/path";
    String protocolIPPath3 = "ftp://127.0.0.1:7777/another/path";

    String website1 = "example.com";
    String website2 = "testsite.org";

    String websiteWithPath1 = "example.com/path/to/resource";
    String websiteWithPath2 = "testsite.org/another/path";

    String protocolWebsitePath1 = "http://example.com/path/to/resource";
    String protocolWebsitePath2 = "https://testsite.org/another/path";


    // Windows 路径示例
    public static final String WINDOWS_FILE_PATH_1 = "C:\\Users\\User\\Documents\\file1.txt";
    public static final String WINDOWS_FILE_PATH_2 = "C:\\Program Files\\MyApp\\config.xml";

    // Linux 路径示例
    public static final String LINUX_FILE_PATH_1 = "/home/user/documents/file1.txt";
    public static final String LINUX_FILE_PATH_2 = "/etc/myapp/config.xml";

    // macOS 路径示例
    public static final String MAC_FILE_PATH_1 = "/Users/user/Documents/file1.txt";
    public static final String MAC_FILE_PATH_2 = "/Applications/MyApp/config.xml";

    // URL 路径示例
    public static final String URL_PATH_1 = "http://example.com/files/file1.txt";
    public static final String URL_PATH_2 = "https://example.com/app/config.json";

    // 文件相对路径示例
    public static final String RELATIVE_PATH_1 = "./documents/file1.txt";
    public static final String RELATIVE_PATH_2 = "../config/config.xml";

    // 特殊路径示例
    public static final String NETWORK_PATH = "\\\\192.168.1.100\\shared\\file1.txt";
    public static final String TEMP_DIR = "/tmp/app/logs/";

    // HTTP 协议示例
    public static final String HTTP_URL_1 = "http://203.0.113.10/api/v1/data";
    public static final String HTTP_URL_2 = "http://198.51.100.20:8080/service/query";
    public static final String HTTP_URL_3 = "http://203.0.113.100:9090/app/execute?wsdl";

    // HTTPS 协议示例
    public static final String HTTPS_URL_1 = "https://203.0.113.10:443/api/v2/submit";
    public static final String HTTPS_URL_2 = "https://198.51.100.30:8443/login";
    public static final String HTTPS_URL_3 = "https://203.0.113.50/service/soap?WSdl";

    // 带有查询参数的 URL 示例
    public static final String HTTP_URL_WITH_PARAM_1 = "http://203.0.113.10:80/data?WSDL";
    public static final String HTTPS_URL_WITH_PARAM_1 = "https://198.51.100.40/api/v1/process?wsDL&version=1.2";
    public static final String HTTP_URL_WITH_PARAM_2 = "http://203.0.113.100:8080/user/getData?wsdl&id=12345";

    // 更多 URL 示例
    public static final String HTTPS_URL_4 = "https://203.0.113.100/api/login?token=abc123";
    public static final String HTTP_URL_4 = "http://198.51.100.50:9000/query?wsdl&date=2024-11-06";


}
