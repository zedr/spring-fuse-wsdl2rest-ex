package org.apache.account;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11.fuse-000243-redhat-1
 * 2019-11-06T17:40:10.268+01:00
 * Generated source version: 3.1.11.fuse-000243-redhat-1
 * 
 */
@WebService(targetNamespace = "http://apache.org/account", name = "AccountServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
public interface AccountServiceImpl {

    @WebMethod
    @RequestWrapper(localName = "findAccount", targetNamespace = "http://apache.org/account", className = "org.apache.account.FindAccount")
    @ResponseWrapper(localName = "findAccountResponse", targetNamespace = "http://apache.org/account", className = "org.apache.account.FindAccountResponse")
    @WebResult(name = "accountResponse", targetNamespace = "")
    public org.apache.account.AccountRespone findAccount(
        @WebParam(name = "accountRequest", targetNamespace = "")
        org.apache.account.AccountRequest accountRequest
    ) throws AccountException_Exception;

    @WebMethod
    @RequestWrapper(localName = "ping", targetNamespace = "http://apache.org/account", className = "org.apache.account.Ping")
    @ResponseWrapper(localName = "pingResponse", targetNamespace = "http://apache.org/account", className = "org.apache.account.PingResponse")
    public void ping(
        @WebParam(name = "ping", targetNamespace = "")
        java.lang.String ping
    );
}
