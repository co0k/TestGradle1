import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;


public class TestGradle {
	
	public List<String> plainText(){
		List<String> plain = new ArrayList<String>();
		plain.add("This Text will change");
		plain.add("using Base64 from");
		plain.add("org.apache.commons.codec.binary");
		return plain;
	}
	
	public void printText(List<String> plain){
		for(String line : plain){
			System.out.println(encode(line));
		}
	}
	
	public String encode(String plain){
		Base64 codec = new Base64();
		return new String(codec.encode(plain.getBytes()));
	}
	
	public static void main(String[] args) {
		TestGradle t = new TestGradle();
		t.printText(t.plainText());
		
		
	}
}
