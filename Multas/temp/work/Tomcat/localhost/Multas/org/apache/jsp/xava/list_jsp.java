/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2021-03-02 10:09:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.web.WebEditors;
import org.openxava.util.XavaResources;
import org.openxava.model.meta.MetaProperty;
import org.openxava.tab.Tab;
import org.openxava.util.Is;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/E:/Entorno/curso-openxava/openxava-6.4.2/workspace/Multas/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1612455955033L));
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1612455958578L));
    _jspx_dependants.put("jar:file:/E:/Entorno/curso-openxava/openxava-6.4.2/workspace/Multas/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1612455958619L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.util.XavaResources");
    _jspx_imports_classes.add("org.openxava.tab.Tab");
    _jspx_imports_classes.add("org.openxava.web.WebEditors");
    _jspx_imports_classes.add("org.openxava.util.Is");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flink_0026_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody;

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
    _005fjspx_005ftagPool_005fxava_005flink_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005flink_0026_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('\n');

String tabObject = request.getParameter("tabObject");
tabObject = (tabObject == null || tabObject.equals(""))?"xava_tab":tabObject;
org.openxava.tab.Tab tab = (org.openxava.tab.Tab) context.get(request, tabObject);
String editor = tab.getEditor();
String collection = request.getParameter("collection");
org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
String groupBy = tab.getGroupBy();
boolean grouping = !Is.emptyString(groupBy);

      out.write('\n');
      out.write('\n');

