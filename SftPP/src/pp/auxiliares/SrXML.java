package pp.auxiliares;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
	public void escreve(LinkedHashMap<String, List<String>> mapa, LinkedList<String> list, List<String> linke,
			List<String> listCombo) {
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

			Element link = docXML.createElement("Link");
			root.appendChild(link);

			for (String string : linke) {
				Element ra = docXML.createElement("url");
				ra.appendChild(docXML.createTextNode(string));
				link.appendChild(ra);
			}

			Element combo = docXML.createElement("Combo");
			root.appendChild(combo);

			for (String string : listCombo) {
				Element ra = docXML.createElement("cb");
				ra.appendChild(docXML.createTextNode(string));
				combo.appendChild(ra);
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

	public void escreveUsuario(LinkedList<String> usuario, LinkedList<String> senha, LinkedList<Integer> permicao) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document docXML = db.newDocument();

			Element root = docXML.createElement("Root");
			docXML.appendChild(root);

			Element id = docXML.createElement("Usuario");
			root.appendChild(id);

			for (String string : usuario) {
				Element user = docXML.createElement("user");
				user.appendChild(docXML.createTextNode(string));
				id.appendChild(user);
			}

			Element psw = docXML.createElement("Senha");
			root.appendChild(psw);

			for (String string : senha) {
				Element password = docXML.createElement("psw");
				password.appendChild(docXML.createTextNode(string));
				psw.appendChild(password);
			}
			Element perm = docXML.createElement("Permicoes");
			root.appendChild(perm);

			for (Integer string : permicao) {
				Element cao = docXML.createElement("p");
				cao.appendChild(docXML.createTextNode(String.valueOf(string)));
				perm.appendChild(cao);
			}

			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();

			DOMSource docFonte = new DOMSource(docXML);

			StreamResult docFinal = new StreamResult(new File(".\\user.xml"));

			t.transform(docFonte, docFinal);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void leUsuario(LinkedList<String> usuario, LinkedList<String> senha, LinkedList<Integer> permicao) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document docXML = db.parse(".\\user.xml");

			NodeList listaUsuario = docXML.getElementsByTagName("Usuario");

			for (int i = 0; i < listaUsuario.getLength(); i++) {
				Node noListaUsuario = listaUsuario.item(i);

				if (noListaUsuario.getNodeType() == Node.ELEMENT_NODE) {
					Element eListaUsuario = (Element) noListaUsuario;

					NodeList listaFilhoListaUsuario = eListaUsuario.getChildNodes();

					for (int j = 0; j < listaFilhoListaUsuario.getLength(); j++) {
						Node noFilhoListaUsuario = listaFilhoListaUsuario.item(j);

						if (noFilhoListaUsuario.getNodeType() == Node.ELEMENT_NODE) {
							Element eFilhoListaUsuario = (Element) noFilhoListaUsuario;

							if (eFilhoListaUsuario.getTagName().equals("user")) {
								usuario.add(eFilhoListaUsuario.getTextContent());
							}
						}
					}
				}

			}

			NodeList listaSenha = docXML.getElementsByTagName("Senha");

			for (int i = 0; i < listaSenha.getLength(); i++) {
				Node noListaSenha = listaSenha.item(i);

				if (noListaSenha.getNodeType() == Node.ELEMENT_NODE) {
					Element eListaSenha = (Element) noListaSenha;

					NodeList listaFilhoListaSenha = eListaSenha.getChildNodes();

					for (int j = 0; j < listaFilhoListaSenha.getLength(); j++) {
						Node noFilhoListaSenha = listaFilhoListaSenha.item(j);

						if (noFilhoListaSenha.getNodeType() == Node.ELEMENT_NODE) {
							Element eFilhoListaSenha = (Element) noFilhoListaSenha;

							if (eFilhoListaSenha.getTagName().equals("psw")) {
								senha.add(eFilhoListaSenha.getTextContent());
							}
						}
					}
				}

			}

			NodeList listaListaPermicao = docXML.getElementsByTagName("Permicoes");

			for (int i = 0; i < listaListaPermicao.getLength(); i++) {
				Node noListaPermicao = listaListaPermicao.item(i);

				if (noListaPermicao.getNodeType() == Node.ELEMENT_NODE) {
					Element eListaPermicao = (Element) noListaPermicao;

					NodeList listaFilhoListaPermicao = eListaPermicao.getChildNodes();

					for (int j = 0; j < listaFilhoListaPermicao.getLength(); j++) {
						Node noFilhoListaPermicao = listaFilhoListaPermicao.item(j);

						if (noFilhoListaPermicao.getNodeType() == Node.ELEMENT_NODE) {
							Element eFilhoListaPermicao = (Element) noFilhoListaPermicao;

							if (eFilhoListaPermicao.getTagName().equals("p")) {
								permicao.add(Integer.valueOf(eFilhoListaPermicao.getTextContent()));
							}
						}
					}
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void le(LinkedHashMap<String, List<String>> mapa, LinkedList<String> li, List<String> linke,
			List<String> listaCombo) {
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

			NodeList listaLink = docXML.getElementsByTagName("Link");

			for (int i = 0; i < listaLink.getLength(); i++) {
				Node noLink = listaLink.item(i);

				if (noLink.getNodeType() == Node.ELEMENT_NODE) {
					Element eLink = (Element) noLink;

					NodeList listaFilhoLink = eLink.getChildNodes();

					for (int j = 0; j < listaFilhoLink.getLength(); j++) {
						Node noFilhoLink = listaFilhoLink.item(j);

						if (noFilhoLink.getNodeType() == Node.ELEMENT_NODE) {
							Element eFilhoLink = (Element) noFilhoLink;

							if (eFilhoLink.getTagName().equals("url")) {
								linke.add(eFilhoLink.getTextContent());
							}
						}
					}
				}

			}

			NodeList listCombo = docXML.getElementsByTagName("Combo");

			for (int i = 0; i < listCombo.getLength(); i++) {
				Node noCombo = listCombo.item(i);

				if (noCombo.getNodeType() == Node.ELEMENT_NODE) {
					Element eCombo = (Element) noCombo;

					NodeList listaFilhoCombo = eCombo.getChildNodes();

					for (int j = 0; j < listaFilhoCombo.getLength(); j++) {
						Node noFilhoCombo = listaFilhoCombo.item(j);

						if (noFilhoCombo.getNodeType() == Node.ELEMENT_NODE) {
							Element eFilhoCombo = (Element) noFilhoCombo;

							if (eFilhoCombo.getTagName().equals("cb")) {
								listaCombo.add(eFilhoCombo.getTextContent());
							}
						}
					}
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void atualizar(List<String> listaLinks, LinkedList<String> listaPergAnteriro,
			LinkedHashMap<String, List<String>> mapaConfig, List<String> listaCombo) {
		listaLinks.clear();
		listaPergAnteriro.clear();
		listaCombo.clear();

		le(mapaConfig, listaPergAnteriro, listaLinks, listaCombo);

	}

	public void atualizaUsuario(LinkedList<String> usuario, LinkedList<String> senha, LinkedList<Integer> permicao) {
		usuario.clear();
		senha.clear();
		permicao.clear();

		leUsuario(usuario, senha, permicao);
	}



}
