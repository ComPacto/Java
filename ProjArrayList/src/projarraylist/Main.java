package projarraylist;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Revenda objRevenda = new Revenda();
        byte op;

        JOptionPane.showMessageDialog(null, "                                                      Revenda de Carros\n"
                + "Seja bem vindo ao assistente de revenda de carros! Aperte 'OK' para continuar", "Sistema", JOptionPane.DEFAULT_OPTION);

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog("Informe um número conforma a legenda abaixo: \n"
                    + "1 - Cadastrar carro\n"
                    + "2 - Mostrar todos os carros\n"
                    + "3 - Mostrar quantidade de carros\n"
                    + "4 - Calcular o valor total de carros no pátio\n"
                    + "5 - Excluir todos os carros\n"
                    + "0 - Encerrar o sistema"));
            switch (op) {
                case 1:
                    Carro objCarro = new Carro();
                    if (objRevenda.getCnpj() == 0 || objRevenda.getNome() == null) {
                        objRevenda.setNome(JOptionPane.showInputDialog("Informe o nome da empresa: "));
                        objRevenda.setCnpj(Long.parseLong(JOptionPane.showInputDialog("Informe o CNPJ da empresa: ")));
                        JOptionPane.showMessageDialog(null, "Agora informe os dados do carro que você quer cadastrar, clique 'OK' para continuar.", "CADASTRO CARRO", JOptionPane.INFORMATION_MESSAGE);
                        objCarro.setMarca(JOptionPane.showInputDialog("Informe a marca do carro: "));
                        objCarro.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro: ")));
                        objCarro.setPlaca(JOptionPane.showInputDialog("Informe a placa do carro: "));
                        objCarro.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro: ")));
                        objRevenda.adicionarCarro(objCarro);
                        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!", "CADASTRO CARRO", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Informe os dados do carro que você quer cadastrar, clique 'OK' para continuar.", "CADASTRO CARRO", JOptionPane.INFORMATION_MESSAGE);
                        objCarro.setMarca(JOptionPane.showInputDialog("Informe a marca do carro: "));
                        objCarro.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro: ")));
                        objCarro.setPlaca(JOptionPane.showInputDialog("Informe a placa do carro: "));
                        objCarro.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro: ")));
                        objRevenda.adicionarCarro(objCarro);
                        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!", "CADASTRO CARRO", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 2:
                    if (objRevenda.getCnpj() == 0) {
                        JOptionPane.showMessageDialog(null, "O sistema não achou nenhum carro cadastrado, sinto muito!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lista de carros: " + objRevenda.toString());
                    }
                    break;
                case 3:
                    if (objRevenda.obterQuantidadeDeCarros() == 0) {
                        JOptionPane.showMessageDialog(null, "A empresa não possui nenhum carro cadastrado no momento.");
                    } else {
                        JOptionPane.showMessageDialog(null, "A empresa possui " + objRevenda.obterQuantidadeDeCarros() + " de carros atualmente para revenda.");
                    }
                    break;
                case 4:
                    if (objRevenda.calcularValor() == 0) {
                        JOptionPane.showMessageDialog(null, "O sistema não achou nenhum carro cadastrado para retornar algum valor, sinto muito!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O total do valor dos carros no pátio é: R$ " + objRevenda.calcularValor());
                    }
                    break;
                case 5:
                    if (objRevenda.obterQuantidadeDeCarros() == 0) {
                        JOptionPane.showMessageDialog(null, "A empresa não possui nenhum carro cadastrado no momento para ser excluído.");
                    } else {
                        do {
                            op = Byte.parseByte(JOptionPane.showInputDialog("Tem certeza de que deseja apagar tudo?\n"
                                    + "1 - Sim\n"
                                    + "2 - Não"));
                            switch (op) {
                                case 1:
                                    objRevenda.apagarTudo();
                                    JOptionPane.showMessageDialog(null, "Todos os carros foram excluídos com sucesso!", "EXCLUIR CARROS", JOptionPane.INFORMATION_MESSAGE);
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
        } while (op != 0);
    }

}
