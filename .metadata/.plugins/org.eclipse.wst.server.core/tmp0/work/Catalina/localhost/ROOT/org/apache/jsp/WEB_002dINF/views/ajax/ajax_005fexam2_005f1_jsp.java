/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-09 06:35:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.ajax;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajax_005fexam2_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    span { width: 150px; color: red;}\r\n");
      out.write("    input{border:1px solid red;}\r\n");
      out.write("    table{width: 80%; margin: 0 auto;}\r\n");
      out.write("    table,th,td {\r\n");
      out.write("    	border: 1px solid gray; \r\n");
      out.write("    	text-align: center;\r\n");
      out.write("    	border-collapse: collapse;\r\n");
      out.write("    }\r\n");
      out.write("    h2{text-align: center;}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		function getList2() {\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"getAjaxList2.do\",\r\n");
      out.write("				method : \"post\", // 다른방식 => type : \"post\"\r\n");
      out.write("				dataType : \"json\",\r\n");
      out.write("				success : function(data) {\r\n");
      out.write("					console.log(data)\r\n");
      out.write("					let tbody = \"\";\r\n");
      out.write("					\r\n");
      out.write("					$.each(data, function(k, v) {\r\n");
      out.write("						//console.log(k);\r\n");
      out.write("						//console.log(v);\r\n");
      out.write("						tbody += \"<tr>\";\r\n");
      out.write("						tbody += \"<td>\" + v.m_idx + \"</td>\";\r\n");
      out.write("						tbody += \"<td>\" + v.m_id + \"</td>\";\r\n");
      out.write("						tbody += \"<td>\" + v.m_pw + \"</td>\";\r\n");
      out.write("						tbody += \"<td>\" + v.m_name + \"</td>\";\r\n");
      out.write("						tbody += \"<td>\" + v.m_age + \"</td>\";\r\n");
      out.write("						tbody += \"<td>\" + v.m_reg + \"</td>\";\r\n");
      out.write("						\r\n");
      out.write("						//	삭제하기 위해서 idx 를 가져가야한다.\r\n");
      out.write("						//	button 은 누르면 submit 되서 새로고침되기때문에\r\n");
      out.write("						//	input 타입으로 바꾸자\r\n");
      out.write("						tbody += \"<td><input type='button' value='삭제' id='del' name='\" \r\n");
      out.write("									+ v.m_idx + \"'></td>\";\r\n");
      out.write("						tbody += \"</tr>\";\r\n");
      out.write("					})\r\n");
      out.write("					\r\n");
      out.write("					$(\"#tbody\").append(tbody);\r\n");
      out.write("				},\r\n");
      out.write("				error : function() {\r\n");
      out.write("					alert(\"읽기실패\");\r\n");
      out.write("				}\r\n");
      out.write("			});	\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		//	아이디를 눌렀다 땠을때, 아이디가 넘어가서 DB 에 있는지 없는지 검사\r\n");
      out.write("		//	날라갈때 아이디를 가져가서, 검사는 자바에서 하고, 결과만 가져온다.\r\n");
      out.write("		//	ajax 에서 파라미터값이 날라간다.\r\n");
      out.write("		$(\"#m_id\").keyup(function() {\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"getAjaxIdChk.do\" ,			// 	서버주소\r\n");
      out.write("				data : \"m_id=\" + $(\"#m_id\").val() ,	//	서버에 보낼때 같이 가는 데이터 (파라미터)\r\n");
      out.write("				method : \"post\" ,					//	전달방식\r\n");
      out.write("				dataType : \"text\" ,					//	가져오는 결과 타입\r\n");
      out.write("				success : function(data) {\r\n");
      out.write("					let m_id = $(\"#m_id\").val();\r\n");
      out.write("					//console.log(m_id);\r\n");
      out.write("					\r\n");
      out.write("					if(data == '1' && m_id !=''){\r\n");
      out.write("						//	중복된 아이디가 없으면서 아이디 입력창이 안비었으면\r\n");
      out.write("						//	사용가능\r\n");
      out.write("						$(\"#join_btn\").removeAttr(\"disabled\");\r\n");
      out.write("						$(\"span\").text(\"사용가능\");\r\n");
      out.write("					}else if (data == '0') {\r\n");
      out.write("						//	중복된 아이디가 있음\r\n");
      out.write("						//	사용불가\r\n");
      out.write("						$(\"#join_btn\").attr(\"disabled\", \"disabled\");\r\n");
      out.write("						$(\"span\").text(\"사용불가\");\r\n");
      out.write("					}else if (m_id == ''){\r\n");
      out.write("						//	아이디 입력창이 비어있으면\r\n");
      out.write("						$(\"#join_btn\").attr(\"disabled\", \"disabled\");\r\n");
      out.write("						$(\"span\").text(\"중복여부\");\r\n");
      out.write("					}\r\n");
      out.write("				},\r\n");
      out.write("				error : function() {\r\n");
      out.write("					alert(\"읽기 실패\");\r\n");
      out.write("				}\r\n");
      out.write("			});	\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//	data 가 여러개 일때는 직렬화를 사용한다.\r\n");
      out.write("		//	serialize() => 직렬화, form 태그 안에 있는 요소들만 받음\r\n");
      out.write("		$(\"#join_btn\").click(function() {\r\n");
      out.write("			let param = $(\"#myform\").serialize();\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"getAjaxJoin.do\",\r\n");
      out.write("				data : param,\r\n");
      out.write("				method : \"post\",\r\n");
      out.write("				dataType : \"text\",\r\n");
      out.write("				success : function(data) {\r\n");
      out.write("					if (data == 0) {\r\n");
      out.write("						alert(\"가입실패\");\r\n");
      out.write("					}else if (data == 1) {\r\n");
      out.write("						$(\".reset\").val(\"\");\r\n");
      out.write("						$(\"#join_btn\").attr(\"disabled\", \"disabled\");\r\n");
      out.write("						$(\"span\").text(\"중복여부\");\r\n");
      out.write("						//	가입성공\r\n");
      out.write("						$(\"#tbody\").empty();\r\n");
      out.write("						//	인풋타입일 때는 다시 리스트를 불러줘야한다.\r\n");
      out.write("						getList2();\r\n");
      out.write("					}\r\n");
      out.write("				},\r\n");
      out.write("				error : function() {\r\n");
      out.write("					alert(\"가입실패\");\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//	삭제버튼을 누르면 삭제\r\n");
      out.write("		//	선택자 selector 를 넣어주자\r\n");
      out.write("		//	테이블 안에 있는 아이디가 del 인놈을 클릭하면\r\n");
      out.write("		$(\"table\").on(\"click\", \"#del\", function() {\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"getAjaxDelete.do\" ,					// 	서버주소\r\n");
      out.write("				data : \"m_idx=\" + $(this).attr(\"name\") ,	//	서버에 보낼때 가는 파라미터\r\n");
      out.write("				method : \"post\" ,							//	전달방식\r\n");
      out.write("				dataType : \"text\" ,							//	가져오는 결과 타입\r\n");
      out.write("				success : function(data) {\r\n");
      out.write("					if (data == 0) {\r\n");
      out.write("						//	경고창도 새로고침 되기때문에 안쓰는게 좋긴하다. \r\n");
      out.write("						alert(\"삭제실패\");\r\n");
      out.write("					}else if (data == 1) {\r\n");
      out.write("						//	삭제성공\r\n");
      out.write("						$(\"#tbody\").empty();\r\n");
      out.write("						//	인풋타입일 때는 다시 리스트를 불러줘야한다.\r\n");
      out.write("						getList2();\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("			});	\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//	다 읽고나서 function 실행\r\n");
      out.write("		getList2();\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<h2>Ajax 를 이용한 DB 처리</h2>\r\n");
      out.write("	<hr>\r\n");
      out.write("	<h2> 회원 정보 입력하기 </h2>\r\n");
      out.write("    <form name=\"myform\" id=\"myform\" autocomplete=\"off\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>아이디</th><th>패스워드</th><th>이름</th><th>나이</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                    	");
      out.write(" \r\n");
      out.write("                        <input type=\"text\" size=\"14\" name=\"m_id\" id=\"m_id\" class=\"reset\">\r\n");
      out.write("                        <br><span>중복여부</span>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td><input type=\"password\" size=\"8\" name=\"m_pw\" class=\"reset\"></td>  \r\n");
      out.write("                    <td><input type=\"text\" size=\"14\" name=\"m_name\" class=\"reset\"></td>  \r\n");
      out.write("                    <td><input type=\"number\" size=\"12\" name=\"m_age\" class=\"reset\"></td>  \r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("            <tfoot>\r\n");
      out.write("                <tr><td colspan=\"7\" align=\"center\">\r\n");
      out.write("                	");
      out.write("\r\n");
      out.write("                	");
      out.write("\r\n");
      out.write("                	<input type=\"button\" value=\"가입하기\" id=\"join_btn\" disabled>\r\n");
      out.write("                </td></tr>\r\n");
      out.write("            </tfoot>\r\n");
      out.write("        </table>\r\n");
      out.write("    </form>\r\n");
      out.write("    <br /> <br /> <br />\r\n");
      out.write("    <h2> 회원 정보 보기 </h2>\r\n");
      out.write("    <div>\r\n");
      out.write("        <table id=\"list\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>번호</th><th>아이디</th><th>패스워드</th>\r\n");
      out.write("                    <th>이름</th><th>나이</th><th>가입날짜</th><th>삭제</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody id=\"tbody\">\r\n");
      out.write("            	\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
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
