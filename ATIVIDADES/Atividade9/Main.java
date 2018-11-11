import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual é o salário mínimo?");
        double salarioMinimo = leia.nextDouble();
        System.out.println("Quanto o funcionário ganha?");
        double salarioFuncionario = leia.nextDouble();
        double quantidadeSalarioMinimo;
        
        System.out.print("\u000C");
        
        quantidadeSalarioMinimo = salarioFuncionario/salarioMinimo;
        
        System.out.println("...SEU SALÁRIO...");
        System.out.println("Você ganha cerca de: "+quantidadeSalarioMinimo+" salários mínimos");
    }
}