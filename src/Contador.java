import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }

    public char[] getMessage(String string) {
        return null;
    }
}

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
            	//chamando o método contendo a lógica de contagem
            	contar(parametroUm, parametroDois);
            
            }catch (ParametrosInvalidosException e) {
            	//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(e.getMessage("O segundo parâmetro deve ser maior que o primeiro"));
            }catch (Exception e) {
                System.out.println("Erro desconhecido: " + e.getMessage());
            }
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException(null);
        } else {
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            for(int i = 1; i < contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }        
	}
}