package com.politecnicomalaga.Viewers;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class GestorXML {

    private static String dir = System.getProperty("user.dir");

    public static NodeList getNodeList() throws ParserConfigurationException {

        NodeList nodeList = null;

        try {
            File inputFile = new File(dir + File.separator + "src/main/resources/poblaciones.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            XPath xPath = XPathFactory.newInstance().newXPath();
            nodeList = (NodeList) xPath.compile("/root/row").evaluate(doc, XPathConstants.NODESET);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } return nodeList;
    }
}
