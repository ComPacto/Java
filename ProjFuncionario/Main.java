import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        String nomeFuncionario;
        int ganhaVT;
        double valorPassagem;
        double valorHora;
        double totalTrabalhadas;
        double salarioBruto;
        double beneficio = 0;
        double desconto = 0;
        double salarioLiquido;
        byte opcao;
        byte opcao2;
        double inss;
        
        System.out.println("Informe os dados abaixo");
        System.out.println("O nome do funcionário");
        nomeFuncionario = leia.next();
        System.out.println("Valor total da passagem");
        valorPassagem = leia.nextDouble();
        System.out.println("Valor por hora");
        valorHora = leia.nextDouble();
        System.out.println("Total de horas trabalhadas");
        totalTrabalhadas = leia.nextDouble();
        
        salarioBruto = valorHora*totalTrabalhadas+valorPassagem;
        
        do{
            System.out.println("O funcionário ganha vale transporte?\n"
                                +"1 - Sim\n"
                                +"2 - Não");
                                
            System.out.print("Escolha uma das opções acima");
            ganhaVT = leia.nextInt();
            
            switch(ganhaVT){
                case 1:
                desconto = 0.06*salarioBruto;
                break;
                case 2:
                desconto = 0;
                break;
                default:
                System.out.print("Número digitado inválido\n"
                                    +"Digite o número novamente");
            }
        }while(ganhaVT<1 || ganhaVT>2);
        
        if(desconto>valorPassagem){
            valorPassagem = valorPassagem;
        }else{
            valorPassagem = 0.06*salarioBruto;
        }
        
        do{
            System.out.println("Escolha uma opção abaixo\n"
                                +"1 - 10% Mínimo\n"
                                +"2 - 20% Médio\n"
                                +"3 - 40% Máximo\n"
                                +"0 - Não recebe");
            System.out.print("Escolha a opção desejada");
            opcao = leia.nextByte();
            
            switch(opcao){
                case 1:
                beneficio = 1103.66*0.1;
                break;
                case 2:
                beneficio = 1103.66*0.2;
                break;
                case 3:
                beneficio = 1103.66*0.4;
                break;
                case 0:
                beneficio = 0;
                default:
                System.out.print("Número digitado inválido\n"
                                    +"Digite o número novamente");
            }
        }while(opcao>3);
        
        if(salarioBruto<1659.38){
            inss = salarioBruto*0.08;
        }else if(salarioBruto>1659.39 || salarioBruto<2765.66){
            inss = salarioBruto*0.09;
        }else{
            inss = salarioBruto*0.11;
        }
        
        salarioLiquido = salarioBruto + beneficio - inss - desconto;
        
        do{
            System.out.println("Escolha uma das opções abaixo\n"
                                +"1 - Mostrar todos os dados do funcionário\n"
                                +"2 - Ver descontos\n"
                                +"3 - Ver benefícios\n"
                                +"4 - Ver salário líquido\n"
                                +"0 - Sair");
                                
            System.out.print("Digite um dos números acima");
            opcao2 = leia.nextByte();
            
            System.out.print("\u000C");
            
            switch(opcao2){
                case 1:
                System.out.println("Seu nome é "+nomeFuncionario+" sua passagem custa "+valorPassagem+" vocês ganha "+valorHora+" Reais por hora e você trabalhou no total "+totalTrabalhadas+" horas");
                break;
                case 2:
                System.out.println("Seu desconto é R$ "+desconto);
                break;
                case 3:
                System.out.println("Seu benefício é R$ "+beneficio);
                break;
                case 4:
                System.out.println("Seu salário liquído é R$ "+salarioLiquido);
                case 0:
                System.out.println("Sistema fechado");
                break;
                default:
                System.out.println("Número digitado inválido\n"
                                    +"Digite novamente o número");
            }
        }while(opcao2>4);
    }   
}