import java.util.Scanner;
import java.util.ArrayList;
public class TesteAnaliseLexica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		criarToken analiseLexica = new criarToken();
		System.out.print("Digite a expressão matemática: ");
		analiseLexica.expressao = scan.nextLine();
		
		analiseLexica.dividirExpressao();
		analiseLexica.imprimirAnalise();
	    
		}
		
		
}	
		


