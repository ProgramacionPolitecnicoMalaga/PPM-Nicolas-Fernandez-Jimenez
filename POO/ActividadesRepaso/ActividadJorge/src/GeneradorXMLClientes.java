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

public class GeneradorXMLClientes {
    public void crearXML(Inmobiliaria inmobiliaria) throws ParserConfigurationException, TransformerException {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.newDocument();

                Element eClientes = doc.createElement("Clientes");
                doc.appendChild(eClientes);

                for (Cliente cliente : inmobiliaria.getClientes()) {
                    // definimos el nodo que contendrá los elementos
                    Element eCliente = doc.createElement("cliente");
                    eCliente.appendChild(eCliente);

                    // definimos cada uno de los elementos y le asignamos un valor
                    Attr nombre = doc.createAttribute("nombre");
                    nombre.setValue(cliente.getNombre());
                    eCliente.setAttributeNode(nombre);

                    Attr apellidos = doc.createAttribute("apellidos");
                    apellidos.setValue(cliente.getApellidos());
                    eCliente.setAttributeNode(apellidos);

                    Attr dni = doc.createAttribute("dni");
                    dni.setValue(cliente.getDni());
                    eCliente.setAttributeNode(dni);

                    Attr telefonoContacto = doc.createAttribute("telefonoContacto");
                    telefonoContacto.setValue(String.valueOf(cliente.getTelefonoContacto()));
                    eCliente.setAttributeNode(telefonoContacto);

                    Attr direccionContacto = doc.createAttribute("direccionContacto");
                    direccionContacto.setValue(cliente.getDireccionContacto());
                    eCliente.setAttributeNode(direccionContacto);
                }

                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("clientes.xml"));
                transformer.transform(source, result);
    }
}
