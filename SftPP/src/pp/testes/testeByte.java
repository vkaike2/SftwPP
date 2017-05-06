package pp.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pp.auxiliares.Md5Util;

public class testeByte {
	
	public static void main(String[] args) {
		String str = "batata";
		Md5Util md5 = new Md5Util();
		//byte[] bteste = [-98, -73, 26, -73, 66, 14, -76, 82, -94, 39, -121, -54, 79, -85, 80, 27];
		List<byte[]> teste = new ArrayList<>(); 
		try {
			teste.add(md5.escondeSenha(str));
			System.out.println(Arrays.toString(teste.get(0)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
