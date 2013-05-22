public class Strings {
	public static void main(String[] args) {
		char[] array = { 'a', 'b', 'c' };
		String str = new String(array);
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.endsWith("bc"));
		str = str.concat("fff"+"ffff");
		System.out.println(str);
		String test = "98765.654";
		System.out.println(Float.parseFloat(test));
		System.out.println(test.charAt(6));
		System.out.println(test.substring(3, 6));
		String [] t = test.split("8");
	}

}
