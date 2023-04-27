//******************************************************************
//  Activity 38
//  Name: Ben Keys
//  Data Structures Date: 04/25/2023
//******************************************************************
//  A demonstration of parsing an XML file.
//******************************************************************

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class StudentXML {
    public static void main(String[] args) {
        try {
            File file = new File("student_record.xml");
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(file);

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName("student");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("\nStudent " + element.getAttribute("id"));
                    System.out.printf(
                            "Name: %s %s\n",
                            element.getElementsByTagName("firstname").item(0).getTextContent(),
                            element.getElementsByTagName("lastname").item(0).getTextContent()
                    );
                    System.out.printf(
                            "GPA: %s\n",
                            element.getElementsByTagName("gpa").item(0).getTextContent()
                    );
                    System.out.printf(
                            "Major: %s\n",
                            element.getElementsByTagName("major").item(0).getTextContent()
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
