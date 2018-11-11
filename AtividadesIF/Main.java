import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        double a;
        double b;
        double c;
        double angulo;
        double angulo2;
        double angulo3;
        String resposta;
        String classificacaoTriangulo;
        String classificacaoAngulo;
        
        System.out.println("Informe a medida dos lados e dos ângulos de um triângulo abaixo:");
        System.out.print("1º lado: ");
        a = leia.nextDouble();
        System.out.print("2º lado: ");
        b = leia.nextDouble();
        System.out.print("3º lado: ");
        c = leia.nextDouble();
        System.out.print("1º ângulo: ");
        angulo = leia.nextDouble();
        System.out.print("2º ângulo: ");
        angulo2 = leia.nextDouble();
        System.out.print("3º ângulo: ");
        angulo3 = leia.nextDouble();
        
        if((a<b+c) && (b<a+c) && (c<a+b) && (angulo+angulo2+angulo3>=180) && (angulo>0&&angulo2>0&&angulo3>0)){
            resposta = "válido";
        }else{
            resposta = "inválido";
        }
        
        if((a==b) && (a==c) && (b==c)){
            classificacaoTriangulo = "equilátero";
        }else if((a==b&&b!=c) || (a==c&&c!=b ) || (b==c&&c!=a)){
            classificacaoTriangulo = "isósceles";
        }else{
            classificacaoTriangulo = "escaleno";
        }
        
        if(angulo>90 || angulo2>90 || angulo3>90){
            classificacaoAngulo = "obtusângulo";
        }else if(angulo<90 && angulo2<90 && angulo3<90){
            classificacaoAngulo = "acutângulo";
        }else{
            classificacaoAngulo = "retângulo";
        }
        
        System.out.print("\u000C");
        
        System.out.println("...RESULTADO...");
        System.out.println("Seu triângulo é "+resposta);
        System.out.println("Seu triângulo é "+classificacaoTriangulo);
        System.out.println("A classificação do ângulo do seu triângulo é: "+classificacaoAngulo);
    }
}