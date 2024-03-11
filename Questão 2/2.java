import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequencia de Fibonacci: ");
        int numeroInformado = scanner.nextInt();

        if (verificaFib(numeroInformado)) {
            System.out.println("O número " + numeroInformado + " pertence à sequencia de Fibonacci.");
        } else{
            System.out.println("O número " + numeroInformado + " não pertence à sequencia de Fibonacci.");
        }
    
    }
    
    public static boolean verificaFib(int numero) {
        int a = 0, b = 1;
        if (numero == a || numero == b) {
            return true;
        }

        while (a + b <= numero) {
            int c = a + b;
            if (c == numero) {
                return true;
            }
            a = b;
            b = c;
        }

        return false;
    }
}