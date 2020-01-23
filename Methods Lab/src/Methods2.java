
public class Methods2 {
	// TA EXAMPLE METHOD:
	// this method is the same as in our first methods lab, but instead, its return type is a double
	public static double circleArea(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public static String smashWords(String one, String two) {
		String s1 = one.substring(0, one.length()/2);
		String s2 = two.substring(two.length()/2);
		return s1 + s2;
	}
	
	public static double pyTheorem(double a, double b) {
		return Math.sqrt((a*a) + (b*b));
	}
	
	public static int charToASCII(char c) {
		return (int)c;
	}
	
	public static char lastCharacter(String word) {
		return word.charAt(word.length()-1);
	}
	
	public static void main (String [] args) {
		// we can assign the return of the method to a variable
		double area1 = circleArea(3.0);
		System.out.println(area1);
				
		// or we can print it out directly
		System.out.println(circleArea(2.0));
		
		// testing smashWords
		System.out.println(smashWords("triceratops", "tyrannosaurus"));
		
		// testing pyTheorem
		System.out.println(pyTheorem(3.0,4.0));
		System.out.println(pyTheorem(5.0,12.0));
		
		//testing last character method
		System.out.println(lastCharacter("yellow"));
		System.out.println(lastCharacter("spaghetti"));
		
		//testing charToASCII method
		System.out.println(charToASCII('a'));
		System.out.println(charToASCII('!'));
	}
}
