package projaluno;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Aluno objAluno = new Aluno();
        byte op;
        
        JOptionPane.showMessageDialog(null, "                                    Q.I. - Escolas e Faculdades\n"
                + "Seja bem vindo ao cadastro de alunos! Aperte 'OK' para continuar", "Sistema", JOptionPane.DEFAULT_OPTION);
        
        do {
            op = Byte.parseByte(JOptionPane.showInputDialog("Informe um número conforme a legenda abaixo\n"
                    + "1 - Cadastrar aluno\n"
                    + "2 - Mostrar dados do aluno\n"
                    + "3 - Mostrar média do aluno\n"
                    + "0 - Encerrar o sistema"));
            switch(op){
                case 1:
                    JOptionPane.showConfirmDialog(null, "Cadastro dos alunos, deseja continuar?");
                    
                    objAluno.setNome(JOptionPane.showInputDialog("Informe o nome do aluno: "));
                    objAluno.setRa(Long.parseLong(JOptionPane.showInputDialog("Informe o RA do aluno: ")));
                    
                    JOptionPane.showMessageDialog(null, "Agora informe as notas do aluno");
                    
                    objAluno.getObjAvaliacao1().setDescricao(JOptionPane.showInputDialog(null,"Informe se a N1 foi 'trabalho' ou 'prova'"));
                    objAluno.getObjAvaliacao1().setNota(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a N1 do aluno: ")));
                    objAluno.getObjAvaliacao2().setDescricao(JOptionPane.showInputDialog(null,"Informe se a N1 foi 'trabalho' ou 'prova'"));
                    objAluno.getObjAvaliacao2().setNota(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a N2 do aluno: ")));
                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"DADOS DO ALUNO: " +objAluno);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Média do aluno: " +objAluno.calcularMedia());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado, até mais!", "SISTEMA ENCERRADO", JOptionPane.WHEN_IN_FOCUSED_WINDOW);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número digitado inválido\n"
                            + "       Digite novamente", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }while(op != 0);
    }
    
}
