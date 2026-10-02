package calculadora;

public class Calculadora {
    double n1, n2;
    double resultado;

    public double somar() {
        resultado = n1 + n2;
        return resultado;

    }

    public double subtrair() {
        resultado = n1 - n2;
        return resultado;
    }

    public double multiplicar() {
        resultado = n1 * n2;
        return resultado;


    }

    public double dividir() {
        resultado = n1 / n2;
        return resultado;

    }

    public double mostrarUltimoResultadoCalculado() {
        System.out.println("Resultado atual é: " + resultado);
        return resultado;
    }
}
