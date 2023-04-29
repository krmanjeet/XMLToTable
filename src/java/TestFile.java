/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class TestFile {
    public static void main(String[] args) {
        String xmlResponse="<?xml version=\"1.0\"?>\n" +
"<chbTransmissionResponse>\n" +
"  <status> ERROR</status>\n" +
"  <message> Unable to process</message>\n" +
"  <description> CargoDetailHouseBilllssuer=Optional,ContainerNumber=Optional, \n" +
"SealNumber=Forceable, CargoDetailMasterBill=Forceable, PaymentRef=Optional,CargoDetailMasterBilllssuer=Optional, ShipmentRef=Optional,PrimaryBOL=Forceable</description>\n" +
"  <missingFields>true</missingFields>\n" +
"  <force>true</force>\n" +
"</chbTransmissionResponse>";
        int start=xmlResponse.indexOf("<description>")+"<description>".length();
         int end=xmlResponse.indexOf("</description>");
         String subString=xmlResponse.substring(start,end);
         System.out.println("SubString:"+subString);
         String rowData="";
         String[] descdata=subString.split(",");
         String fieldName="";
         String fieldValue="";
         for(int i=0;i<descdata.length;i++)
         {
             fieldName=descdata[i].split("=")[0];
             fieldValue=descdata[i].split("=")[1];
             rowData=rowData+"<tr><td>"+fieldName+"</td><td>"+fieldValue+"</td></tr>";
             
         }
         rowData="<table style='border:1px solid;font-size:23px;'><thead><tr><td>MissingField</td><td>Status</td></tr></thead><tbody>"+rowData+"</tbody></table>";
        System.out.println("RowData:"+rowData);
    }
}
