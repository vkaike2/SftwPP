package pp.testes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class testeHashMap {

	LinkedHashMap<String, List<String>> mapaTeste = new LinkedHashMap<>();
	List<String> listaTeste = new ArrayList<>();
	List<String> listaTeste2 = new ArrayList<>();
	List<String> listaTeste3 = new ArrayList<>();

	public void adicionarItens() {
		for (int i = 0; i < 3; i++) {
			listaTeste.add(String.valueOf(i));
		}
		for (int i = 0; i < 3; i++) {
			listaTeste2.add("a" + String.valueOf(i));
		}
		for (int i = 0; i < 3; i++) {
			listaTeste3.add("b " + String.valueOf(i));
		}
		mapaTeste.put("teste1", listaTeste);
		mapaTeste.put("teste2", listaTeste2);
		mapaTeste.put("teste3", listaTeste3);
		System.out.println("Add itens");
		System.out.println();
		for (Entry<String, List<String>> entry : mapaTeste.entrySet()) {
			System.out.println(entry.getKey());
			for (String string : entry.getValue()) {
				System.out.println("   " + string);
			}
		}
	}

	public void substituindoItens() {
		LinkedList<String> lista = new LinkedList<>();
		LinkedHashMap<String, List<String>> teste = new LinkedHashMap<>();

		for (Entry<String, List<String>> entry : mapaTeste.entrySet()) {
			lista.add(entry.getKey());
			if (entry.getKey().equals("teste2")) {
				String key = entry.getKey();
				List<String> value = new ArrayList<>();
				key = "batata";
				for (String str : entry.getValue()) {
					value.add(str);
				}
				teste.put(key, value);

			} else {
				String key = entry.getKey();
				List<String> value = new ArrayList<>();
				for (String str : entry.getValue()) {
					value.add(str);
				}
				teste.put(key, value);
			}
		}
		for (String string : lista) {
			mapaTeste.remove(string);
		}
		mapaTeste.putAll(teste);

		System.out.println("Mostrar pra ver se testou");
		System.out.println();
		for (Entry<String, List<String>> entry : mapaTeste.entrySet()) {
			System.out.println(entry.getKey());
			for (String string : entry.getValue()) {
				System.out.println("   " + string);
			}
		}
	}

	public testeHashMap() {
		adicionarItens();
		substituindoItens();
	}

	public static void main(String[] args) {
		new testeHashMap();
	}
}
