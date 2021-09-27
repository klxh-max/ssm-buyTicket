<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>首页</title>
    </head>
    <body>
        <table style="width: 80vw; margin: 0 auto; background: #000;">
            <tr>
                <c:forEach var="filmVo" items="${filmVoList}" begin="0" end="3">
                    <td>
                        <div style="width: 250px; margin: 10px;">
                            <a href="filmInfo?filmId=${filmVo.filmId}">
                                <img src="${pageContext.request.contextPath}${filmVo.poster_path}"
                                 style="width: 250px;height: 380px"/>
                            </a>
                            <div class="piao">
                                <a href="filmInfo?filmId=${filmVo.filmId}" >
                                    <p style="color: white;top:50px">${filmVo.fname}</p>
                                    <p style="color: #fff;top: 50px">导演：${filmVo.director}</p>
                                </a>
                            </div>

                        </div>
                    </td>
                </c:forEach>
            </tr>
            <tr>
                <c:forEach var="filmVo" items="${filmVoList}" begin="4" end="7">
                    <td>
                        <div style="width: 250px; margin: 10px;">
                            <a href="filmInfo?filmId=${filmVo.filmId}">
                                <img src="${pageContext.request.contextPath}${filmVo.poster_path}"
                                     style="width: 250px;height: 380px"/>
                            </a>
                            <div class="piao">
                                <a href="filmInfo?filmId=${filmVo.filmId}">
                                    <p style="color: white;top:50px">${filmVo.fname}</p>
                                    <p style="color: #fff;top: 50px">导演：${filmVo.director}</p>
                                </a>
                            </div>

                        </div>
                    </td>
                </c:forEach>
            </tr>
        </table>
    </body>
</html>
