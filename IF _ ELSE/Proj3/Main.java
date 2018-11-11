import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int numero;
        String resposta;
        
        System.out.print("Digite um número inteiro: ");
        numero = leia.nextInt();
        
        if(numero==0){
            resposta = "Nulo";
        }else if(numero%2==0){
            resposta = "Par";
        }else{
            resposta = "Impar";
        }
        System.out.println("O número "+numero+" é "+resposta);
    }
}