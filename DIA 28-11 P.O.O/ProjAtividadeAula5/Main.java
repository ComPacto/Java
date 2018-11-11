import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        Funcionario objFuncionario = new Funcionario();
        
        System.out.println(":::::CADASTRO DO FUNCIONÁRIO:::::\n");
        System.out.print("Informe os dados do funcionário\n"
                         +"Nome: ");
        objFuncionario.nome = leia.next();
        
        System.out.print("Chapa: ");
        objFuncionario.chapa = leia.nextLong();
        
        System.out.print("Valor por hora: ");
        objFuncionario.valorHora = leia.nextDouble();
        
        System.out.print("Carga horária: ");
        objFuncionario.cargaHoraria = leia.nextDouble();
        
        System.out.print("\u000C");
        
        System.out.println(":::::DADOS DO FUNCIONÁRIO CASTRADO:::::\n");
        System.out.println("O nome do funcionário é: "+objFuncionario.nome+"\n"
                            +"Chapa: "+objFuncionario.chapa+"\n"
                            +"Valor ganho por hora: "+objFuncionario.valorHora+"\n"
                            +"Carga horária: "+objFuncionario.cargaHoraria+"\n"
                            +"Salário: "+objFuncionario.calcularSalario()+"\n"
                            +"Vale transporte: "+objFuncionario.calcularVT()+"\n"
                            +"Valor INSS: "+objFuncionario.calcularINSS());
    }
}