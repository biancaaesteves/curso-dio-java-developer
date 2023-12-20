import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
        sc.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro.
           System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
         }

}

static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    if (parametroUm > parametroDois) {
        // se o primeiro param for > que o segundo param, lançamos uma exceção. 
        throw new ParametrosInvalidosException();
    } else {
        // do contrário, subtrai o segundo param do primeiro p/ saber a qtidade de iterações. 
    int contagem = parametroDois - parametroUm;
    //realizar o for para imprimir os números com base na variável contagem
    for (int i =1; i <= contagem; i++) {
        System.out.println("Imprimindo o número " + i);
    }
    System.out.println("Total de " + contagem + " ocorrências");
    }
    
}

}

