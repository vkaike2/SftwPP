package pp.testes;

public class testeIndexOF {
	 public static void main(String[] args) {
	        String pro = "aÄfacebook.com";
	        int um;
	        int zero;
	        um = pro.lastIndexOf("Ä");
	        //zero = pro.lastIndexOf(".");
	        System.out.println(pro.substring(um+1));
	        System.out.println(pro.substring(0, pro.indexOf("Ä")));
	    }
}
