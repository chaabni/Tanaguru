<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
        <fmt:message key="quota-by-ip-exceeded.pageTitle"/>
    </c:set>
    <%@include file="template/head.jsp" %>
    <body id="tgm-exceeded-by-ip">
        <%@include file="template/header-utils.jsp" %>
        <div class="container no-bg-container">
            <div class="row">
                <div class="span16">
                    <div class="alert-message block-message">
                        <h1>
                            <fmt:message key="quota-by-ip-exceeded.h1"/>
                        </h1>
                        <p>
                            <fmt:message key="quota-by-ip-exceeded.message">
                                <fmt:param value="${pageContext.request.remoteAddr}"/>
                            </fmt:message>
                        </p>
                        <div class="alert-actions">
                            <a href="<c:url value="/dispatch.html" />" class="btn small"><fmt:message key="accessDeniedPage.backToHome"/></a>
                        </div><!-- class="alert-actions"-->
                    </div><!-- class="alert-message block-message"-->
                </div><!-- class="span16" -->
            </div><!-- class="row" -->
            <div class="row">
                <div class="span16 main-logo">
                    <img src="<c:url value="/Images/quota_exceeded.jpg"/>" alt=""/>
                </div><!-- class="span16 main-logo" -->
            </div><!-- class="row" -->
            <div class="row">
                <div class="span4 offset9">
                    <a title="Creative Commons Attribution 3.0 License" href="http://creativecommons.org/licenses/by/3.0/">
                        <img src="<c:url value="/Images/creative_common_logo.png"/>" alt="License"/>
                    </a>
                    <a title="Flickr: Galerie de woowoowoo" href="http://www.flickr.com/photos/leprecon/">woowoowoo</a>
                </div><!-- class="span4 offset9" -->
            </div><!-- class="row" -->
        </div><!-- class="container" -->
       <%@include file="template/footer.jsp" %>
    </body>
</html>