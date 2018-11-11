import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int segundos;
        int qtdHoras;
        int qtdMinutos;
        int qtdSegundos;
        
        System.out.println("Complete os dados abaixo");
        System.out.print("Informe quantos segundos deseja: ");
        segundos = leia.nextInt();
        
        qtdHoras = segundos/3600;
        qtdMinutos = segundos%3600/60;;
        qtdSegundos = segundos%60;
        
        System.out.print("\u000C");
        
        System.out.println("...RESULTADO...");
        System.out.println("Quantidade de horas: "+qtdHoras);
        System.out.println("Quantidade de minutos: "+qtdMinutos);
        System.out.println("Quantidade de segundos: "+qtdSegundos);
    }
}