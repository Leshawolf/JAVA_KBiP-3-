package PerformClasses;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class MainForTransformationXMLToXML {

    public static void main(String[] args) {
        try {
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer(new StreamSource("Files/computer.xsl"));
            transformer.transform(new StreamSource("Files/computer.xml"), new StreamResult("Files/computer.html"));
        } catch (TransformerConfigurationException e) { e.printStackTrace(); }
        catch (TransformerException e) { e.printStackTrace(); }
    }
}
