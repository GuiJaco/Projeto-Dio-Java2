import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scanner.nextInt();

                try {
                    contar(parametroUm, parametroDois);

                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new RuntimeException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número: " + (i+1));
        }
    }
}


