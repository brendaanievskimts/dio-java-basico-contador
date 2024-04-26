import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um 1° valor: ");
        int valorA = in.nextInt();

        System.out.print("Informe um 2° valor: ");
        int valorB = in.nextInt();

        try {
            contar(valorA, valorB);
        } catch(ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;

            System.out.println("Imprimindo números:");
            for(int i = 0; i < contagem; i++) {
                System.out.println(i+1);
            }
        }
    }

}
