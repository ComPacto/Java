import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int numero;
        String resposta;
        
        System.out.println("Informe um número");
        numero = leia.nextInt();
                
        if(numero>=0){
            resposta = "Positivo"; 
        }else{
            resposta = "Negativo";
        }
        System.out.println("O número "+numero+" é "+resposta);
    }
}