import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        Cao objCao1 = new Cao();
        Cao objCao2 = new Cao();
        
        System.out.println(":::::CADASTRO DOS CÃES:::::\n");
        System.out.print("Informe os dados do 1º cão\n"
                         +"Nome: ");
        objCao1.nome = leia.next();
        
        System.out.print("Raça: ");
        objCao1.raca = leia.next();
        
        System.out.print("Cor: ");
        objCao1.cor = leia.next();
        
        System.out.print("Porte: ");
        objCao1.porte = leia.next();
        
        System.out.print("Idade: ");
        objCao1.idade = leia.nextByte();
        
        System.out.print("\u000C");
        
        System.out.print("Informe os dados do 2º cão\n"
                         +"Nome: ");
        objCao2.nome = leia.next();
        
        System.out.print("Raça: ");
        objCao2.raca = leia.next();
        
        System.out.print("Cor: ");
        objCao2.cor = leia.next();
        
        System.out.print("Porte: ");
        objCao2.porte = leia.next();
        
        System.out.print("Idade: ");
        objCao2.idade = leia.nextByte();
        
        System.out.print("\u000C");
        
        System.out.println(":::::::DADOS DOS CÃES CADASTRADOS:::::::\n");
        System.out.println("O nome do 1º cão é: "+objCao1.nome+"\n"
                            +"Raça: "+objCao1.raca+"\n"
                            +"Cor: "+objCao1.cor+"\n"
                            +"Porte: "+objCao1.porte+"\n"
                            +"Idade: "+objCao1.idade+"\n");
        
        System.out.println("O nome do 2º cão é: "+objCao2.nome+"\n"
                            +"Raça: "+objCao2.raca+"\n"
                            +"Cor: "+objCao2.cor+"\n"
                            +"Porte: "+objCao2.porte+"\n"
                            +"Idade: "+objCao2.idade);
    }
}