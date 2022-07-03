package DocSettings;

import DocSettings.Enums.UnitSocket;
import DocSettings.Enums.UnitType;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class DocumentWorking {
    public static Document createDocument() throws ParserConfigurationException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        return docBuilder.newDocument();
    }

    public static void writeDocInFile(Document doc, String path)
        throws IOException, TransformerException {

        FileOutputStream output = new FileOutputStream(path);
        writeXML(doc, output);
    }

    private static void writeXML(Document doc, OutputStream output) throws TransformerException {
        TransformerFactory transfFactory = TransformerFactory.newInstance();
        Transformer transf = transfFactory.newTransformer();
        transf.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(output);

        transf.transform(source, result);
    }

    public static Element createUserElement(Document doc, String name, String origin, int price, UnitType type,
        int energyConsump, boolean coolerExist, UnitSocket socket, boolean isCritical) {

        Element unit = doc.createElement("unit");

        unit.setAttribute("name", name);

        //origin
        unit.appendChild(createLocaleElement(doc, "origin", origin));
        //price
        unit.appendChild(createLocaleElement(doc, "price", String.valueOf(price)));
        //type
        unit.appendChild(createLocaleElement(doc, "type", String.valueOf(type)));
        //energy consumption
        unit.appendChild(createLocaleElement(doc, "energy_consumption", String.valueOf(energyConsump)));
        //cooler_exist
        unit.appendChild(createLocaleElement(doc, "cooler_exist", String.valueOf(coolerExist)));
        //socket
        unit.appendChild(createLocaleElement(doc, "socket", String.valueOf(socket)));
        //critical
        unit.appendChild(createLocaleElement(doc, "critical", String.valueOf(isCritical)));

        return unit;
    }

    private static Element createLocaleElement(Document doc,String tagName, String content) {
        Element element = doc.createElement(tagName);
        element.setTextContent(content);

        return element;
    }
}
