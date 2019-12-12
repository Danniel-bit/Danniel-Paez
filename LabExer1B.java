import java.util.Scanner;
public class LabExer1B
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = scan.nextInt();
		
		int a = num+10;
		int b = num+100;
		int c = num+1000;
		
		System.out.println(num+" plus 10 is "+a );// im not yet good at coding but still i hope my answer satisfies you HAHAHAHAHAH.
		System.out.println(num+" plus 100 is "+b );
		System.out.println(num+" plus 1000 is "+c );
	}
}
