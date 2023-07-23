import java.util.Scanner;

public class MessageDecoderApp 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		MessageDecoder decoder = new MessageDecoder();
		System.out.println(decoder.decodeCharacter('A'));
		
		
	}

}
