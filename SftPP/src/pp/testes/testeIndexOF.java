package pp.testes;

import java.util.List;

import javax.swing.JOptionPane;

public class testeIndexOF {
	 public static void main(String[] args) {
	        String pro = "a�facebook.com";
	        int um;
	        int zero;
	        um = pro.lastIndexOf("�");
	        //zero = pro.lastIndexOf(".");
	        System.out.println(pro.substring(um+1));
	        System.out.println(pro.substring(0, pro.indexOf("�")));
	        
	        int escolha = JOptionPane.showOptionDialog(null,"teste","batata", JOptionPane.YES_OPTION,JOptionPane.NO_OPTION,null,null,null);
	        System.out.println(String.valueOf(escolha));
	        
	    }
}
