package basico;

import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Digite uma nota de 1 a 10 (Digite -1 para sair): ");
            nota = entrada.nextInt();

            if (nota < -1 || nota > 10) {
                System.out.print("Valor inválido! Try Again.");
                continue;
            }

            if (nota == -1) {
                System.out.print("Programa Encerrado");
                break;
            }
            if (nota == 10) {
                System.out.println("Aprovado com perfeição");
            } else if ((nota >= 7) && (nota < 10)) {
                System.out.println("Aprovado");
            } else if ((nota >= 4) && (nota < 7)) {
                System.out.println("Exame");
            } else {
                System.out.println("Reprovado");

            }
        } while (nota != -1);
    }
}
