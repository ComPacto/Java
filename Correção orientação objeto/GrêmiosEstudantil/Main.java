import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner leia = new Scanner(System.in);
        int chapa1 = 0;
        int chapa2 = 0;
        int chapa3 = 0;
        int eleitores = 100;
        byte op;
        String resultado = "";
        
        do{
            System.out.print(":::::VOTO RESTANTES ELEITORES "+eleitores+" ::::::\n"
                              +":: Digite 1 para votar na chapa 1 ::\n"
                              +":: Digite 2 para votar na chapa 2 ::\n"
                              +":: Digite 3 para votar na chapa 3 ::\n"
                              +"::::::::::::::::::::::::::::::::::::\n"
                              +"Votar: ");
            op = leia.nextByte();
            
            System.out.print("\u000C");
            
            switch(op){
                case 1:
                    chapa1++;
                    break;
                case 2:
                    chapa2++;
                    break;
                case 3:
                    chapa3++;
                    break;
                default:
                    System.err.println("Número digitado inválido\n"
                                       +"Digite um número conforme o menu novamente");
                    eleitores++;
            }
            eleitores--;
        }while(eleitores!=0 && chapa1<=50 && chapa2<=50 && chapa3<=50);
        
        if(chapa1>chapa2&&chapa1>chapa3){
            resultado = "chapa 1";
        }else if(chapa2>chapa1 && chapa2>chapa3){
            resultado = "chapa 2";
        }else if(chapa3>chapa1 && chapa3>chapa2){
            resultado = "chapa 3";
        }else{
            System.out.println("Segundo turno das eleições do grêmio 2017");
            if(chapa1==chapa2){
                do{
                    System.out.print("\u000C");
                    
                    System.out.print(":::::::::SEGUNDO TURNO ELEIÇÕES 2017:::::::::::::\n"
                              +":: Digite 1 para votar na chapa 1 ::\n"
                              +":: Digite 2 para votar na chapa 2 ::\n"
                              +"::::::::::::::::::::::::::::::::::::\n"
                              +"Votar: ");
                    op = leia.nextByte();
                      
                    switch(op){
                          case 1:
                            chapa1++;
                            resultado = "Chapa 1";
                            break;
                          case 2:
                            chapa2++;
                            resultado = "Chapa 2";
                            break;
                          default:
                            System.err.println("Número digitado inválido\n"
                                               +"Digite um número conforme o menu novamente");
                    }               
                }while(op<1 || op>2);
            }else if(chapa1==chapa3){
                do{
                    System.out.print("\u000C");
                    
                    System.out.print(":::::::::SEGUNDO TURNO ELEIÇÕES 2017:::::::::::::\n"
                              +":: Digite 1 para votar na chapa 1 ::\n"
                              +":: Digite 3 para votar na chapa 3 ::\n"
                              +"::::::::::::::::::::::::::::::::::::\n"
                              +"Votar: ");
                    op = leia.nextByte();
                      
                    switch(op){
                          case 1:
                            chapa1++;
                            resultado = "Chapa 1";
                            break;
                          case 3:
                            chapa3++;
                            resultado = "Chapa 3";
                            break;
                          default:
                            System.err.println("Número digitado inválido\n"
                                               +"Digite um número conforme o menu novamente");
                    }               
                }while(op!=1 && op!=3);
            }else{
                do{
                    System.out.print("\u000C");
                    
                    System.out.print(":::::::::SEGUNDO TURNO ELEIÇÕES 2017:::::::::::::\n"
                              +":: Digite 2 para votar na chapa 2 ::\n"
                              +":: Digite 3 para votar na chapa 3 ::\n"
                              +"::::::::::::::::::::::::::::::::::::\n"
                              +"Votar: ");
                    op = leia.nextByte();
                      
                    switch(op){
                          case 2:
                            chapa1++;
                            resultado = "Chapa 2";
                            break;
                          case 3:
                            chapa3++;
                            resultado = "Chapa 3";
                            break;
                          default:
                            System.err.println("Número digitado inválido\n"
                                               +"Digite um número conforme o menu novamente");
                    }               
                }while(op!=2 && op!=3);
            }
        }
        
        System.out.print("\u000C");
        
        System.out.println("\n\nResultado da eleição\n"
                           +"Votos da chapa 1: "+chapa1+"\n"
                           +"Votos da chapa 2: "+chapa2+"\n"
                           +"Votos da chapan 3: "+chapa3+"\n"
                           +"A chapa vencedora é: "+resultado);
    }
}