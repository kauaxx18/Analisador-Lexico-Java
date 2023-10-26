
import java.util.ArrayList;

public class criarToken {

	String expressao;
	String tokenAtual = ""; 
	ArrayList<String> token = new ArrayList<>();
	char elemento;
	String tokenInput = "";
	char caracterToken;
	
	void dividirExpressao() { 
		for (int i=0; i<expressao.length(); i++) {
			
			if(expressao.charAt(i)== ' ') {
				continue;
			}
			
			elemento = expressao.charAt(i);
      
	        //verifica se a variável "elemento" é um digito numérico
			if(Character.isDigit(elemento) || elemento == ',') {
				tokenAtual += elemento;
				
				//verifica se o elemento atual é o ultimo elemento da expressão
	            //Ou se o próximo caractere é um operador, e não contém vírgula
				if(i == expressao.length() - 1 || !Character.isDigit(expressao.charAt(i+1)) && expressao.charAt(i+1) != ',') {
					token.add(tokenAtual);
					tokenAtual = "";
				}
			} else if (elemento == '/' || elemento == '*' || elemento == '+' || elemento == '-' || elemento == '(' || elemento == ')') {
				token.add(String.valueOf(elemento));
			}	
		
		}
	}
	
	void imprimirAnalise() {
		for (int i = 0; i < token.size(); i++) {
		    tokenInput = token.get(i);
		    caracterToken = tokenInput.charAt(0);
		    if(tokenInput.contains(",")) {
		    	System.out.println("Elemento: " + tokenInput + " | Tipo = Número real");
		    } else if (Character.isDigit(caracterToken)) {
		    	System.out.println("Elemento: " + tokenInput + " | Tipo = Número inteiro");
			} else if (caracterToken == '/') {
				System.out.println("Elemento: " + tokenInput + " | Tipo = Divisão");
			} else if (caracterToken == '+') {
				System.out.println("Elemento: " + tokenInput + " | Tipo = Adição");
            } else if (caracterToken == '-') {
            	System.out.println("Elemento: " + tokenInput + " | Tipo = Subtração");
			} else if (caracterToken == '*') {
				System.out.println("Elemento: " + tokenInput + " | Tipo = Multiplicação");
			} else if (caracterToken == '(') {
				System.out.println("Elemento: " + tokenInput + " | Tipo = Abre parêntese");
			} else if (caracterToken == ')') {
				System.out.println("Elemento: " + tokenInput + " | Tipo = Fecha parêntese");
			}
		   
		   	
		  }
			
	}
			
		   
	
	
}
	
	

