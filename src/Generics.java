import java.util.ArrayList;


public class Generics {
	public static <T extends Number,K> void testGeneric(T t,K k){
		
		System.out.println(t.floatValue());
		System.out.println(k.toString());

	}
	public void test(ArrayList<? super Object> a){
		
		
	}
	
	public static void main(String[] args){
		Generics.testGeneric(9,"salih");



	}

}
