import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o valor de custo de fábrica: ");
        double custoFabrica = leia.nextDouble();
        double porcentagemDistribuidor = 28.0;
        double porcentagemImpostos = 45.0;
        double custoConsumidor;
        double valorDistribuidor;
        double valorImposto;
        
        System.out.print("\u000C");
        
        valorDistribuidor = (custoFabrica * porcentagemDistribuidor)/100;
        valorImposto = (custoFabrica * porcentagemImpostos)/100;
        custoConsumidor = custoFabrica + valorDistribuidor + valorImposto;
        
        System.out.println("...CUSTOS...");
        System.out.println("O custo de fabrica é: "+custoFabrica);
        System.out.println("O custo ao consumidor é: "+custoConsumidor);
    }
}