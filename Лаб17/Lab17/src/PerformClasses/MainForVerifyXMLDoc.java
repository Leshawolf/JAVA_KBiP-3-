package PerformClasses;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

public class MainForVerifyXMLDoc {

    public static void main(String[] args) {
        File schemaFile = new File("Files/computer.xsd");
        Source xmlFile = new StreamSource(new File("Files/computer.xml"));

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        try {
            Schema schema = schemaFactory.newSchema(schemaFile);
            Validator validator = schema.newValidator();
            validator.validate(xmlFile);
            System.out.println(xmlFile.getSystemId() + " is valid.");
        }
        catch (SAXException e) { System.out.println(xmlFile.getSystemId() + " is NOT valid reason: " + e.getMessage()); }
        catch (IOException e) { e.printStackTrace(); }
    }
}
