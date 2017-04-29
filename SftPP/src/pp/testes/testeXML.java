package pp.testes;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class testeXML {
	private void escreve() {
		// TODO Auto-generated method stub
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document docXML = db.newDocument();

			Element root = docXML.createElement("root");
			docXML.appendChild(root);

			Element pessoa = docXML.createElement("Pessoa");
			Attr id = docXML.createAttribute("id");
			id.setValue("1");

			pessoa.setAttributeNode(id);
			root.appendChild(pessoa);

			Element nome = docXML.createElement("Nome");

			// <nome>Kaike</nome>
			nome.appendChild(docXML.createTextNode("Kaike"));
			pessoa.appendChild(nome);

			Element idade = docXML.createElement("Idade");
			idade.appendChild(docXML.createTextNode("55"));
			pessoa.appendChild(idade);

			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();

			DOMSource docFonte = new DOMSource(docXML);

			StreamResult docFinal = new StreamResult(new File(".\\teste.xml"));

			t.transform(docFonte, docFinal);

		} catch (ParserConfigurationException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ler() {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document docXML = db.parse(".\\teste.xml");

			NodeList listaDePessoas = docXML.getElementsByTagName("Pessoa");

			int tamanhoLista = listaDePessoas.getLength();

			for (int i = 0; i < tamanhoLista; i++) {
				Node noPessoa = listaDePessoas.item(i);

				if (noPessoa.getNodeType() == Node.ELEMENT_NODE) {
					Element elementoPessoa = (Element) noPessoa;

					// pega elemento
					String id = elementoPessoa.getAttribute("id");

					NodeList listaDeFilhosPessoa = elementoPessoa.getChildNodes();

					int tamanhoListaFilhos = listaDeFilhosPessoa.getLength();

					for (int j = 0; j < tamanhoListaFilhos; j++) {
						Node noFilho = listaDeFilhosPessoa.item(j);
						
						if(noFilho.getNodeType() == Node.ELEMENT_NODE){
							Element elementoFilho = (Element) noFilho;
							
							switch (elementoFilho.getTagName()) {
							case "nome":
								//pega o nome
								System.out.println(elementoFilho.getTextContent());								
								break;
							case "idade":
								System.out.println(elementoFilho.getTextContent());
								

							default:
								break;
							}
						}
					}

				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

	}
}
