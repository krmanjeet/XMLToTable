<%-- 
    Document   : index
    Created on : Apr 26, 2023, 3:00:13 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
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
            
        %>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
