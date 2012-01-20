<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri='/WEB-INF/cewolf.tld' prefix='cewolf' %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<c:choose>
    <c:when test="${fn:contains(pageContext.response.locale, '_')}">
        <c:set var="lang">
            ${fn:substringBefore(pageContext.response.locale, "_")}
        </c:set>
    </c:when>
    <c:otherwise>
        <c:set var="lang" value="${pageContext.response.locale}"/>
    </c:otherwise>
</c:choose>
<html lang="${lang}">
    <c:set var="pageTitle" scope="page">
        <fmt:message key="resultPage.pageTitle">
            <fmt:param>
                ${statistics.url}
            </fmt:param>
        </fmt:message>
    </c:set>
    <c:set var="addWebSnapr" scope="page" value="true"/>
    <%@include file="template/head.jsp" %>
    <body id="tgm-result-page">
        <%@include file="template/header-utils.jsp" %>
        <div class="container">
            <c:set var="pageName" scope="page">
                <fmt:message key="resultPage.h1"/>
            </c:set>
            <ul class="breadcrumb">
                <li><a href="<c:url value="/home.html"/>"><fmt:message key="home.h1"/></a> <span class="divider"></span></li>
                <li><a href="<c:url value="/home/contract.html?cr=${cr}"/>">${contractName}</a> <span class="divider"></span></li>
                <c:if test="${authorizedScopeForPageList == 'true'}">
                    <c:set var="auditSynthesisName" scope="page">
                        <fmt:message key="synthesisSite.h1">
                            <fmt:param>
                                ${param.wr}
                            </fmt:param>
                        </fmt:message>
                    </c:set>
                <li><a href="<c:url value="/home/contract/audit-synthesis.html?wr=${pwr}"/>">${auditSynthesisName}</a> <span class="divider"></span></li>
                <li><a href="<c:url value="/home/contract/page-list.html?wr=${pwr}"/>"><fmt:message key="pageList.h1"/></a> <span class="divider"></span></li>
                <li><a href="<c:url value="/home/contract/page-list.html?wr=${pwr}&amp;status=f2xx"/>"><fmt:message key="pageList.f2xx.h1"/></a> <span class="divider"></span></li>
                </c:if>
                <li class="active">${pageName}</li>
            </ul>
            <div class="row">
                <div class="span16">
                    <h1>
                        ${pageName}
                    </h1>
                </div>
            </div><!-- class="row" -->
            <div class="row">
                <div class="span16">
                    <ol>
                        <li><a href="#synthesis"><fmt:message key="resultPage.synthesis"/></a></li>
                        <li><a href="#work-done"><fmt:message key="resultPage.detailedResultPage"/></a></li>
                    </ol>
                </div>
            </div><!-- class="row" -->
            <c:set var="showLegend" scope="request" value="true"/>
            <c:set var="showAxisLabel" scope="request" value="true"/>
            <c:set var="hasBarChartLink" scope="request" value="true"/>
            <c:set var="hasGraphics" scope="request" value="true"/>
            <c:set var="hasSynthesisTitle" scope="request" value="true"/>
            <c:set var="hasPageCounter" scope="request" value="false"/>
            <c:set var="hasPagesListLink" scope="request" value="false"/>
            <c:set var="hasResultDispatchTitle" scope="request" value="false"/>
            <c:set var="themeRepartitionWidth" scope="request" value="690"/>
            <c:set var="hasPieChartInGraphicalResult" scope="request" value="true"/>
            <c:import url="template/synthesis.jsp" />
            <c:import url="template/sort-result-console.jsp" />
            <c:set var="displayAlgorithm" scope="request" value="true"/>
            <c:set var="scope" scope="request" value="page"/>
            <c:import url="template/detailed-result.jsp" />
        </div><!-- class="container"-->
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://asset.open-s.com/Corporate/TGOL/Js/audit-result.js"></script>
        <script type="text/javascript" src="http://asset.open-s.com/Corporate/TGOL/Js/audit-set-up.js"></script>
        <script type="text/javascript" src="<c:url value="/Js/check-all.js"/>"></script>
        <%@include file="template/footer.jsp" %>
    </body>
</html>