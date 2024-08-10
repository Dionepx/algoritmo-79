import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double i, p, n, vl;

        System.out.println("Qual a taxa?");
        i = sc.nextInt();

        System.out.println("Qual a aplicação mensal?");
        p = sc.nextInt();

        System.out.println("Qual o número de meses?");
        n = sc.nextInt();

        vl = p * Math.pow(1 + i, n) / i;

        System.out.println("Taxa: " + i + "%");
        System.out.println("Aplicação mensal: " + p);
        System.out.println("Número de meses: " + n);

        sc.close();
    }
}