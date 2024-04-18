/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-04-04 04:18:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.sns;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kakao_005fmap04_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>카카오 지도 네번째 연습(키워드로 장소검색하기)</title>\r\n");
      out.write("				<!-- &libraries=services 앱키에 추가해줘야한다. -->\r\n");
      out.write("<script type=\"text/javascript\" \r\n");
      out.write("		src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=d514432bb9f7ee5d4a28d62d4ccba6b8&libraries=services\">\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	/*\r\n");
      out.write("	//	위도(latitude)와 경도(longitude) 구하기\r\n");
      out.write("	//	navigator.geolocation.getCurrentPosition();\r\n");
      out.write("	navigator.geolocation.getCurrentPosition(function(position) {\r\n");
      out.write("		let lat = position.coords.latitude;\r\n");
      out.write("		let lng = position.coords.longitude;\r\n");
      out.write("		//	함수 호출\r\n");
      out.write("		//geo_map(lat, lng);\r\n");
      out.write("	});	\r\n");
      out.write("	*/\r\n");
      out.write("	function search_go() {\r\n");
      out.write("		let keyword = document.getElementById(\"keyword\").value;\r\n");
      out.write("		geo_map(keyword);\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- 서버가는게 아니여서 form 태그 사용안함 -->	\r\n");
      out.write("	<h1>키워드로 장소 검색</h1>\r\n");
      out.write("	<input type=\"text\" name=\"keyword\" id=\"keyword\">\r\n");
      out.write("	<button type=\"button\" onclick=\"search_go()\">검색</button>\r\n");
      out.write("	<br><br><br><br><br>\r\n");
      out.write("	\r\n");
      out.write("	<!-- 지도를 표시할 div 입니다 -->\r\n");
      out.write("	<div id=\"map\" style=\"width:100%;height:350px;\"></div>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("		function geo_map(keyword) {\r\n");
      out.write("			// 마커를 클릭하면 장소명을 표출할 인포윈도우 입니다\r\n");
      out.write("			var infowindow = new kakao.maps.InfoWindow({zIndex:1});\r\n");
      out.write("\r\n");
      out.write("			var mapContainer = document.getElementById('map'), // 지도를 표시할 div \r\n");
      out.write("			    mapOption = {\r\n");
      out.write("			        center: new kakao.maps.LatLng(37.566826, 126.9786567), // 지도의 중심좌표\r\n");
      out.write("			        level: 3 // 지도의 확대 레벨\r\n");
      out.write("			    };  \r\n");
      out.write("\r\n");
      out.write("			// 지도를 생성합니다    \r\n");
      out.write("			var map = new kakao.maps.Map(mapContainer, mapOption); \r\n");
      out.write("\r\n");
      out.write("			// 장소 검색 객체를 생성합니다\r\n");
      out.write("			var ps = new kakao.maps.services.Places(); \r\n");
      out.write("\r\n");
      out.write("			// 키워드로 장소를 검색합니다\r\n");
      out.write("			ps.keywordSearch(keyword, placesSearchCB); \r\n");
      out.write("\r\n");
      out.write("			// 키워드 검색 완료 시 호출되는 콜백함수 입니다\r\n");
      out.write("			function placesSearchCB (data, status, pagination) {\r\n");
      out.write("			    if (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\r\n");
      out.write("			        // 검색된 장소 위치를 기준으로 지도 범위를 재설정하기위해\r\n");
      out.write("			        // LatLngBounds 객체에 좌표를 추가합니다\r\n");
      out.write("			        var bounds = new kakao.maps.LatLngBounds();\r\n");
      out.write("\r\n");
      out.write("			        for (var i=0; i<data.length; i++) {\r\n");
      out.write("			            displayMarker(data[i]);    \r\n");
      out.write("			            bounds.extend(new kakao.maps.LatLng(data[i].y, data[i].x));\r\n");
      out.write("			        }       \r\n");
      out.write("\r\n");
      out.write("			        // 검색된 장소 위치를 기준으로 지도 범위를 재설정합니다\r\n");
      out.write("			        map.setBounds(bounds);\r\n");
      out.write("			    } \r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("			// 지도에 마커를 표시하는 함수입니다\r\n");
      out.write("			function displayMarker(place) {\r\n");
      out.write("			    \r\n");
      out.write("			    // 마커를 생성하고 지도에 표시합니다\r\n");
      out.write("			    var marker = new kakao.maps.Marker({\r\n");
      out.write("			        map: map,\r\n");
      out.write("			        position: new kakao.maps.LatLng(place.y, place.x) \r\n");
      out.write("			    });\r\n");
      out.write("\r\n");
      out.write("			    // 마커에 클릭이벤트를 등록합니다\r\n");
      out.write("			    kakao.maps.event.addListener(marker, 'click', function() {\r\n");
      out.write("			        // 마커를 클릭하면 장소명이 인포윈도우에 표출됩니다\r\n");
      out.write("			        infowindow.setContent('<div style=\"padding:5px;font-size:12px;\">' + place.place_name + '</div>');\r\n");
      out.write("			        infowindow.open(map, marker);\r\n");
      out.write("			    });\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
