import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        int a = leia.nextInt();
        System.out.println("Informe o valor de B: ");
        int b = leia.nextInt();
        System.out.println("Informe o valor de C: ");
        int c = leia.nextInt();
        double x1;
        double x2;
        double delta;
        
        System.out.print("\u000C");
        
        delta = (b * b) - (4 * a * c);
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        System.out.println("...RESULTADOS...");
        System.out.println("O delta é: "+delta);
        System.out.println("O x1 é: "+x1);
        System.out.println("O x2 é: "+x2);
    }
}