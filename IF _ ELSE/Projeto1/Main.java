import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual é seu nome?");
        String funcionario = leia.next();
        System.out.println("Qual é o seu CPF?");
        String cpf = leia.next();
        System.out.println("Qual é seu RG?");
        String rg = leia.next();
        System.out.println("Que cargo você ocupa?");
        String cargo = leia.next();
        System.out.println("Qual é seu sexo?");
        String sexo = leia.next();
        System.out.println("Sua família é composta por quantos membros?");
        int quantidadeDependentes = leia.nextInt();
        System.out.println("Quantos filhos você tem?");
        int quantidadeFilhos = leia.nextInt();
        System.out.println("A quantos anos você trabalha?");
        int tempoServicoAno = leia.nextInt();
        System.out.println("Quanto você ganha por hora?");
        double valorHoraMes = leia.nextDouble();
        System.out.println("Quantas horas vocẽ trabalha por mês?");
        double quantidadeHorasTrabalhadasMensal = leia.nextDouble();
        double salarioBruto;
        double valorValeTransporte;
        double inss;
        double salarioFamilia;
        double planoSaude;
        double planoCarreira;
        double salarioLiquido;
        
        System.out.print("\u000C");
        
        salarioBruto = valorHoraMes*quantidadeHorasTrabalhadasMensal;
        valorValeTransporte = salarioBruto*0.06;
        inss = salarioBruto*0.11;
        salarioFamilia = quantidadeFilhos*0.03*salarioBruto;
        planoSaude = (0.05+(0.01*quantidadeDependentes))*salarioBruto;
        planoCarreira = tempoServicoAno/3*0.05*salarioBruto;
        salarioLiquido = salarioBruto-valorValeTransporte-inss+salarioFamilia-planoSaude+planoCarreira;
        
        System.out.println("...SEUS DADOS...");
        System.out.println("Seu nome é: "+funcionario);
        System.out.println("Seu CPF é: "+cpf);
        System.out.println("Seu RG é: "+rg);
        System.out.println("Seu cargo é: "+cargo);
        System.out.println("Seu sexo é: "+sexo);
        System.out.println("Vocẽ possui é: "+quantidadeDependentes+" dependentes");
        System.out.println("Você possui: "+quantidadeFilhos+" filhos");
        System.out.println("Vocẽ trabalha a: "+tempoServicoAno+" anos");
        System.out.println("Você ganha por hora: "+valorHoraMes+"R$");
        System.out.println("Seu salário bruto é: "+salarioBruto+"R$");
        System.out.println("O valor do vale transporte é: "+valorValeTransporte+"R$");
        System.out.println("O valor do INSS é: "+inss+"R$");
        System.out.println("O valor do salário família é: "+salarioFamilia+"R$");
        System.out.println("O valor do plano de saúde é: "+planoSaude+"R$");
        System.out.println("Você ganha "+planoCarreira+"R$ no plano de carreira");
        System.out.println("Seu salário líquido é: "+salarioLiquido+"R$");
    }
}