import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
    
      Number valor;
    try {
        valor = NumberFormat.getInstance().parse("a1.75"); // tenta converter essa string p/ um valor.
        System.out.println(valor);

        // se não der certo, é preciso tratar:
    } catch (ParseException e) {
    
        e.printStackTrace();
    }
       
    }
}