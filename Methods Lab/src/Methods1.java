
public class Methods1 {
	public static void main(String [] args) {
		circleArea(2.0);
		circleArea(3.0);
		System.out.println();
		
		sphereVolume(2.0);
		sphereVolume(3.0);
		System.out.println();
		
		pluralWord("dog");
		pluralWord("cheeto");
		System.out.println();
		
		swapFirstLetters("Good", "Morning");

	}
	
	public static void pluralWord(String s) {
		System.out.println(s + "s");
	}
	public static void circleArea(double radius) {
		double area = Math.PI * radius * radius;
		System.out.println(area);
	}
	
	public static void sphereVolume(double radius) {
		double volume = Math.PI * (4.0/3.0) * Math.pow(radius,  3);
		System.out.println(volume);
	}
	
	public static void swapFirstLetters(String s1, String s2) {
		char s1first = s1.charAt(0);
		char s2first = s2.charAt(0);
		System.out.println("Swapping first letters of " + s1 + " and " + s2);
		System.out.print(s2first + s1.substring(1) + " ");
		System.out.println(s1first + s2.substring(1));
	}
	
}
