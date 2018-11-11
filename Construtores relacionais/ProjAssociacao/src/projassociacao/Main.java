package projassociacao;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Funcionario objFuncionario = new Funcionario();
        Cliente objCliente = new Cliente();
        byte op;
        
        JOptionPane.showMessageDialog(null, "                                                                Empresa X\n"
                + "Seja bem vindo ao cadastro de clientes e funcionários! Aperte 'OK' para continuar", "Sistema", JOptionPane.DEFAULT_OPTION);
        
        do {
            op = Byte.parseByte(JOptionPane.showInputDialog("Informe um número conforme a legenda abaixo\n"
                    + "1 - Cadastrar cliente\n"
                    + "2 - Cadastrar funcionário\n"
                    + "3 - Consultar dados do cliente\n"
                    + "4 - Consultar dados do funcionário\n"
                    + "0 - Encerrar o sistema"));
            switch(op){
                case 1:
                    JOptionPane.showConfirmDialog(null, "Cadastro dos clientes, deseja continuar?");
                    
                    objCliente.setNome(JOptionPane.showInputDialog(null, "Informe o nome do cliente: ", "CADASTRO CLIENTE", JOptionPane.QUESTION_MESSAGE));
                    objCliente.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "Informe o CPF do cliente: ", "CADASTRO CLIENTE", JOptionPane.QUESTION_MESSAGE)));
                    
                    JOptionPane.showMessageDialog(null, "Agora informe o endereço do cliente");
                    
                    objCliente.getObjEndereco().setRua(JOptionPane.showInputDialog(null, "Informe a rua do cliente: ", "CADASTRO CLIENTE", JOptionPane.QUESTION_MESSAGE));
                    objCliente.getObjEndereco().setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da casa do cliente: ", "CADASTRO CLIENTE", JOptionPane.QUESTION_MESSAGE)));
                    objCliente.getObjEndereco().setComplemento(JOptionPane.showInputDialog(null, "Informe o complemento do cliente: ", "CADASTRO CLIENTE", JOptionPane.QUESTION_MESSAGE));
                    objCliente.getObjEndereco().setBairro(JOptionPane.showInputDialog(null, "Informe o bairro do cliente:", "CADASTRO CLIENTE", JOptionPane.QUESTION_MESSAGE));
                    objCliente.getObjEndereco().setCep(JOptionPane.showInputDialog(null, "Informe o CEP do cliente: ", "CADASTRO CLIENTE", JOptionPane.QUESTION_MESSAGE));
                    objCliente.getObjEndereco().setFone(JOptionPane.showInputDialog(null, "Informe o telefone do cliente: ", "CADASTRO CLIENTE", JOptionPane.QUESTION_MESSAGE));
                    objCliente.getObjEndereco().setCidade(JOptionPane.showInputDialog(null, "Informe a cidade do funcionário: ", "CADASTRO CLIENTE", JOptionPane.QUESTION_MESSAGE));
                    objCliente.getObjEndereco().setUf(JOptionPane.showInputDialog(null, "Informe o UF (estado) do cliente: ", "CADASTRO CLIENTE", JOptionPane.QUESTION_MESSAGE));
                    break;
                case 2:
                    JOptionPane.showConfirmDialog(null, "Cadastro dos funcionários, deseja continuar?");
                    
                    objFuncionario.setNome(JOptionPane.showInputDialog(null, "Informe o nome do funcionário: ", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE));
                    objFuncionario.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "Informe o CPF do funcionário: ", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE)));
                    objFuncionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário do funcionário: ", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE)));
                    
                    JOptionPane.showMessageDialog(null, "Agora informe o endereço do funcionário");
                    
                    objFuncionario.getObjEndereco().setRua(JOptionPane.showInputDialog(null, "Informe a rua do funcionário: ", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE));
                    objFuncionario.getObjEndereco().setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da casa do funcionário: ", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE)));
                    objFuncionario.getObjEndereco().setComplemento(JOptionPane.showInputDialog(null, "Informe o complemento do funcionário: ", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE));
                    objFuncionario.getObjEndereco().setBairro(JOptionPane.showInputDialog(null, "Informe o bairro do funcionário:", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE));
                    objFuncionario.getObjEndereco().setCep(JOptionPane.showInputDialog(null, "Informe o CEP do funcionário: ", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE));
                    objFuncionario.getObjEndereco().setFone(JOptionPane.showInputDialog(null, "Informe o telefone do funcionário: ", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE));
                    objFuncionario.getObjEndereco().setCidade(JOptionPane.showInputDialog(null, "Informe a cidade do funcionário: ", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE));
                    objFuncionario.getObjEndereco().setUf(JOptionPane.showInputDialog(null, "Informe o UF (estado) do funcionário: ", "CADASTRO FUNCIONÁRIO", JOptionPane.QUESTION_MESSAGE));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Dados do cliente: " +objCliente.toString());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Dados do funcionário:" +objFuncionario.toString());
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
