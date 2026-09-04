package basico;

public class Decisao {
    public static void main(String[] args) {
        int nota = 10;

        if (nota == 10){
            System.out.println("Aprovado com perfeição");
        }
        else if ((nota >= 7) && (nota<10)) {
            System.out.println("Aprovado");
        } else if ((nota >= 4) && (nota < 7)) {
            System.out.println("Exame");
        } else {
            System.out.println("Reprovado");

        }
    }
}
