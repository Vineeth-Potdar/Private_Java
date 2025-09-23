package strings;

public class Reverse_string {
	public static void main(String[] args) {
		String s = "java is fun";
		System.out.println("The sentence is : "+s);
		String rev = "";
		String[] words = s.split(" ");
				for (int i = words.length - 1; i >=0; i--)
				{
					rev += words[i] +" ";
				}
				System.out.println("Reversed sentence is :"+rev);
	}
}
