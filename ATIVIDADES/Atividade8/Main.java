import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantos KG vocẽ tem?");
        int kg = leia.nextInt();
        int porcentagem = 15;
        int porcentagem2 = 20;
        int engordou;
        int emagreceu;
        
        System.out.println("\u000C");
        
        porcentagem = (kg*porcentagem)/100;
        porcentagem2 = (kg*porcentagem2)/100;
        engordou = kg+porcentagem;
        emagreceu = kg-porcentagem2;
        
        System.out.println("...RESULTADO...");
        System.out.println("Se você engordar 15% você ficará com: "+engordou);
        System.out.println("Se vocẽ emagrecer 20% vocẽ ficará com: "+emagreceu);
    }
}