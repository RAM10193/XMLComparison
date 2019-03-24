package com.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class XMLCOMPARE {

	public static void main(String[] args) throws Exception {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		TestXML xm = new TestXML();
		Document expectedXML = db.parse(new InputSource("C:\\Users\\3537\\workspace\\XMLcomparison\\Test.xml"));	
		Document actualXML = db.parse(new InputSource("C:\\Users\\3537\\workspace\\XMLcomparison\\Reference.xml"));  

		 xm.assertXMLEquals(expectedXML,actualXML);
	}
}
