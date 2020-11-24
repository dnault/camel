/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.servicenow;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ServiceNowEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ServiceNowEndpoint target = (ServiceNowEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiurl":
        case "apiUrl": target.getConfiguration().setApiUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "apiversion":
        case "apiVersion": target.getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dateformat":
        case "dateFormat": target.getConfiguration().setDateFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "datetimeformat":
        case "dateTimeFormat": target.getConfiguration().setDateTimeFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "display": target.getConfiguration().setDisplay(property(camelContext, java.lang.String.class, value)); return true;
        case "displayvalue":
        case "displayValue": target.getConfiguration().setDisplayValue(property(camelContext, java.lang.String.class, value)); return true;
        case "excludereferencelink":
        case "excludeReferenceLink": target.getConfiguration().setExcludeReferenceLink(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "favorites": target.getConfiguration().setFavorites(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "httpclientpolicy":
        case "httpClientPolicy": target.getConfiguration().setHttpClientPolicy(property(camelContext, org.apache.cxf.transports.http.configuration.HTTPClientPolicy.class, value)); return true;
        case "includeaggregates":
        case "includeAggregates": target.getConfiguration().setIncludeAggregates(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "includeavailableaggregates":
        case "includeAvailableAggregates": target.getConfiguration().setIncludeAvailableAggregates(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "includeavailablebreakdowns":
        case "includeAvailableBreakdowns": target.getConfiguration().setIncludeAvailableBreakdowns(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "includescorenotes":
        case "includeScoreNotes": target.getConfiguration().setIncludeScoreNotes(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "includescores":
        case "includeScores": target.getConfiguration().setIncludeScores(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "inputdisplayvalue":
        case "inputDisplayValue": target.getConfiguration().setInputDisplayValue(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mapper": target.getConfiguration().setMapper(property(camelContext, com.fasterxml.jackson.databind.ObjectMapper.class, value)); return true;
        case "models": target.getConfiguration().setModels(property(camelContext, java.util.Map.class, value)); return true;
        case "oauthclientid":
        case "oauthClientId": target.getConfiguration().setOauthClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthclientsecret":
        case "oauthClientSecret": target.getConfiguration().setOauthClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthtokenurl":
        case "oauthTokenUrl": target.getConfiguration().setOauthTokenUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "perpage":
        case "perPage": target.getConfiguration().setPerPage(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyauthorizationpolicy":
        case "proxyAuthorizationPolicy": target.getConfiguration().setProxyAuthorizationPolicy(property(camelContext, org.apache.cxf.configuration.security.ProxyAuthorizationPolicy.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxypassword":
        case "proxyPassword": target.getConfiguration().setProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyusername":
        case "proxyUserName": target.getConfiguration().setProxyUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "release": target.getConfiguration().setRelease(property(camelContext, org.apache.camel.component.servicenow.ServiceNowRelease.class, value)); return true;
        case "requestmodels":
        case "requestModels": target.getConfiguration().setRequestModels(property(camelContext, java.util.Map.class, value)); return true;
        case "resource": target.getConfiguration().setResource(property(camelContext, java.lang.String.class, value)); return true;
        case "responsemodels":
        case "responseModels": target.getConfiguration().setResponseModels(property(camelContext, java.util.Map.class, value)); return true;
        case "retrievetargetrecordonimport":
        case "retrieveTargetRecordOnImport": target.getConfiguration().setRetrieveTargetRecordOnImport(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "sortby":
        case "sortBy": target.getConfiguration().setSortBy(property(camelContext, java.lang.String.class, value)); return true;
        case "sortdir":
        case "sortDir": target.getConfiguration().setSortDir(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "suppressautosysfield":
        case "suppressAutoSysField": target.getConfiguration().setSuppressAutoSysField(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "suppresspaginationheader":
        case "suppressPaginationHeader": target.getConfiguration().setSuppressPaginationHeader(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "table": target.getConfiguration().setTable(property(camelContext, java.lang.String.class, value)); return true;
        case "target": target.getConfiguration().setTarget(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "timeformat":
        case "timeFormat": target.getConfiguration().setTimeFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "toplevelonly":
        case "topLevelOnly": target.getConfiguration().setTopLevelOnly(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username":
        case "userName": target.getConfiguration().setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiurl":
        case "apiUrl": return java.lang.String.class;
        case "apiversion":
        case "apiVersion": return java.lang.String.class;
        case "dateformat":
        case "dateFormat": return java.lang.String.class;
        case "datetimeformat":
        case "dateTimeFormat": return java.lang.String.class;
        case "display": return java.lang.String.class;
        case "displayvalue":
        case "displayValue": return java.lang.String.class;
        case "excludereferencelink":
        case "excludeReferenceLink": return java.lang.Boolean.class;
        case "favorites": return java.lang.Boolean.class;
        case "httpclientpolicy":
        case "httpClientPolicy": return org.apache.cxf.transports.http.configuration.HTTPClientPolicy.class;
        case "includeaggregates":
        case "includeAggregates": return java.lang.Boolean.class;
        case "includeavailableaggregates":
        case "includeAvailableAggregates": return java.lang.Boolean.class;
        case "includeavailablebreakdowns":
        case "includeAvailableBreakdowns": return java.lang.Boolean.class;
        case "includescorenotes":
        case "includeScoreNotes": return java.lang.Boolean.class;
        case "includescores":
        case "includeScores": return java.lang.Boolean.class;
        case "inputdisplayvalue":
        case "inputDisplayValue": return java.lang.Boolean.class;
        case "key": return java.lang.Boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "mapper": return com.fasterxml.jackson.databind.ObjectMapper.class;
        case "models": return java.util.Map.class;
        case "oauthclientid":
        case "oauthClientId": return java.lang.String.class;
        case "oauthclientsecret":
        case "oauthClientSecret": return java.lang.String.class;
        case "oauthtokenurl":
        case "oauthTokenUrl": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "perpage":
        case "perPage": return java.lang.Integer.class;
        case "proxyauthorizationpolicy":
        case "proxyAuthorizationPolicy": return org.apache.cxf.configuration.security.ProxyAuthorizationPolicy.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxypassword":
        case "proxyPassword": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyusername":
        case "proxyUserName": return java.lang.String.class;
        case "release": return org.apache.camel.component.servicenow.ServiceNowRelease.class;
        case "requestmodels":
        case "requestModels": return java.util.Map.class;
        case "resource": return java.lang.String.class;
        case "responsemodels":
        case "responseModels": return java.util.Map.class;
        case "retrievetargetrecordonimport":
        case "retrieveTargetRecordOnImport": return java.lang.Boolean.class;
        case "sortby":
        case "sortBy": return java.lang.String.class;
        case "sortdir":
        case "sortDir": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "suppressautosysfield":
        case "suppressAutoSysField": return java.lang.Boolean.class;
        case "suppresspaginationheader":
        case "suppressPaginationHeader": return java.lang.Boolean.class;
        case "synchronous": return boolean.class;
        case "table": return java.lang.String.class;
        case "target": return java.lang.Boolean.class;
        case "timeformat":
        case "timeFormat": return java.lang.String.class;
        case "toplevelonly":
        case "topLevelOnly": return java.lang.Boolean.class;
        case "username":
        case "userName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ServiceNowEndpoint target = (ServiceNowEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiurl":
        case "apiUrl": return target.getConfiguration().getApiUrl();
        case "apiversion":
        case "apiVersion": return target.getConfiguration().getApiVersion();
        case "dateformat":
        case "dateFormat": return target.getConfiguration().getDateFormat();
        case "datetimeformat":
        case "dateTimeFormat": return target.getConfiguration().getDateTimeFormat();
        case "display": return target.getConfiguration().getDisplay();
        case "displayvalue":
        case "displayValue": return target.getConfiguration().getDisplayValue();
        case "excludereferencelink":
        case "excludeReferenceLink": return target.getConfiguration().getExcludeReferenceLink();
        case "favorites": return target.getConfiguration().getFavorites();
        case "httpclientpolicy":
        case "httpClientPolicy": return target.getConfiguration().getHttpClientPolicy();
        case "includeaggregates":
        case "includeAggregates": return target.getConfiguration().getIncludeAggregates();
        case "includeavailableaggregates":
        case "includeAvailableAggregates": return target.getConfiguration().getIncludeAvailableAggregates();
        case "includeavailablebreakdowns":
        case "includeAvailableBreakdowns": return target.getConfiguration().getIncludeAvailableBreakdowns();
        case "includescorenotes":
        case "includeScoreNotes": return target.getConfiguration().getIncludeScoreNotes();
        case "includescores":
        case "includeScores": return target.getConfiguration().getIncludeScores();
        case "inputdisplayvalue":
        case "inputDisplayValue": return target.getConfiguration().getInputDisplayValue();
        case "key": return target.getConfiguration().getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mapper": return target.getConfiguration().getMapper();
        case "models": return target.getConfiguration().getModels();
        case "oauthclientid":
        case "oauthClientId": return target.getConfiguration().getOauthClientId();
        case "oauthclientsecret":
        case "oauthClientSecret": return target.getConfiguration().getOauthClientSecret();
        case "oauthtokenurl":
        case "oauthTokenUrl": return target.getConfiguration().getOauthTokenUrl();
        case "password": return target.getConfiguration().getPassword();
        case "perpage":
        case "perPage": return target.getConfiguration().getPerPage();
        case "proxyauthorizationpolicy":
        case "proxyAuthorizationPolicy": return target.getConfiguration().getProxyAuthorizationPolicy();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxypassword":
        case "proxyPassword": return target.getConfiguration().getProxyPassword();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyusername":
        case "proxyUserName": return target.getConfiguration().getProxyUserName();
        case "release": return target.getConfiguration().getRelease();
        case "requestmodels":
        case "requestModels": return target.getConfiguration().getRequestModels();
        case "resource": return target.getConfiguration().getResource();
        case "responsemodels":
        case "responseModels": return target.getConfiguration().getResponseModels();
        case "retrievetargetrecordonimport":
        case "retrieveTargetRecordOnImport": return target.getConfiguration().getRetrieveTargetRecordOnImport();
        case "sortby":
        case "sortBy": return target.getConfiguration().getSortBy();
        case "sortdir":
        case "sortDir": return target.getConfiguration().getSortDir();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "suppressautosysfield":
        case "suppressAutoSysField": return target.getConfiguration().getSuppressAutoSysField();
        case "suppresspaginationheader":
        case "suppressPaginationHeader": return target.getConfiguration().getSuppressPaginationHeader();
        case "synchronous": return target.isSynchronous();
        case "table": return target.getConfiguration().getTable();
        case "target": return target.getConfiguration().getTarget();
        case "timeformat":
        case "timeFormat": return target.getConfiguration().getTimeFormat();
        case "toplevelonly":
        case "topLevelOnly": return target.getConfiguration().getTopLevelOnly();
        case "username":
        case "userName": return target.getConfiguration().getUserName();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "models": return java.lang.Class.class;
        case "requestmodels":
        case "requestModels": return java.lang.Class.class;
        case "responsemodels":
        case "responseModels": return java.lang.Class.class;
        default: return null;
        }
    }
}

