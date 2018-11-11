import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);        
        String nome;
        String signo;
        String validarSigno;
        int diaNasc;
        int mesNasc;
        int anoNasc;
        int diaAtual;
        int mesAtual;
        int anoAtual;
        int idade;
        
        System.out.println("Informe seus dados de nascimento abaixo");
        System.out.print("Qual é o seu nome: ");
        nome = leia.next();
        System.out.print("Dia em que você nasceu: ");
        diaNasc = leia.nextInt();
        System.out.print("Mês em que você nasceu: ");
        mesNasc = leia.nextInt();
        System.out.print("Ano em que você nasceu: ");
        anoNasc = leia.nextInt();
        System.out.println("Informe o ano atual abaixo");
        System.out.print("Informe o dia atual: ");
        diaAtual = leia.nextInt();
        System.out.print("informe o mês atual: ");
        mesAtual = leia.nextInt();
        System.out.print("Informe o ano atual: ");
        anoAtual = leia.nextInt();
        
        if(mesAtual<mesNasc||mesNasc==mesAtual&&diaAtual<diaNasc){
            idade = anoAtual-anoNasc-1;
        }else if(mesAtual==mesNasc&&diaAtual==diaNasc){
            idade = anoAtual-anoNasc;
        }else{
            idade = anoAtual-anoNasc;
        }
        
        if(mesNasc==2&&(anoNasc%4==0&&(anoNasc%100!=0||anoNasc%400==0))&&diaNasc<=29||diaNasc<=28){
            validarSigno = "válido";
        }else{
            validarSigno = "inválido";
        }
        
        if(diaNasc>=20&&mesNasc==3&&diaNasc<=31||diaNasc>=1&&diaNasc<=20&&mesNasc==4){
            signo = "Áries";
        }else if(diaNasc>=21&&mesNasc==4&&diaNasc<=30||diaNasc>=1&&diaNasc<=20&&mesNasc==5){
            signo = "Touro";
        }else if(diaNasc>=21&&mesNasc==5&&diaNasc<=31||diaNasc>=1&&diaNasc<=20&&mesNasc==6){
            signo = "Gêmeos";
        }else if(diaNasc>=21&&mesNasc==6&&diaNasc<=30||diaNasc>=1&&diaNasc<=21&&mesNasc==7){
            signo = "Câncer";
        }else if(diaNasc>=22&&mesNasc==7&&diaNasc<=31||diaNasc>=1&&diaNasc<=22&&mesNasc==8){
            signo = "Leão";
        }else if(diaNasc>=23&&mesNasc==8&&diaNasc<=31||diaNasc>=1&&diaNasc<=22&&mesNasc==9){
            signo = "Virgem";
        }else if(diaNasc>=23&&mesNasc==9&&diaNasc<=30||diaNasc>=1&&diaNasc<=22&&mesNasc==10){
            signo = "Libra";
        }else if(diaNasc>=23&&mesNasc==10&&diaNasc<=31||diaNasc>=1&&diaNasc<=21&&mesNasc==11){
            signo = "Escorpião";
        }else if(diaNasc>=22&&mesNasc==11&&diaNasc<=30||diaNasc>=1&&diaNasc<=21&&mesNasc==12){
            signo = "Sagitário";
        }else if(diaNasc>=22&&mesNasc==12&&diaNasc<=31||diaNasc>=1&&diaNasc<=20&&mesNasc==1){
            signo = "Capricórnio";
        }else if(diaNasc>=21&&mesNasc==1&&diaNasc<=31||diaNasc>=1&&diaNasc<=18&&mesNasc==2){
            signo = "Aquário";
        }else{
            signo = "Peixes";
        }
        
        System.out.print("\u000C");
        
        System.out.println("...DADOS...");
        System.out.println("A sua idade é: "+idade);
        System.out.println("Seu signo é: "+signo);
    }
}