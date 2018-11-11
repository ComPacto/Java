import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        Carro objCarro1 = new Carro();
        Carro objCarro2 = new Carro();
        
        System.out.print("Informe os dados do carro 1\n"
                         +"Modelo: ");
        objCarro1.modelo = leia.next();
        
        System.out.print("Marca: ");
        objCarro1.marca = leia.next();
        
        System.out.print("Ano: ");
        objCarro1.ano = leia.nextInt();
        
        System.out.print("Número de série: ");
        objCarro1.numeroSerie = leia.next();
        
        System.out.print("Placa: ");
        objCarro1.placa = leia.next();
        
        System.out.print("\u000C");
        
        System.out.print("\nInforme os dados do carro 2\n"
                         +"Modelo: ");
        objCarro2.modelo = leia.next();
        
        System.out.print("Marca: ");
        objCarro2.marca = leia.next();
        
        System.out.print("Ano: ");
        objCarro2.ano = leia.nextInt();
        
        System.out.print("Número de série: ");
        objCarro2.numeroSerie = leia.next();
        
        System.out.print("Placa: ");
        objCarro2.placa = leia.next();
        
        System.out.print("\u000C");
        
        System.out.println("DADOS DO 1º CARRO");
        System.out.println("O modelo o carro é: "+objCarro1.modelo+"\n"
                            +"Marca: "+objCarro1.marca+"\n"
                            +"Ano: "+objCarro1.ano+"\n"
                            +"Número de série: "+objCarro1.numeroSerie+"\n"
                            +"Placa: "+objCarro1.placa+"\n");
        System.out.println("DADOS DO 2º CARRO");
        System.out.println("O modelo o carro é: "+objCarro2.modelo+"\n"
                            +"Marca: "+objCarro2.marca+"\n"
                            +"Ano: "+objCarro2.ano+"\n"
                            +"Número de série: "+objCarro2.numeroSerie+"\n"
                            +"Placa: "+objCarro2.placa+"\n");
    }
}