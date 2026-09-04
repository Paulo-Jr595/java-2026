package basico;

public class Basico {
    public static void main() {
        System.out.println("Lista de 1 a 10 ");
        for (int i=1;i<=10;i++) {
            System.out.println(i);
        }
        System.out.println("\n\n Lista de 10 a 1");
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
        // Versão crescente com while.
        System.out.println(" \n\nLista com decrescente While");
        int numero = 10; //inicialização da variavel
        while(numero>=1) {
            System.out.println(numero);
            numero--;

            System.out.println("Lista crescente em While");
            int numero1 = 1;
            while (numero1<=10) {

                System.out.println(numero1);
                numero1++;
            }
        }
    }
}
