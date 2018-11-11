import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantas latas foram vendidas?");
        int latasVendidas = leia.nextInt();
        System.out.println("Quantos refrigerantes de 600ml foram vendidos?");
        int refri600 = leia.nextInt();
        System.out.println("Quantos refrigerantes de 2L foram vendidos?");
        int refri2L = leia.nextInt();
        int totalLitrosVendidos;
        double valorTotalVendido;
        
        System.out.print("\u000C");
       
        valorTotalVendido = refri600 * 1.80 + refri2L * 2.80;
        refri600 = 600 * refri600;
        refri2L = 2000 * refri2L;
        totalLitrosVendidos = refri600 + refri2L;
        
        System.out.println("...TOTAL...");
        System.out.println("O total de litros vendidos é: "+totalLitrosVendidos+"L");
        System.out.println("O valor total é: "+valorTotalVendido+" R$ ");
    }
}    