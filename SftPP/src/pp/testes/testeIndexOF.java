package pp.testes;

public class testeIndexOF {
	 public static void main(String[] args) {
	        String pro = "a�facebook.com";
	        int um;
	        int zero;
	        um = pro.lastIndexOf("�");
	        //zero = pro.lastIndexOf(".");
	        System.out.println(pro.substring(um+1));
	        System.out.println(pro.substring(0, pro.indexOf("�")));
	    }
}
