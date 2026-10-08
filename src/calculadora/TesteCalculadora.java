package calculadora;

import javax.swing.*;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.n1 = 40;
        calc.n2 = 2;
        System.out.println(calc.n1);
        System.out.println(calc.n2);
        System.out.println("Soma: " + calc.somar());
        System.out.println("Divisão: " + calc.dividir());
        System.out.println("Multiplicação: " + calc.multiplicar());
        System.out.println("Subtração: " + calc.subtrair());


        calc.n1 = 20;
        calc.n2 = 10;
        calc.mostrarUltimoResultadoCalculado();


        JOptionPane.showMessageDialog(null, calc.mostrarUltimoResultadoCalculado());

        System.out.println("123");


    }
}
