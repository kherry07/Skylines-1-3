package exerios;
import java.util.Scanner;
public class eveonline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		try {
			
			String word = "";
			System.out.println("ingresa una palabra " );
			word = keyboard.next();
		 	  
	        String subcadena = word.substring(3, 5);
	        System.out.println("La cuarta y quinta letra son: " + subcadena);
		}
		catch (Exception e)
		{
			System.out.println("the words is most ");
		}
		}
		
		}
		
