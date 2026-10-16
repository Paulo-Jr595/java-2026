package Privado;

public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario fulano = new Funcionario(
                "Fulano da Silva",
                40,
                1234.56
        );

        System.out.println("Nome: " + fulano.getNome());
        System.out.println("Idade: " + fulano.getIdade());
        System.out.println("Salario: " + fulano.getSalario());

    }

}


