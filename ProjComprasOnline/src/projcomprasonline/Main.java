package projcomprasonline;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Biblioteca objBiblioteca = new Biblioteca();
        byte op;

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog("Informe um número conforme a legenda abaixo: \n"
                    + "1 - Cadastrar livro\n"
                    + "2 - Mostrar todos os livros\n"
                    + "3 - Mostrar quantidade de livros\n"
                    + "4 - Esvaziar carrinho\n"
                    + "0 - Encerrar sistema"));
            switch (op) {
                case 1:
                    Livro objLivro = new Livro();
                    if (objBiblioteca.getCnpj() == 0 || objBiblioteca.getNome() == null) {
                        objBiblioteca.setNome(JOptionPane.showInputDialog("Informe o nome da empresa: "));
                        objBiblioteca.setCnpj(Long.parseLong(JOptionPane.showInputDialog("Informe o CNPJ da empresa: ")));
                        JOptionPane.showMessageDialog(null, "Agora informe os dados do livro que você quer cadastrar, clique 'OK' para continuar.", "CADASTRO CARRO", JOptionPane.INFORMATION_MESSAGE);
                        objLivro.setAutor(JOptionPane.showInputDialog("Informe o nome do autor do livro: "));
                        Object[] itemGenero = {"Ficção", "Românce", "Biografia", "Educacional", "Terror"};
                        objLivro.setGenero((String) JOptionPane.showInputDialog(null, "Escolha o gênero", "Menu gênero", JOptionPane.QUESTION_MESSAGE, null, itemGenero, itemGenero[0]));
                        objLivro.setTitulo(JOptionPane.showInputDialog("Informe o título do livro: "));
                        objLivro.setValorUnitario(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do livro: ")));
                        objBiblioteca.getListaDeLivros().add(objLivro);
                        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!", "CADASTRO LIVRO", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Informe os dados do livro que você quer cadastrar, clique 'OK' para continuar.", "CADASTRO LIVRO", JOptionPane.INFORMATION_MESSAGE);
                        objLivro.setAutor(JOptionPane.showInputDialog("Informe o nome do autor do livro: "));
                        Object[] itemGenero = {"Ficção", "Românce", "Biografia", "Educacional", "Terror"};
                        objLivro.setGenero((String) JOptionPane.showInputDialog(null, "Escolha o gênero", "Menu gênero", JOptionPane.QUESTION_MESSAGE, null, itemGenero, itemGenero[0]));
                        objLivro.setTitulo(JOptionPane.showInputDialog("Informe o título do livro: "));
                        objLivro.setValorUnitario(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do livro: ")));
                        objBiblioteca.getListaDeLivros().add(objLivro);
                        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!", "CADASTRO LIVRO", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 2:
                    if (objBiblioteca.getListaDeLivros().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "O sistema não achou nenhum livro cadastrado, sinto muito!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Livros cadastrados: \n" + objBiblioteca.toString());
                    }
                    break;
                case 3:
                    if (objBiblioteca.getListaDeLivros().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "A empresa não possui nenhum livro cadastrado no momento.");
                    } else {
                        JOptionPane.showMessageDialog(null, "A empresa possui " + objBiblioteca.getListaDeLivros().size() + " de livros atualmente para venda.");
                    }
                    break;
                case 4:
                    if (objBiblioteca.getListaDeLivros().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Você não possui nenhum livro no carrinho para ser retirado.");
                    } else {
                        do {
                            op = Byte.parseByte(JOptionPane.showInputDialog("Tem certeza de que deseja esvaziar o carrinho?\n"
                                    + "1 - Sim\n"
                                    + "2 - Não"));
                            switch (op) {
                                case 1:
                                    objBiblioteca.getListaDeLivros().clear();
                                    JOptionPane.showMessageDialog(null, "O carrinho foi esvaziado com sucesso!", "ESVAZIAR CARRINHO", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                case 2:

                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Número digitado inválido\n"
                                            + "       Digite novamente", "ERRO", JOptionPane.ERROR_MESSAGE);
                            }
                        } while (op < 1 || op > 2);
                    }
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
        
