package demo;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class DemoXMLParser {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("C://Users//d884444//Desktop//my1XML.xml");
            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            XPathExpression expr = xpath.compile("//ep/ActivityProfileSpecVersions");
            NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

            for (int i = 0; i < nl.getLength(); i++)
            {
                Node currentItem = nl.item(i);
                String key = currentItem.getAttributes().getNamedItem("type").getNodeValue();
                System.out.println(key);
            }
        }
        catch (Exception e){
        System.out.println(e.getMessage());
        }


    }
}
