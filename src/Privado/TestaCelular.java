package Privado;

public class TestaCelular {
    public static void main(String[] args) {
        Celular celular = new Celular(
                "Samsung",
                "S24 Ultra",
                2024
        );


        System.out.println("Marca do celular: " + celular.getMarca());
        System.out.println("Modelo do celular: " + celular.getModelo());
        System.out.println("Ano do celular: " + celular.getAno());

    }
}
