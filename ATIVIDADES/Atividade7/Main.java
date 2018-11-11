import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantos R$ vocẽ vendeu?");
        double valorVendas = leia.nextDouble();
        double comissao = 4;
        double salarioInicial = 800.00;
        double salarioFinal;
        
        System.out.print("\u000C");
        
        comissao = (valorVendas*comissao)/100;
        salarioFinal = salarioInicial+comissao;
        
        System.out.println("...SEU SALÁRIO...");
        System.out.println("Seu total de comissão é: "+comissao);
        System.out.println("No total seu salário fica: "+salarioFinal);
    }
}