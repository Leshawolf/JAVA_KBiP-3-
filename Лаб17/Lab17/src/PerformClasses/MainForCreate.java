package PerformClasses;

import DocSettings.DocumentWorking;
import DocSettings.Enums.UnitSocket;
import DocSettings.Enums.UnitType;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MainForCreate {

    public static void main(String[] args)
        throws ParserConfigurationException, IOException, TransformerException {

        Document doc = DocumentWorking.createDocument();
        //root(device)
        Element rootElement = doc.createElement("device");
        doc.appendChild(rootElement);
        //units in device
        //1
        Element unit1 = DocumentWorking.createUserElement(doc, "Mouse", "China", 150,
            UnitType.Control, 40, false, UnitSocket.USB, false);
        rootElement.appendChild(unit1);
        //2
        Element unit2 = DocumentWorking.createUserElement(doc, "WebCam", "USA", 470,
            UnitType.Input, 75, false, UnitSocket.USB, false);
        rootElement.appendChild(unit2);
        //3
        Element unit3 = DocumentWorking.createUserElement(doc, "Monitor", "Germany", 740,
            UnitType.Output, 120, true, UnitSocket.USB, true);
        rootElement.appendChild(unit3);
        //write document in file
        DocumentWorking.writeDocInFile(doc, "computer.xml");
    }
}
