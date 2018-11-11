package projsalarioarray;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double[] salario = new double[12];
        double decimoTerceiro = 0;
        double sm = 0;
        String todosOsSalarios = "";

        for (int i = 0; i < 12; i++) {
            salario[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe os salários: "));
            decimoTerceiro += salario[i];
            todosOsSalarios += salario[i] + "\n";
            if (salario[i] > sm) {
                sm = salario[i];
            }
        }

        decimoTerceiro = decimoTerceiro / 12;
        double ferias = decimoTerceiro * 1.33333;

        JOptionPane.showMessageDialog(null, "Maior salário: " + sm + "\n"
                + "Décimo terceiro: " + decimoTerceiro + "\n"
                + "Férias: " + ferias + "\n"
                + "Salários dos funcionários:\n" + todosOsSalarios);
    }

}
