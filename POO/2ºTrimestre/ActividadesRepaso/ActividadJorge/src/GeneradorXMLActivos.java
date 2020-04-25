import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class GeneradorXMLActivos {
    public void crearXML(Inmobiliaria inmobiliaria) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();

        Element eActivos = doc.createElement("Activos");
        doc.appendChild(eActivos);

        Element eVenta = doc.createElement("EnVenta");
        eActivos.appendChild(eVenta);

        for (Activo activoVenta : inmobiliaria.getVentas()) {
            // definimos el nodo que contendrá los elementos
            Element eActivo = doc.createElement("activo");
            eActivo.appendChild(eActivo);

            // definimos cada uno de los elementos y le asignamos un valor
            Attr localizacion = doc.createAttribute("localizacion");
            localizacion.setValue(String.valueOf(activoVenta.getLocalizacion()));
            eActivo.setAttributeNode(localizacion);

            Attr numeroHabitaciones = doc.createAttribute("numeroHabitaciones");
            numeroHabitaciones.setValue(String.valueOf(activoVenta.getNumeroHabitaciones()));
            eActivo.setAttributeNode(numeroHabitaciones);

            Attr metrosCuadrados = doc.createAttribute("metrosCuadrados");
            metrosCuadrados.setValue(String.valueOf(activoVenta.getMetrosCuadrados()));
            eActivo.setAttributeNode(metrosCuadrados);

            Attr ascensor = doc.createAttribute("ascensor");
            ascensor.setValue(String.valueOf(activoVenta.isAscensor()));
            eActivo.setAttributeNode(ascensor);

            Attr estado = doc.createAttribute("estado");
            estado.setValue(activoVenta.getEstado());
            eActivo.setAttributeNode(estado);

            Attr precio = doc.createAttribute("precio");
            precio.setValue(String.valueOf(activoVenta.getPrecio()));
            eActivo.setAttributeNode(precio);
        }

        Element eAlquiler = doc.createElement("EnAlquiler");
        eActivos.appendChild(eAlquiler);

        for (Activo activoAlquiler : inmobiliaria.getVentas()) {
            // definimos el nodo que contendrá los elementos
            Element eActivo = doc.createElement("activo");
            eActivo.appendChild(eActivo);

            // definimos cada uno de los elementos y le asignamos un valor
            Attr localizacion = doc.createAttribute("localizacion");
            localizacion.setValue(String.valueOf(activoAlquiler.getLocalizacion()));
            eActivo.setAttributeNode(localizacion);

            Attr numeroHabitaciones = doc.createAttribute("numeroHabitaciones");
            numeroHabitaciones.setValue(String.valueOf(activoAlquiler.getNumeroHabitaciones()));
            eActivo.setAttributeNode(numeroHabitaciones);

            Attr metrosCuadrados = doc.createAttribute("metrosCuadrados");
            metrosCuadrados.setValue(String.valueOf(activoAlquiler.getMetrosCuadrados()));
            eActivo.setAttributeNode(metrosCuadrados);

            Attr ascensor = doc.createAttribute("ascensor");
            ascensor.setValue(String.valueOf(activoAlquiler.isAscensor()));
            eActivo.setAttributeNode(ascensor);

            Attr estado = doc.createAttribute("estado");
            estado.setValue(activoAlquiler.getEstado());
            eActivo.setAttributeNode(estado);

            Attr precio = doc.createAttribute("precio");
            precio.setValue(String.valueOf(activoAlquiler.getPrecio()));
            eActivo.setAttributeNode(precio);
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("clientes.xml"));
        transformer.transform(source, result);
    }
}
