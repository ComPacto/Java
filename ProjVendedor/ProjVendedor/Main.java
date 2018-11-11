import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia=new Scanner(System.in);
        
        String vendedor;
        double meta;
        double vendido;
        double comissao;
        
        System.out.print("Insira o nome do vendedor: ");
        vendedor=leia.next();
        System.out.print("Insira a quantidade vendida: ");
        vendido=leia.nextDouble();
        System.out.println("Insira a meta: ");
        meta=leia.nextDouble();
        
        if(vendido<meta*0.50){
            comissao=vendido*0.01;
        }else if(vendido>=meta*0.50&&vendido<=vendido*0.75){
            comissao=vendido*0.025;
        }else if(vendido>=meta*0.751&&vendido<=1.00){
            comissao=vendido*0.035;
        }else{
            comissao=vendido*0.05;
        }
        
        System.out.print("\u000c");
        System.out.println("§§§§§§§§§§§§§§§§§ Dados do vendedor §§§§§§§§§§§§§§");
        System.out.println("Nome: "+vendedor);
        System.out.println("Meta: "+meta);
        System.out.println("Comissao: "+comissao);
    }
}