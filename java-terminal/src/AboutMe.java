import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();  // retorna string 
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();  // retorna string 

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();  // converte pro int 
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();   // converte pro double 

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}

