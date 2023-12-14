import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
         double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x); // %.2f padrão para delimitar casas decimais e arredondar e o %n para pular linha. 
 /*      %.2f - pega o argumento e imprime com 2 casas depois da vírgula.
%n - passa para a próxima linha (equivalente ao println()).*/

		System.out.printf("%.4f%n", x); // o printf por padrão pega o separador de decimais da linguagem do computador e nesse caso pegou do português, que é a vírgula. Pra trocar a vígula pelo ponto é preciso configurar o programa para o separador dos EUA. 
		Locale.setDefault(Locale.US); // Essa é a classe para mudar para US. 
		System.out.printf("%.4f%n", x); // Agora ele imprimiu com o ponto pq eu importei a classe Locale. 
	         System.out.println("RESULTADO = " + x + " METROS");

    }
}
