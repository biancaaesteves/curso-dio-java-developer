public class ParametrosInvalidosException extends Exception {

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

