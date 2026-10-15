package Privado;

public class TestaCelular {
    public static void main(String[] args) {
        Celular celular = new Celular();

        celular.setMarca("Samsung");
        celular.setModelo("S24 Ultra");
        celular.setAno(2024);

        System.out.println("Marca do celular: " + celular.getMarca());
        System.out.println("Modelo do celular: " + celular.getModelo());
        System.out.println("Ano do celular: " + celular.getAno());

    }
}
