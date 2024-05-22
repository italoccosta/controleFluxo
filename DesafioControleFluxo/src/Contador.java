import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametro1 = scan.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int parametro2 = scan.nextInt();

        try {
            ValidarContador(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deverá ser maior que o primeiro.");
        }
    }

    static void ValidarContador(int parametro1, int parametro2) throws ParametrosInvalidosException {

        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = parametro1; i <= parametro2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }

    }
}