if (collection == null || collection.equals("")) { 	

      out.write("\n");
      out.write("<table width=\"100%\" class=");
      out.print(style.getListTitleWrapper());
      out.write(">\n");
      out.write("<tr><td class=");
      out.print(style.getListTitle());
      out.write('>');
      out.write('\n');
 if (style.isShowModuleDescription()) { 
      out.write('\n');
      out.print(manager.getModuleDescription());
      out.write('\n');
 } 
      out.write('\n');
 String confName = tab.getConfigurationName();
      out.write("\n");
      out.write("<select title=\"");
      out.print(confName);
      out.write("\" \n");
      out.write("\tonchange=\"openxava.executeAction('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', '', false, 'List.filter','configurationId=' + this.value)\">\n");
      out.write("\t\n");
      out.write("\t<option value=\"\">");
      out.print(confName);
      out.write("</option>\n");
      out.write("\t");
 
	int count = 1; 
	for (Tab.Configuration conf: tab.getConfigurations()) {
		if (!confName.equals(conf.getName())) {
			if (++count > Tab.MAX_CONFIGURATIONS_COUNT) break; 
	
      out.write("\n");
      out.write("\t<option value=\"");
      out.print(conf.getId());
      out.write('"');
      out.write('>');
      out.print(conf.getName());
      out.write("</option>\n");
      out.write("\t");
 
		}
	} 
	
      out.write("\n");
      out.write("</select>\n");
      if (_jspx_meth_xava_005flink_005f0(_jspx_page_context))
        return;
      out.write('\n');
 
if (tab.isTitleVisible()) { 

      out.write(' ');
      out.write('\n');
 if (style.isShowModuleDescription()) { 
      out.write(' ');
      out.write('-');
      out.write(' ');
 } 
      out.write("\n");
      out.write("<span id=\"list-title\">");
      out.print(tab.getTitle());
      out.write("</span> \n");

}

      out.write('\n');
 if (style.isShowRowCountOnTop() && !grouping) { // && grouping 
	int totalSize = tab.getTotalSize();
	int finalIndex = Math.min(totalSize, tab.getFinalIndex());

      out.write("\n");
      out.write("<span class=\"");
      out.print(style.getHeaderListCount());
      out.write('"');
      out.write('>');
      out.write('\n');
      out.print(XavaResources.getString(request, "header_list_count", new Integer(tab.getInitialIndex() + 1), new Integer(finalIndex), new Integer(totalSize)));
      out.write("\n");
      out.write("</span>\n");
 } 
      out.write('\n');
 if (manager.getDialogLevel() == 0) { 
      out.write("\n");
      out.write("<select onchange=\"openxava.executeAction('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', '', false, 'List.groupBy','property=' + this.value)\">\n");
      out.write("\t<option value=\"\">");
      out.print(grouping?XavaResources.getString("no_grouping"):XavaResources.getString("no_grouping"));
      out.write("</option>\n");
      out.write("\t");
 
	for (MetaProperty property: tab.getMetaPropertiesGroupBy()) {
		String selected = "";
		if (groupBy.equals(property.getQualifiedName())) {
			selected = "selected";
		}
	
      out.write("\n");
      out.write("\t<option value=\"");
      out.print(property.getQualifiedName());
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      if (_jspx_meth_xava_005fmessage_005f0(_jspx_page_context))
        return;
      out.write(' ');
      out.print(property.getQualifiedLabel(request).toLowerCase());
      out.write("</option>\n");
      out.write("\t");

		if (property.getType().isAssignableFrom(java.util.Date.class) || property.getType().isAssignableFrom(java.time.LocalDate.class)) { 	
			if (groupBy.equals(property.getQualifiedName() + "[month]")) {
				selected = "selected";
			}
			else {
				selected = "";
			}
	
      out.write("\n");
      out.write("\t<option value=\"");
      out.print(property.getQualifiedName());
      out.write("[month]\" ");
      out.print(selected);
      out.write('>');
      if (_jspx_meth_xava_005fmessage_005f1(_jspx_page_context))
        return;
      out.write(' ');
      out.print(property.getQualifiedLabel(request).toLowerCase());
      out.write("</option>\n");
      out.write("\t");

			if (groupBy.equals(property.getQualifiedName() + "[year]")) {
				selected = "selected";
			}
			else {
				selected = "";
			}
	
      out.write("\t\t\n");
      out.write("\t<option value=\"");
      out.print(property.getQualifiedName());
      out.write("[year]\" ");
      out.print(selected);
      out.write('>');
      if (_jspx_meth_xava_005fmessage_005f2(_jspx_page_context))
        return;
      out.write(' ');
      out.print(property.getQualifiedLabel(request).toLowerCase());
      out.write("</option> \n");
      out.write("\t");
		
		}
	} 
	
      out.write("\n");
      out.write("</select> \n");
 } 
      out.write("\n");
      out.write("</td></tr>\n");
      out.write("</table>\n");

} 

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, WebEditors.getUrl(tab.getEditor(), tab.getMetaTab()), out, false);
      out.write('\n');
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

  private boolean _jspx_meth_xava_005flink_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:link
    org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f0 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005faction_005fnobody.get(org.openxava.web.taglib.LinkTag.class);
    boolean _jspx_th_xava_005flink_005f0_reused = false;
    try {
      _jspx_th_xava_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flink_005f0.setParent(null);
      // /xava/list.jsp(48,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005flink_005f0.setAction("List.changeConfiguration");
      int _jspx_eval_xava_005flink_005f0 = _jspx_th_xava_005flink_005f0.doStartTag();
      if (_jspx_th_xava_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005flink_0026_005faction_005fnobody.reuse(_jspx_th_xava_005flink_005f0);
      _jspx_th_xava_005flink_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005flink_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005flink_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    boolean _jspx_th_xava_005fmessage_005f0_reused = false;
    try {
      _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f0.setParent(null);
      // /xava/list.jsp(75,64) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fmessage_005f0.setKey("group_by");
      int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
      if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
      _jspx_th_xava_005fmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f1 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    boolean _jspx_th_xava_005fmessage_005f1_reused = false;
    try {
      _jspx_th_xava_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f1.setParent(null);
      // /xava/list.jsp(85,71) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fmessage_005f1.setKey("group_by_month_of");
      int _jspx_eval_xava_005fmessage_005f1 = _jspx_th_xava_005fmessage_005f1.doStartTag();
      if (_jspx_th_xava_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f1);
      _jspx_th_xava_005fmessage_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f2 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    boolean _jspx_th_xava_005fmessage_005f2_reused = false;
    try {
      _jspx_th_xava_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f2.setParent(null);
      // /xava/list.jsp(94,70) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fmessage_005f2.setKey("group_by_year_of");
      int _jspx_eval_xava_005fmessage_005f2 = _jspx_th_xava_005fmessage_005f2.doStartTag();
      if (_jspx_th_xava_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
      _jspx_th_xava_005fmessage_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f2, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f2_reused);
    }
    return false;
  }
}
