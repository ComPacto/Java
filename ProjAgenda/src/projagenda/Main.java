package projagenda;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Agenda objAgenda = new Agenda();
        byte op;
        
        JOptionPane.showMessageDialog(null, "                                         Agenda pessoal\n"
                + "Seja bem vindo a agenda pessoal! Aperte 'OK' para continuar", "AGENDA", JOptionPane.DEFAULT_OPTION);
        
        do {
            op = Byte.parseByte(JOptionPane.showInputDialog("Informe um número conforme a legenda abaixo: \n"
                    + "1 - Cadastrar contato\n"
                    + "2 - Mostrar todos os contatos\n"
                    + "3 - Mostrar quantidade de contatos\n"
                    + "4 - Pesquisar aniversariantes do mês\n"
                    + "5 - Pesquisar contato por nome\n"
                    + "6 - Alterar telefone do contato pesquisando por nome\n"
                    + "7 - Remover contato pesquisando por nome\n"
                    + "8 - Excluir todos os contatos\n"
                    + "0 - Encerrar agenda"));
            switch (op) {
                case 1:
                    Contato objContato = new Contato();
                    Data objData = new Data();
                    objContato.setNome(JOptionPane.showInputDialog("Informe o nome do contato: "));
                    objContato.setFone(JOptionPane.showInputDialog("Informe o telefone do contato: "));
                    JOptionPane.showMessageDialog(null, "Agora informe os dados de nascimento do contato, clique 'OK' para continuar.", "CADASTRO NASCIMENTO", JOptionPane.INFORMATION_MESSAGE);
                    objData.setDia(Byte.parseByte(JOptionPane.showInputDialog("Informe o dia em que o contato nasceu: ")));
                    objData.setMes(Byte.parseByte(JOptionPane.showInputDialog("Informe o mês em que o contato nasceu: ")));
                    objData.setAno(Byte.parseByte(JOptionPane.showInputDialog("Informe o ano em que o contato nasceu: ")));
                    objAgenda.getListaDeContatos().add(objContato);
                    JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso!", "CADASTRO CONTATO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Contatos: \n" +objAgenda.toString());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Quantidade de contatos cadastrados na agenda: " +objAgenda.getListaDeContatos().size());
                    break;
                case 4:

                    break;
                case 5:
                                     
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado, até mais!", "SISTEMA ENCERRADO", JOptionPane.WHEN_IN_FOCUSED_WINDOW);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número digitado inválido\n"
                            + "       Digite novamente", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } while (op != 0);
    }

}
