package dy1206;

public class StringEx {
	java.lang.String stra = "DongyangMirae Univ";
	String strb = new String("Computer");
	System.out.println(stra + "길이=" + stra.length());
	System.out.println(stra.CharAt(2));
	for (int i = 0; i <stra.length(); i++) {
		System.out.print(stra.CharAt(i));
	}
	System.out.println();
	for (int i = strb.length()-1; i >=0; i--) {
		System.out.print(strb.CharAt(i));
	}
	
	System.out.println();
}