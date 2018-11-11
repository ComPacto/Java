


import javax.swing.JOptionPane;
public class Main{
        public static void main(String [] args){
            int valor1;
            int valor2;
            int soma;
            int diferenca;
            int multiplicacao;
            double divisao;
            int resto;
            double potencia;
            double raiz;
 
            valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qual é o primeiro valor?"));
            valor2 = Integer.parseInt(JOptionPane.showInputDialog("Qual é o segundo valor?"));
        
            soma = valor1+valor2;
            diferenca = valor1-valor2;
            multiplicacao = valor1*valor2;
            divisao = valor1/valor2;
            resto = valor1%valor2;
            potencia = Math.pow(valor1,valor2);
            raiz = Math.pow(valor1,(1/valor2));
        
            System.out.println("::::VALORES::::");
            System.out.println("Primeiro valor: "+valor1);
            System.out.println("Segundo Valor: "+valor2);
            System.out.println("Soma: "+soma);
            System.out.println("Diferença: "+diferenca);
            System.out.println("Multiplicação: "+multiplicacao);
            System.out.println("Divisão: "+divisao);
            System.out.println("Resto: "+resto);
            System.out.println("Potência: "+potencia);
            System.out.println("Raiz: "+raiz);       
    }    
}