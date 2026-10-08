package calculadora;

import javax.swing.*;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        do {
            String numero1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");

            String numero2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

            if (numero1 == null || numero2 == null) {
                System.exit(0);
            }

            else if(numero1.trim().isEmpty() || numero2.trim().isEmpty()){
                JOptionPane.showMessageDialog(
                        null,
                        "ERRO! Caracteres Invalidos - tente novamente!");
            }

             else {
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);


                double total = calc.somar(num1, num2);

                JOptionPane.showMessageDialog(
                        null,
                        "Resultado: " + total);

            }
        }while(true);
    }
}
