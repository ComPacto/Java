import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual é o salário do funcionário?");
        double salarioFuncionario = leia.nextDouble();
        double salarioReceber;
        double gratificacao = 5;
        double imposto = 7;
        
        System.out.print("\u000C");
        
        gratificacao = (salarioFuncionario * gratificacao)/100;
        imposto = (salarioFuncionario * imposto)/100;
        salarioReceber = salarioFuncionario + gratificacao - imposto;
        
        System.out.println("...SEU SALÁRIO...");
        System.out.println("O seu salário é: "+salarioReceber);
    }
}