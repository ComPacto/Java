import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        Aluno objAluno = new Aluno();
        
        System.out.println(":::::CADASTRO DO ALUNO:::::\n");
        System.out.print("Informe os dados do aluno\n"
                         +"Nome: ");
        objAluno.nome = leia.next();
        
        System.out.print("RA: ");
        objAluno.ra = leia.nextLong();
        
        System.out.print("Nota 1: ");
        objAluno.nota1 = leia.nextDouble();
        
        System.out.print("Nota 2: ");
        objAluno.nota2 = leia.nextDouble();
        
        System.out.print("\u000C");
        
        System.out.println(":::::DADOS DO ALUNO CASTRADO:::::\n");
        System.out.println("O nome do aluno é: "+objAluno.nome+"\n"
                            +"RA: "+objAluno.ra+"\n"
                            +"Nota 1: "+objAluno.nota1+"\n"
                            +"Nota 2: "+objAluno.nota2+"\n"
                            +"Nota final: "+objAluno.calcularMedia());
    }
}