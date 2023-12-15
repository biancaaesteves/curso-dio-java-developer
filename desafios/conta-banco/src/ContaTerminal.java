import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome: ");
        String nome = sc.next();
        System.out.println("Por favor, digite o número da agência:");
        int agencia = sc.nextInt();
        System.out.println("Usuário: ");
        int conta = sc.nextInt();
        System.out.println("Valor do depósito: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco! Sua agência é %d, sua conta é %d e seu saldo é %.2f.%n", nome, agencia, conta, saldo);

sc.close();
      
    }
}
