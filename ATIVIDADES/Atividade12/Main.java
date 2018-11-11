import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Que ano você nasceu?");
        int anoNascimento = leia.nextInt();
        System.out.println("Em que ano você está?");
        int anoAtual = leia.nextInt();
        int idade;
        int idade2020;
        
        System.out.print("\u000C");
        
        idade = anoAtual-anoNascimento;
        idade2020 = 2020-anoNascimento;
        
        System.out.println("...RESULTADOS...");
        System.out.println("Sua idade é: "+idade);
        System.out.println("Sua idade em 2020 é: "+idade2020);
    }
}