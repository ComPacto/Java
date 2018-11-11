import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        double valor1 = leia.nextDouble();
        System.out.println("Informe o segundo número: ");
        double valor2 = leia.nextDouble();
        System.out.println("Informe o terceiro número: ");
        double valor3 = leia.nextDouble();
        System.out.println("Informe o quarto número: ");
        double valor4 = leia.nextDouble();
        System.out.println("Informe o quinto número: ");
        double valor5 = leia.nextDouble();
        double soma;
        double produto;
        double media;
        
        System.out.print("\u000C");
        
        soma = valor1+valor2+valor3+valor4+valor5;
        produto = valor1*valor2*valor3*valor4*valor5;
        media = (soma+produto)/5;
        
        System.out.println("...RESULTADOS...");
        System.out.println("A soma entre os números "+valor1+", " +valor2+", "+valor3+", "+valor4+" e "+valor5+" é "+soma);
        System.out.println("O produto dos números "+valor1+", " +valor2+", "+valor3+", "+valor4+" e "+valor5+" é "+produto);
        System.out.println("A média entre os números "+valor1+", " +valor2+", "+valor3+", "+valor4+" e "+valor5+" é "+media);
    } 
}