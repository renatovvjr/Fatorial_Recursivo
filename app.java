import java.util.Scanner;
/**
 * Este Programa realiza o calculo fatorial 
 * de um número utilizando a recursividade.
 */
public class app {

    public static int fatorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * fatorial(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Informe o número do fatorial: ");
        num1 = sc.nextInt();
        System.out.println("O fatorial do número " + num1 + " é: " + fatorial(num1));

    }

}