package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");

            String xmlResponse = "<?xml version=\"1.0\"?>\n"
                    + "<chbTransmissionResponse>\n"
                    + "  <status> ERROR</status>\n"
                    + "  <message> Unable to process</message>\n"
                    + "  <description> CargoDetailHouseBilllssuer=Optional,ContainerNumber=Optional, \n"
                    + "SealNumber=Forceable, CargoDetailMasterBill=Forceable, PaymentRef=Optional,CargoDetailMasterBilllssuer=Optional, ShipmentRef=Optional,PrimaryBOL=Forceable</description>\n"
                    + "  <missingFields>true</missingFields>\n"
                    + "  <force>true</force>\n"
                    + "</chbTransmissionResponse>";
            int start = xmlResponse.indexOf("<description>") + "<description>".length();
            int end = xmlResponse.indexOf("</description>");
            String subString = xmlResponse.substring(start, end);
            System.out.println("SubString:" + subString);
            String[] descdata = subString.split(",");
            String rowData="";
            String fieldName = "";
            String fieldValue = "";
            for (int i = 0; i < descdata.length; i++) {
                fieldName = descdata[i].split("=")[0];
                fieldValue = descdata[i].split("=")[1];
                rowData = rowData + "<tr><td>" + fieldName + "</td><td>" + fieldValue + "</td></tr>";

            }
            rowData = "<table style='border:1px solid;font-size:23px;'><thead><tr><td>MissingField</td><td>Status</td></tr></thead><tbody>" + rowData + "</tbody></table>";
            boolean flag1=false;
            if(rowData!=null && rowData.length()!=0)
            {
                flag1=true;
            }
            
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
