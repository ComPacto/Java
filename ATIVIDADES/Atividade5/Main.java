import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int a = leia.nextInt();
        System.out.println("Informe o segundo número: ");
        int b = leia.nextInt();
        System.out.println("Informe o terceiro número: ");
        int c = leia.nextInt();
        
        System.out.print("\u000C");
        
        a = b;
        b = c;
        c = a;
        
        System.out.println("...RESULTADO...");
        System.out.println("O valor "+a+" foi trocado por: "+b);
        System.out.println("O valor "+b+" foi trocado por: "+c);
        System.out.println("O valor "+c+" foi trocado por: "+a);
    }
}