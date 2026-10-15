package Privado;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(){
        System.out.println("Objeto sendo criado....");
        this.nome = "";
        this.idade = 0;
        this.salario = 0;
    }



    public String getNome() {
        if (this.nome == null) {
            return "Nome ainda nao foi definido";
        }
        return this.nome;
    }

    public int getIdade() {
        if (this.idade == 0) {
        }
        return this.idade;
    }

    public double getSalario() {
        if (this.salario == 0) {
        }
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
