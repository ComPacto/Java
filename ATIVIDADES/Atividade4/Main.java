import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero = leia.nextInt();
        double resultadoQuadrado;
        
        System.out.print("\u000C");
        
        resultadoQuadrado = Math.pow(numero,2);
        
        System.out.println("...RESULTADO...");
        System.out.println("O valor ao quadrado do número "+numero+" é igual a: "+resultadoQuadrado);
    }
}