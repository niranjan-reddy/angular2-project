
package com.ctl.ecaps.service.enterpriseadmin;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.ctl.ecaps.serviceobject.CardAccessNumberSO;
import com.ctl.ecaps.serviceobject.EnterpriseProductSO;
import com.ctl.ecaps.serviceobject.EnterpriseSO;
import com.ctl.ecaps.serviceobject.UserSO;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EnterpriseAdminService", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
@XmlSeeAlso({
    com.ctl.ecaps.exceptions.ObjectFactory.class,
    com.ctl.ecaps.service.enterpriseadmin.ObjectFactory.class,
    com.ctl.ecaps.serviceobject.ObjectFactory.class
})
public interface EnterpriseAdminService {


    /**
     * 
     * @param respOrgIdList
     * @param rmcId
     * @return
     *     returns java.lang.String
     * @throws ServiceValidationException
     * @throws ServiceAuthenticationException
     * @throws ServiceSystemException
     * @throws ServiceAuthorizationException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "assignRespOrgIdsByRmcId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.AssignRespOrgIdsByRmcId")
    @ResponseWrapper(localName = "assignRespOrgIdsByRmcIdResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.AssignRespOrgIdsByRmcIdResponse")
    public String assignRespOrgIdsByRmcId(
        @WebParam(name = "rmcId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String rmcId,
        @WebParam(name = "respOrgIdList", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        List<String> respOrgIdList)
        throws ServiceAuthenticationException, ServiceAuthorizationException, ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param enterprise
     * @throws ServiceValidationException
     * @throws ServiceAuthenticationException
     * @throws ServiceSystemException
     * @throws ServiceDataAccessException
     * @throws ServiceAuthorizationException
     */
    @WebMethod
    @RequestWrapper(localName = "updateEnterprise", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.UpdateEnterprise")
    @ResponseWrapper(localName = "updateEnterpriseResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.UpdateEnterpriseResponse")
    public void updateEnterprise(
        @WebParam(name = "enterprise", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        EnterpriseSO enterprise)
        throws ServiceAuthenticationException, ServiceAuthorizationException, ServiceDataAccessException, ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param enterpriseId
     * @return
     *     returns java.util.List<com.ctl.ecaps.serviceobject.CardAccessNumberSO>
     * @throws ServiceValidationException
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getCardAccessNumbers", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetCardAccessNumbers")
    @ResponseWrapper(localName = "getCardAccessNumbersResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetCardAccessNumbersResponse")
    public List<CardAccessNumberSO> getCardAccessNumbers(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId)
        throws ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param enterpriseId
     * @throws ServiceAuthenticationException
     * @throws ServiceSystemException
     * @throws ServiceDataAccessException
     * @throws ServiceAuthorizationException
     */
    @WebMethod
    @RequestWrapper(localName = "deactivateEnterprise", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.DeactivateEnterprise")
    @ResponseWrapper(localName = "deactivateEnterpriseResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.DeactivateEnterpriseResponse")
    public void deactivateEnterprise(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId)
        throws ServiceAuthenticationException, ServiceAuthorizationException, ServiceDataAccessException, ServiceSystemException
    ;

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "ping", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.Ping")
    @ResponseWrapper(localName = "pingResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.PingResponse")
    public boolean ping();

    /**
     * 
     * @param enterpriseId
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getEnterpriseGroups", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseGroups")
    @ResponseWrapper(localName = "getEnterpriseGroupsResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseGroupsResponse")
    public List<String> getEnterpriseGroups(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId)
        throws ServiceSystemException
    ;

    /**
     * 
     * @param parentEnterpriseId
     * @return
     *     returns java.util.List<com.ctl.ecaps.serviceobject.EnterpriseSO>
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getChildEnterprises", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetChildEnterprises")
    @ResponseWrapper(localName = "getChildEnterprisesResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetChildEnterprisesResponse")
    public List<EnterpriseSO> getChildEnterprises(
        @WebParam(name = "parentEnterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long parentEnterpriseId)
        throws ServiceSystemException
    ;

    /**
     * 
     * @param respOrgIdList
     * @param rmcId
     * @throws ServiceAuthenticationException
     * @throws ServiceValidationException
     * @throws ServiceSystemException
     * @throws ServiceAuthorizationException
     */
    @WebMethod
    @RequestWrapper(localName = "removeRespOrgsByRmcId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.RemoveRespOrgsByRmcId")
    @ResponseWrapper(localName = "removeRespOrgsByRmcIdResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.RemoveRespOrgsByRmcIdResponse")
    public void removeRespOrgsByRmcId(
        @WebParam(name = "rmcId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String rmcId,
        @WebParam(name = "respOrgIdList", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        List<String> respOrgIdList)
        throws ServiceAuthenticationException, ServiceAuthorizationException, ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param enterpriseChannels
     * @param enterpriseName
     * @return
     *     returns java.util.List<com.ctl.ecaps.serviceobject.EnterpriseSO>
     * @throws ServiceValidationException
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getActiveEnterprisesByName", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetActiveEnterprisesByName")
    @ResponseWrapper(localName = "getActiveEnterprisesByNameResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetActiveEnterprisesByNameResponse")
    public List<EnterpriseSO> getActiveEnterprisesByName(
        @WebParam(name = "enterpriseName", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String enterpriseName,
        @WebParam(name = "enterpriseChannels", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        List<String> enterpriseChannels)
        throws ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param enterpriseId
     * @param productArray
     * @return
     *     returns java.lang.String
     * @throws ServiceAuthenticationException
     * @throws ServiceSystemException
     * @throws ServiceAuthorizationException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "assignProductsToEnterprise", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.AssignProductsToEnterprise")
    @ResponseWrapper(localName = "assignProductsToEnterpriseResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.AssignProductsToEnterpriseResponse")
    public String assignProductsToEnterprise(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId,
        @WebParam(name = "productArray", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        List<String> productArray)
        throws ServiceAuthenticationException, ServiceAuthorizationException, ServiceSystemException
    ;

    /**
     * 
     * @param rmcId
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws ServiceValidationException
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getRespOrgIdsByRmcId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetRespOrgIdsByRmcId")
    @ResponseWrapper(localName = "getRespOrgIdsByRmcIdResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetRespOrgIdsByRmcIdResponse")
    public List<String> getRespOrgIdsByRmcId(
        @WebParam(name = "rmcId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String rmcId)
        throws ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param enterprise
     * @return
     *     returns java.lang.Long
     * @throws ServiceAuthenticationException
     * @throws ServiceValidationException
     * @throws ServiceSystemException
     * @throws ServiceDataAccessException
     * @throws ServiceRemoteCallException
     * @throws ServiceAuthorizationException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "createEnterprise", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.CreateEnterprise")
    @ResponseWrapper(localName = "createEnterpriseResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.CreateEnterpriseResponse")
    public Long createEnterprise(
        @WebParam(name = "enterprise", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        EnterpriseSO enterprise)
        throws ServiceAuthenticationException, ServiceAuthorizationException, ServiceDataAccessException, ServiceRemoteCallException, ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param respOrgIdList
     * @param enterpriseId
     * @throws ServiceValidationException
     * @throws ServiceAuthenticationException
     * @throws ServiceSystemException
     * @throws ServiceAuthorizationException
     */
    @WebMethod
    @RequestWrapper(localName = "removeRespOrgsByEnterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.RemoveRespOrgsByEnterpriseId")
    @ResponseWrapper(localName = "removeRespOrgsByEnterpriseIdResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.RemoveRespOrgsByEnterpriseIdResponse")
    public void removeRespOrgsByEnterpriseId(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId,
        @WebParam(name = "respOrgIdList", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        List<String> respOrgIdList)
        throws ServiceAuthenticationException, ServiceAuthorizationException, ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param statusType
     * @param searchType
     * @param searchValue
     * @param enterpriseType
     * @return
     *     returns java.util.List<com.ctl.ecaps.serviceobject.EnterpriseSO>
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getEnterpriseSummary", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseSummary")
    @ResponseWrapper(localName = "getEnterpriseSummaryResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseSummaryResponse")
    public List<EnterpriseSO> getEnterpriseSummary(
        @WebParam(name = "statusType", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String statusType,
        @WebParam(name = "enterpriseType", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String enterpriseType,
        @WebParam(name = "searchType", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String searchType,
        @WebParam(name = "searchValue", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String searchValue)
        throws ServiceSystemException
    ;

    /**
     * 
     * @param enterpriseId
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws ServiceValidationException
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getRespOrgIdsByEnterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetRespOrgIdsByEnterpriseId")
    @ResponseWrapper(localName = "getRespOrgIdsByEnterpriseIdResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetRespOrgIdsByEnterpriseIdResponse")
    public List<String> getRespOrgIdsByEnterpriseId(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId)
        throws ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param accountId
     * @param accountSystemCode
     * @return
     *     returns com.ctl.ecaps.serviceobject.EnterpriseSO
     * @throws ServiceValidationException
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getEnterpriseByAccount", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseByAccount")
    @ResponseWrapper(localName = "getEnterpriseByAccountResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseByAccountResponse")
    public EnterpriseSO getEnterpriseByAccount(
        @WebParam(name = "accountId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String accountId,
        @WebParam(name = "accountSystemCode", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String accountSystemCode)
        throws ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param enterpriseId
     * @param productArray
     * @return
     *     returns java.lang.String
     * @throws ServiceAuthenticationException
     * @throws ServiceSystemException
     * @throws ServiceAuthorizationException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "deleteProductsFromEnterprise", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.DeleteProductsFromEnterprise")
    @ResponseWrapper(localName = "deleteProductsFromEnterpriseResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.DeleteProductsFromEnterpriseResponse")
    public String deleteProductsFromEnterprise(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId,
        @WebParam(name = "productArray", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        List<String> productArray)
        throws ServiceAuthenticationException, ServiceAuthorizationException, ServiceSystemException
    ;

    /**
     * 
     * @param respOrgIdList
     * @param enterpriseId
     * @return
     *     returns java.lang.String
     * @throws ServiceValidationException
     * @throws ServiceAuthenticationException
     * @throws ServiceSystemException
     * @throws ServiceAuthorizationException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "assignRespOrgIdsByEnterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.AssignRespOrgIdsByEnterpriseId")
    @ResponseWrapper(localName = "assignRespOrgIdsByEnterpriseIdResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.AssignRespOrgIdsByEnterpriseIdResponse")
    public String assignRespOrgIdsByEnterpriseId(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId,
        @WebParam(name = "respOrgIdList", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        List<String> respOrgIdList)
        throws ServiceAuthenticationException, ServiceAuthorizationException, ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param enterpriseId
     * @return
     *     returns java.util.List<com.ctl.ecaps.serviceobject.EnterpriseProductSO>
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getEnterpriseProducts", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseProducts")
    @ResponseWrapper(localName = "getEnterpriseProductsResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseProductsResponse")
    public List<EnterpriseProductSO> getEnterpriseProducts(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId)
        throws ServiceSystemException
    ;

    /**
     * 
     * @param accountId
     * @param accountSystemCode
     * @return
     *     returns java.util.List<com.ctl.ecaps.serviceobject.EnterpriseSO>
     * @throws ServiceValidationException
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getEnterprisesByAccount", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterprisesByAccount")
    @ResponseWrapper(localName = "getEnterprisesByAccountResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterprisesByAccountResponse")
    public List<EnterpriseSO> getEnterprisesByAccount(
        @WebParam(name = "accountId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String accountId,
        @WebParam(name = "accountSystemCode", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        String accountSystemCode)
        throws ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param enterpriseId
     * @param userId
     * @return
     *     returns com.ctl.ecaps.serviceobject.EnterpriseSO
     * @throws ServiceValidationException
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getEnterprise", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterprise")
    @ResponseWrapper(localName = "getEnterpriseResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseResponse")
    public EnterpriseSO getEnterprise(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId,
        @WebParam(name = "userId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        Long userId)
        throws ServiceSystemException, ServiceValidationException
    ;

    /**
     * 
     * @param enterpriseId
     * @return
     *     returns java.util.List<com.ctl.ecaps.serviceobject.UserSO>
     * @throws ServiceSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
    @RequestWrapper(localName = "getEnterpriseUsers", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseUsers")
    @ResponseWrapper(localName = "getEnterpriseUsersResponse", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin", className = "com.ctl.ecaps.service.enterpriseadmin.GetEnterpriseUsersResponse")
    public List<UserSO> getEnterpriseUsers(
        @WebParam(name = "enterpriseId", targetNamespace = "http://ecaps.ctl.com/service/enterpriseAdmin")
        long enterpriseId)
        throws ServiceSystemException
    ;

}
