package projbiblioteca;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Funcionario objFuncionario = new Funcionario();
        Usuario objUsuario = new Usuario();
        Locacao objLocacao = new Locacao();
        
        byte op;
        
        JOptionPane.showMessageDialog(null, "                                              Biblioteca Municipal\n"
                + "Seja bem vindo ao assistente bibliotecário! Aperte 'OK' para continuar", "Sistema", JOptionPane.DEFAULT_OPTION);
        
        do {
            op = Byte.parseByte(JOptionPane.showInputDialog("Escolha uma opção conforme a legenda abaixo:\n"
                    + "1 - Locar livro\n"
                    + "2 - Cadastrar funcionário\n"
                    + "3 - Devolver livro\n"
                    + "4 - Status da locação\n"
                    + "5 - Checar dados da locação\n"
                    + "6 - Calcular multa\n"
                    + "0 - Encerrar programa"));            
            switch (op) {
                case 1:
                    JOptionPane.showConfirmDialog(null, "Locação de livros, deseja continuar?", "LOCAÇÃO DE LIVRO", JOptionPane.YES_NO_OPTION);
                    JOptionPane.showMessageDialog(null, "Informe os dados da locação a seguir");
                    objLocacao.setValorLocacao(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da locação: ")));
                    JOptionPane.showMessageDialog(null, "Informe a data da locação do livro a seguir");
                    objLocacao.getObjDataLocacao().setDia(Integer.parseInt(JOptionPane.showInputDialog("Informe o dia que o livro será locado: ")));
                    objLocacao.getObjDataLocacao().setMes(Integer.parseInt(JOptionPane.showInputDialog("Informe o mês que o livro será locado: ")));
                    objLocacao.getObjDataLocacao().setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano que o livro será locado: ")));
                    JOptionPane.showMessageDialog(null, "Informe os dados do livro a seguir");
                    objLocacao.getObjLivro().setAutor(JOptionPane.showInputDialog("Informe o nome do autor do livro: "));
                    Object[] itemGenero = {"Ficção", "Românce", "Biografia", "Educacional", "Terror"};
                    objLocacao.getObjLivro().setGenero((String) JOptionPane.showInputDialog(null, "Escolha o gênero", "Menu gênero", JOptionPane.QUESTION_MESSAGE, null, itemGenero, itemGenero[0]));
                    objLocacao.getObjLivro().setTitulo(JOptionPane.showInputDialog("Informe o título do livro: "));
                    JOptionPane.showMessageDialog(null, "Informe os dados do cliente a seguir");
                    objLocacao.getObjUsuario().setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
                    objLocacao.getObjUsuario().setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Cadastre um código para o cliente: ")));
                    objLocacao.getObjUsuario().setCpf(Long.parseLong(JOptionPane.showInputDialog("Informe o CPF do cliente: ")));
                    objLocacao.getObjUsuario().getObjEndereco().setRua(JOptionPane.showInputDialog("Informe a rua do cliente: "));
                    objLocacao.getObjUsuario().getObjEndereco().setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da casa (ou apartamento) do cliente: ")));
                    objLocacao.getObjUsuario().getObjEndereco().setBairro(JOptionPane.showInputDialog("Informe o bairro do cliente: "));
                    objLocacao.locarLivro();
                    JOptionPane.showMessageDialog(null, "Livro locado com sucesso!");
                    break;
                case 2:
                    JOptionPane.showConfirmDialog(null, "Cadastro de funcionários, deseja continuar?", "CADASTRO DE FUNCIONÁRIOS", JOptionPane.YES_NO_OPTION);
                    JOptionPane.showMessageDialog(null, "Informe os dados do funcionário a seguir");
                    objLocacao.getObjFuncionario().setNome(JOptionPane.showInputDialog("Informe o nome do funcionário: "));
                    objLocacao.getObjFuncionario().setCpf(Long.parseLong(JOptionPane.showInputDialog("Informe o CPF do funcionário: ")));
                    objLocacao.getObjFuncionario().setChapa(JOptionPane.showInputDialog("Informe a chapa do funcionário: "));
                    objLocacao.getObjFuncionario().setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário: ")));
                    objLocacao.getObjFuncionario().getObjEndereco().setRua(JOptionPane.showInputDialog("Informe a rua do funcionário: "));
                    objLocacao.getObjFuncionario().getObjEndereco().setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da casa (ou apartamento) do funcionário: ")));
                    objLocacao.getObjFuncionario().getObjEndereco().setBairro(JOptionPane.showInputDialog("Informe o bairro do funcionário: "));
                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Informe a data da devolução do livro a seguir");
                    objLocacao.getObjDataDevolucao().setDia(Integer.parseInt(JOptionPane.showInputDialog("Informe o dia em que o livro foi devolvido: ")));
                    objLocacao.getObjDataDevolucao().setMes(Integer.parseInt(JOptionPane.showInputDialog("Informe o mês em  que o livro foi devolvido: ")));
                    objLocacao.getObjDataDevolucao().setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano em que o livro foi devolvido: ")));
                    objLocacao.devolverLivro();
                    JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso!", "DEVOLUÇÃO DO LIVRO", JOptionPane.WHEN_IN_FOCUSED_WINDOW);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Status da locação: " + objLocacao.getObjLivro().mostrarStatus());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Dados da locação:\n " + objLocacao.toString());
                    break;
                case 6:
                    objLocacao.setValorMulta(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da multa: ")));
                    JOptionPane.showMessageDialog(null, "O valor da locação junto a multa é: " + objLocacao.calcularLocacao());
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
