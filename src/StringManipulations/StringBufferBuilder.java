package StringManipulations;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("selenium");

		sb.append("test");
		
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuffer sf=new StringBuffer("testing");
		System.out.println(sf.append("Case"));

	}

}
