import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        
        String nome;
        double totalEmPassagens = 0;
        double valorHora;
        double cargaHoraria;
        byte op;
        double salarioBruto;
        double valorVT = 0;
        double insalubridade = 0;
        double valorINSS = 608.44;
        double salarioLiquido;
        
        System.out.print("Informe os dados do funcionário\n"
                         +"Nome: ");
        nome = leia.next();
        
        System.out.print("Valor hora: ");
        valorHora = leia.nextDouble();
        
        System.out.print("Carga horária: ");
        cargaHoraria = leia.nextDouble();
        
        salarioBruto = valorHora*cargaHoraria;
        
        System.out.print("\u000C");
        
        do{
            System.out.print("Escolha a opção de VT conforme os números abaixo:\n"
                             +"1 - Sim, ganha VT\n"
                             +"2 - Não, não ganha VT\n"
                             +"Digite aqui a opção desejada: ");
            op = leia.nextByte();
            
            System.out.print("\u000C");
            
            switch(op){
                case 1:
                    System.out.print("Informe valor pago em passagens: ");
                    totalEmPassagens = leia.nextDouble();
                    valorVT = salarioBruto*0.06;
                    if(valorVT>totalEmPassagens){
                        valorVT = totalEmPassagens;
                    }
                    break;
                case 2:
                    valorVT = 0;
                    break;
                default:
                    System.err.println("Opção inválida\n"
                                        +"Digite novamente");                             
            }
        }while(op<1 || op>2);
        
        System.out.print("\u000C");
        
        do{
            System.out.print(":::::::::::Opção de insalubridade:::::::::::\n"
                             +"Escolha uma opção abaixo\n"
                             +"1 – Mínimo\n"
                             +"2 – Médio\n"
                             +"3 – Máximo\n"
                             +"0 – Não recebe\n"
                             +"Digite aqui a opção desejada: ");
            op = leia.nextByte();
            
            System.out.print("\u000C");
            
            switch(op){
                    case 1:
                        insalubridade = 0.1;
                        break;
                    case 2:
                        insalubridade = 0.2;
                        break;
                    case 3:
                        insalubridade = 0.4;
                        break;
                    case 0:
                        insalubridade = 0;
                        break;
                    default:
                        System.err.println("Opção inválida\n"
                                           +"Digite novamente"); 
                }
            insalubridade = insalubridade*1103.66;
        }while(op<0 || op>3);
        
        if(salarioBruto<=1659.38){
            valorINSS = salarioBruto*0.08;
        }else if(salarioBruto<=2765.66){
            valorINSS = salarioBruto*0.09;
        }else if(salarioBruto<=5531.31){
            valorINSS = salarioBruto*0.11;
        }
        
        salarioLiquido = salarioBruto + insalubridade-valorVT-valorINSS;
        
        System.out.print("\u000C");
        
        do{
            System.out.print(":::::::::::Informações do funcionário:::::::::::\n"
                               +"Escolha uma opção abaixo:\n"
                               +"1-Mostrar todos os dados do funcionário\n"
                               +"2-Ver descontos\n"
                               +"3-Ver benefícios\n"
                               +"4-Ver Salário Líquido\n"
                               +"0-Sair\n"
                               +"Digite aqui a opção desejada: ");
            op = leia.nextByte();
            
            System.out.print("\u000C");
            
            switch(op){
                case 1:
                    System.out.println("Dados do funcionário"
                                       +"Nome: "+nome+"\n"
                                       +"Valor pago em passagens: "+totalEmPassagens+"\n"
                                       +"Valor ganhado por hora: "+valorHora+"\n"
                                       +"Carga horária: "+cargaHoraria+"\n"
                                       +"Salário bruto: "+salarioBruto+"\n"
                                       +"Valor do VT: "+valorVT+"\n"
                                       +"INSS: "+valorINSS+"\n"
                                       +"Salário líquido: "+salarioLiquido);
                    break;
                case 2:
                    System.out.println("Descontos\n"
                                       +"Valor VT: "+valorVT+"\n"
                                       +"INSS: "+valorINSS); 
                    break;
                case 3:
                    System.out.println("Benefícios\n"
                                       +"Insalubridade: "+insalubridade); 
                    break;
                case 4:
                    System.out.println("O salário liquído é: "+salarioLiquido); 
                    break;
                case 0:
                    System.out.println("Sistema encerrado, até mais tarde!"); 
                    break;
                default:
                    System.err.println("Opção escolhida inválida\n"
                                       +"Digite o número conforme o menu novamente"); 
            }
        }while(op!=0);
    }
}