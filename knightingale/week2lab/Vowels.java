package week2lab;

public class Vowels {
  public static void main(String[] args) {
	  char ch = 't';
	  int ascii= ch; 
	  System.out.println("ascii value is "+ ascii);
	  
	  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	  System.out.println(ch + " is vowel");
	  else
	  System.out.println(ch + " is consonant");
	  
}
}
