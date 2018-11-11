import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        double numero1 = leia.nextDouble();
        System.out.println("Informe o segundo número: ");
        double numero2 = leia.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double numero3 = leia.nextDouble();
        double resultado;
        
        System.out.print("\u000C");
        
        resultado = numero1+(numero2*numero3);
        
        System.out.println("...RESULTADO...");
        System.out.println("O resultado do "+numero1+" + o "+numero2+" multiplicado pelo número "+numero3+" é "+resultado);
    }    
}