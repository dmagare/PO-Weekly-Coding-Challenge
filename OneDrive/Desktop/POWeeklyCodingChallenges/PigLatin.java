import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence to convert to pig latin:");
		String latinWord = input.nextLine();
		System.out.println(PigLatin.TPL(latinWord));

	}
	public static String TPL(String latinWord) {
		StringBuilder sb = new StringBuilder();
		String punctuation = latinWord.substring(latinWord.length() - 1);
		String[] words = latinWord.substring(0, latinWord.length() - 1).split(" ");
		for(int i = 0; i< words.length; i++) {
			if("aeiouAEIOU".indexOf(words[i].charAt(0))>=0){
				sb.append(words[i] + "way");
			}
			else if(Character.isUpperCase(words[i].charAt(0))){
	sb.append(Character.toUpperCase(words[i].charAt(1))+words[i].substring(2)+Character.toLowerCase(words[i].charAt(0))+"ay");
				
			}else{
				sb.append(words[i].charAt(1)+ words[i].substring(2)+ words[i].charAt(0)+"ay");
			}
			if(i!=words.length-1) {
				sb.append(" ");
			}
				
		}
		sb.append(punctuation);
		return sb.toString();
			
		}
	}
	
