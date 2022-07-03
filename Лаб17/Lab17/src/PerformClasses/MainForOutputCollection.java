package PerformClasses;

import DocSettings.Enums.UnitSocket;
import DocSettings.Enums.UnitType;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import model.Unit;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MainForOutputCollection {
    public static Document createDocument(String xmlFileName) {
        File file = new File(xmlFileName);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        try {
            doc = dbf.newDocumentBuilder().parse(file);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return doc;
    }

    public static void main(String[] args) {
        Document doc = createDocument("Files/computer.xml");

        Node deviceNode = doc.getFirstChild();
        NodeList deviceChilds = deviceNode.getChildNodes();
        ArrayList<Unit> units = new ArrayList<Unit>();
        for(int i = 0; i < deviceChilds.getLength(); i++) {
            if(deviceChilds.item(i).getNodeType() != Node.ELEMENT_NODE) { continue; }
            if (!deviceChilds.item(i).getNodeName().equals("unit")) { continue; }

            NodeList elementChilds = deviceChilds.item(i).getChildNodes();
            NamedNodeMap attributeChilds = deviceChilds.item(i).getAttributes();

            String name = "";
            String origin = "";
            int price = 0;
            UnitType type = UnitType.Control;
            int energyConsumption = 0;
            boolean coolerExist = false;
            UnitSocket socket = UnitSocket.USB;
            boolean isCritical = true;

            for (int k = 0; k < attributeChilds.getLength(); k++) {
                if(attributeChilds.item(k).getNodeType() != Node.ATTRIBUTE_NODE) { continue; }

                switch (attributeChilds.item(k).getNodeName()) {
                    case "name": {
                        name = attributeChilds.item(k).getTextContent();
                        break;
                    }
                }
            }

            for(int j = 0; j < elementChilds.getLength(); j++) {
                if(elementChilds.item(j).getNodeType() != Node.ELEMENT_NODE) { continue; }

                switch (elementChilds.item(j).getNodeName()) {
                    case "origin": {
                        origin = elementChilds.item(j).getTextContent();
                        break;
                    }
                    case "price": {
                        price = Integer.valueOf(elementChilds.item(j).getTextContent());
                        break;
                    }
                    case "type": {
                        String localType = elementChilds.item(j).getTextContent();
                        if(localType.equals("Control")) { type = UnitType.Control; }
                        else if(localType.equals("Input")) { type = UnitType.Input; }
                        else if(localType.equals("Output")) { type = UnitType.Output; }
                        else { type = UnitType.Store; }
                        break;
                    }
                    case "energy_consumption": {
                        energyConsumption = Integer.valueOf(elementChilds.item(j).getTextContent());
                        break;
                    }
                    case "cooler_exist": {
                        coolerExist = Boolean.valueOf(elementChilds.item(j).getTextContent());
                        break;
                    }
                    case "socket": {
                        String localSocket = elementChilds.item(j).getTextContent();
                        if(localSocket.equals("COM")) { socket = UnitSocket.COM; }
                        else if(localSocket.equals("USB")) { socket = UnitSocket.USB; }
                        else { socket = UnitSocket.LPT; }
                        break;
                    }
                    case "critical": {
                        isCritical = Boolean.valueOf(elementChilds.item(j).getTextContent());
                        break;
                    }
                    default:
                        System.out.println("Неизвестный элемент!");
                        break;
                }
            }
            Unit emp = new Unit(name, origin, price, type, energyConsumption, coolerExist, socket, isCritical);
            units.add(emp);
        }
//        Comparator<Unit> sortByPrice = new Comparator<Unit>() {
//            @Override
//            public int compare(Unit o1, Unit o2) {
//                return o1.getPrice().compareTo(o2.getPrice());
//            }
//        };
//        Collections.sort(units, sortByPrice);
        System.out.println(units);
    }
}
