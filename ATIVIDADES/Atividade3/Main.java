import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o preço por litro do combustível que você usa: ");
        double precoPorLitro = leia.nextDouble();
        System.out.println("Quantidade de KM por litro do seu carro: ");
        double kmPorLitro = leia.nextDouble();
        System.out.println("Que distância você quer percorrer? ");
        double distanciaPercorrer = leia.nextDouble();
        double litrosNecessarios;
        double gastos;
        
        System.out.print("\u000C");
        
        litrosNecessarios = kmPorLitro*distanciaPercorrer;
        gastos = litrosNecessarios*precoPorLitro;
        
        System.out.println("...RESULTADOS...");
        System.out.println("Você gastara "+litrosNecessarios+"L de gasôlina para percorrer a distância desejada");
        System.out.println("Você gastara "+gastos+"R$ para percorrer a distância desejada");
    }    
}