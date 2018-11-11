import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int saque;
        int nota100;
        int nota50;
        int nota20;
        int nota10;
        int nota5;
        int nota2;
        
        System.out.println("Informe os dados abaixo");
        System.out.print("Quanto você quer sacar?");
        saque = leia.nextInt();
        
        nota100 = saque/100;
        nota50 = saque%100/50;
        nota20 = saque%50/20;
        nota10 = saque%20/10;
        nota5 = saque%10/5;
        nota2 = saque%5/2;
                                
        System.out.print("\u000C");
        
        System.out.println("...DADOS...");
        System.out.println("Quantidade de notas de 100: "+nota100);
        System.out.println("Quantidade de notas de 50: "+nota50);
        System.out.println("Quantidade de notas de 20: "+nota20);
        System.out.println("Quantidade de notas de 5: "+nota5);
        System.out.println("Quantidade de notas de 2: "+nota2);
    }
}