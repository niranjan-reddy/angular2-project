
package com.ctl.ecaps.service.enterpriseadmin;

import javax.xml.ws.WebFault;
import com.ctl.ecaps.serviceobject.FaultDetailSO;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ServiceDataAccessException", targetNamespace = "http://ecaps.ctl.com/exceptions")
public class ServiceDataAccessException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FaultDetailSO faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ServiceDataAccessException(String message, FaultDetailSO faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ServiceDataAccessException(String message, FaultDetailSO faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.ctl.ecaps.serviceobject.FaultDetailSO
     */
    public FaultDetailSO getFaultInfo() {
        return faultInfo;
    }

}
