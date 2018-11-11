import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        Cliente objCliente1 = new Cliente();
        Cliente objCliente2 = new Cliente();
        
        System.out.print("Informe os dados do 1º cliente\n"
                        +"Nome: ");
        objCliente1.nome = leia.next();
        
        System.out.print("CPF: ");
        objCliente1.cpf = leia.nextLong();
        
        System.out.print("Número telefone: ");
        objCliente1.numeroTelefone = leia.nextByte();
        
        System.out.print("Endereço: ");
        objCliente1.endereco = leia.next();
        
        System.out.print("Estado: ");
        objCliente1.estado = leia.next();
        
        System.out.print("\u000C");
        
        System.out.print("Informe os dados do 2º cliente\n"
                        +"Nome: ");
        objCliente2.nome = leia.next();
        
        System.out.print("CPF: ");
        objCliente2.cpf = leia.nextLong();
        
        System.out.print("Número telefone: ");
        objCliente2.numeroTelefone = leia.nextByte();
        
        System.out.print("Endereço: ");
        objCliente2.endereco = leia.next();
        
        System.out.print("Estado: ");
        objCliente2.estado = leia.next();
        
        System.out.print("\u000C");
        
        System.out.println("DADOS DOS USUÁRIOS");
        System.out.println("O nome do 1º cliente é: "+objCliente1.nome+"\n"
                            +"CPF: "+objCliente1.cpf+"\n"
                            +"Número do telefone: "+objCliente1.numeroTelefone+"\n"
                            +"Endereço: "+objCliente1.endereco+"\n"
                            +"Estado: "+objCliente1.estado);
                            
        System.out.println("O nome do 2º cliente é: "+objCliente2.nome+"\n"
                            +"CPF: "+objCliente2.cpf+"\n"
                            +"Número do telefone: "+objCliente2.numeroTelefone+"\n"
                            +"Endereço: "+objCliente2.endereco+"\n"
                            +"Estado: "+objCliente2.estado);
                            
    }
}