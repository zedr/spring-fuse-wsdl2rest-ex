package org.apache.account;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11.fuse-000243-redhat-1
 * 2019-11-06T17:40:10.278+01:00
 * Generated source version: 3.1.11.fuse-000243-redhat-1
 * 
 */
@WebServiceClient(name = "AccountService", 
                  wsdlLocation = "file:/home/rdiscala/tmp/AccountPort.wsdl",
                  targetNamespace = "http://apache.org/account") 
public class AccountService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://apache.org/account", "AccountService");
    public final static QName AccountPort = new QName("http://apache.org/account", "AccountPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/rdiscala/tmp/AccountPort.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AccountService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/rdiscala/tmp/AccountPort.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AccountService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AccountService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AccountService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AccountService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AccountService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AccountServiceImpl
     */
    @WebEndpoint(name = "AccountPort")
    public AccountServiceImpl getAccountPort() {
        return super.getPort(AccountPort, AccountServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountServiceImpl
     */
    @WebEndpoint(name = "AccountPort")
    public AccountServiceImpl getAccountPort(WebServiceFeature... features) {
        return super.getPort(AccountPort, AccountServiceImpl.class, features);
    }

}
