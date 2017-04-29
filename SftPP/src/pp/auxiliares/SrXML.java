package pp.auxiliares;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SrXML {
	public void escreve(LinkedHashMap<String, List<String>> mapa, LinkedList<String> list) {
		try {

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document docXML = db.newDocument();

			Element root = docXML.createElement("Root");
			docXML.appendChild(root);

			Element perguntas = docXML.createElement("Perguntas");
			root.appendChild(perguntas);

			for (Entry<String, List<String>> entry : mapa.entrySet()) {
				Element p1 = docXML.createElement("p1");
				perguntas.appendChild(p1);
				Element p = docXML.createElement("p");
				p.appendChild(docXML.createTextNode(entry.getKey()));
				p1.appendChild(p);

				for (int i = 0; i < entry.getValue().size(); i++) {
					Element r = docXML.createElement("r");
					r.appendChild(docXML.createTextNode(entry.getValue().get(i)));
					p1.appendChild(r);
				}

			}

			Element lista = docXML.createElement("Lista");
			root.appendChild(lista);

			for (String string : list) {
				Element ra = docXML.createElement("ra");
				ra.appendChild(docXML.createTextNode(string));
				lista.appendChild(ra);
			}

			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();

			DOMSource docFonte = new DOMSource(docXML);

			StreamResult docFinal = new StreamResult(new File(".\\save.xml"));

			t.transform(docFonte, docFinal);

		} catch (ParserConfigurationException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void le(LinkedHashMap<String, List<String>> mapa, LinkedList<String> li) {
		String perg = null;

		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document docXML = db.parse(".\\save.xml");

			/*
			 * Percorre a lista de Perguntas
			 */

			NodeList listaPerguntas = docXML.getElementsByTagName("Perguntas");

			for (int i = 0; i < listaPerguntas.getLength(); i++) {
				Node noPerguntas = listaPerguntas.item(i);
				if (noPerguntas.getNodeType() == Node.ELEMENT_NODE) {
					Element ePerguntas = (Element) noPerguntas;

					NodeList listaFilhosPerguntas = ePerguntas.getChildNodes();

					for (int j = 0; j < listaFilhosPerguntas.getLength(); j++) {
						Node noFilhoPerguntas = listaFilhosPerguntas.item(j);

						if (noFilhoPerguntas.getNodeType() == Node.ELEMENT_NODE) {
							Element eFilhoPerguntas = (Element) noFilhoPerguntas;

							NodeList listaFilhoP1 = eFilhoPerguntas.getChildNodes();
							
							List<String> lista = new ArrayList<>();

							for (int k = 0; k < listaFilhoP1.getLength(); k++) {
								Node noFilhoP1 = listaFilhoP1.item(k);

								if (noFilhoP1.getNodeType() == Node.ELEMENT_NODE) {
									Element eFilhoP1 = (Element) noFilhoP1;

									switch (eFilhoP1.getTagName()) {
									case "p":
										perg = eFilhoP1.getTextContent();
										break;
									case "r":
										lista.add(eFilhoP1.getTextContent());
										break;
									default:
										break;
									}

								}
								mapa.put(perg, lista);
							}

						}
					}
				}
			}

			NodeList listaLista = docXML.getElementsByTagName("Lista");

			for (int i = 0; i < listaLista.getLength(); i++) {
				Node noLista = listaLista.item(i);

				if (noLista.getNodeType() == Node.ELEMENT_NODE) {
					Element eLista = (Element) noLista;

					NodeList listaFilhoLista = eLista.getChildNodes();

					for (int j = 0; j < listaFilhoLista.getLength(); j++) {
						Node noFilhoLista = listaFilhoLista.item(j);

						if (noFilhoLista.getNodeType() == Node.ELEMENT_NODE) {
							Element eFilhoLista = (Element) noFilhoLista;

							if (eFilhoLista.getTagName().equals("ra")) {
								li.add(eFilhoLista.getTextContent());
							}
						}
					}
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
