
package com.ctl.as.domain.geo.v2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AddressService", targetNamespace = "http://geo.domain.as.ctl.com/v2", wsdlLocation = "file:/C:/1PCenturyLink/WSDLs/Real-WSDLs/AddressService.xml")
public class AddressService
    extends Service
{

    private final static URL ADDRESSSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADDRESSSERVICE_EXCEPTION;
    private final static QName ADDRESSSERVICE_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "AddressService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/1PCenturyLink/WSDLs/Real-WSDLs/AddressService.xml");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDRESSSERVICE_WSDL_LOCATION = url;
        ADDRESSSERVICE_EXCEPTION = e;
    }

    public AddressService() {
        super(__getWsdlLocation(), ADDRESSSERVICE_QNAME);
    }

    public AddressService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDRESSSERVICE_QNAME, features);
    }

    public AddressService(URL wsdlLocation) {
        super(wsdlLocation, ADDRESSSERVICE_QNAME);
    }

    public AddressService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDRESSSERVICE_QNAME, features);
    }

    public AddressService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddressService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AddressServiceContract
     */
    @WebEndpoint(name = "BasicHttpBinding_AddressServiceContract")
    public AddressServiceContract getBasicHttpBindingAddressServiceContract() {
        return super.getPort(new QName("http://geo.domain.as.ctl.com/v2", "BasicHttpBinding_AddressServiceContract"), AddressServiceContract.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddressServiceContract
     */
    @WebEndpoint(name = "BasicHttpBinding_AddressServiceContract")
    public AddressServiceContract getBasicHttpBindingAddressServiceContract(WebServiceFeature... features) {
        return super.getPort(new QName("http://geo.domain.as.ctl.com/v2", "BasicHttpBinding_AddressServiceContract"), AddressServiceContract.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDRESSSERVICE_EXCEPTION!= null) {
            throw ADDRESSSERVICE_EXCEPTION;
        }
        return ADDRESSSERVICE_WSDL_LOCATION;
    }

}
