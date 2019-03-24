package com.xml;

import java.util.List;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.XMLUnit;
import org.junit.Assert;
import org.w3c.dom.Document;

public class TestXML {
	
	/*public static void main(String[] args) throws Exception {
        String result = "<abc             attr=\"value1\"                title=\"something\">            </abc>";
        // will be ok
        assertXMLEquals("<abc attr=\"value1\" title=\"something\"></abc>", result);
    }*/

    public static void assertXMLEquals(Document expectedXML, Document actualXML) throws Exception {
        XMLUnit.setIgnoreWhitespace(true);
        XMLUnit.setIgnoreAttributeOrder(true);        
       
        DetailedDiff diff = new DetailedDiff(XMLUnit.compareXML(expectedXML, actualXML));

        List<?> allDifferences = diff.getAllDifferences();
        System.out.println("Differences found: "+ allDifferences);
        /*Assert.assertEquals("Differences found: "+ diff.toString(), 0, allDifferences.size());
        Assert.asserte*/
    }	

}
