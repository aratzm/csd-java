package org.agilar.csd.solid.OCP;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;



public class InputParser
{
    public Document ParseInput(File inputFile) throws ParserConfigurationException, IOException, SAXException {

        org.agilar.csd.solid.OCP.Document document = new org.agilar.csd.solid.OCP.Document();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        org.w3c.dom.Document doc = dBuilder.parse(inputFile);

        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("document");

        Node nNode = nList.item(0);
        System.out.println("\nCurrent Element :" + nNode.getNodeName());

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            Element eElement = (Element) nNode;
            document.setTitle(eElement.getElementsByTagName("title").item(0).getTextContent());
            document.setText(eElement.getElementsByTagName("text").item(0).getTextContent());
        }
        return document;
    }

}
