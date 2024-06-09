package com.mycompany.trabalhodois;

import javax.swing.JOptionPane;

public class Trabalhodois {

    public static void main(String[] args) {
        CadastroCliente cadastro = new CadastroCliente();

        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                    "1. Adicionar Cliente\n" +
                    "2. Excluir Cliente\n" +
                    "3. Alterar Cliente\n" +
                    "4. Exibir Cliente\n" +
                    "5. Exibir Todos os Clientes\n" +
                    "6. Sair");

            switch (opcao) {
                case "1":
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente:"));
                    String nome = JOptionPane.showInputDialog("Informe o nome do cliente:");
                    String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do cliente:");
                    String telefone = JOptionPane.showInputDialog("Informe o telefone do cliente:");
                    cadastro.adicionarCliente(codigo, nome, dataNascimento, telefone);
                    break;
                case "2":
                    int codigoExcluir = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente a ser excluído:"));
                    cadastro.excluirCliente(codigoExcluir);
                    break;
                case "3":
                    int codigoAlterar = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente a ser alterado:"));
                    String novoNome = JOptionPane.showInputDialog("Informe o novo nome do cliente:");
                    String novaDataNascimento = JOptionPane.showInputDialog("Informe a nova data de nascimento do cliente:");
                    String novoTelefone = JOptionPane.showInputDialog("Informe o novo telefone do cliente:");
                    cadastro.alterarCliente(codigoAlterar, novoNome, novaDataNascimento, novoTelefone);
                    break;
                case "4":
                    int codigoExibir = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente a ser exibido:"));
                    cadastro.exibirCliente(codigoExibir);
                    break;
                case "5":
                    cadastro.exibirTodosClientes();
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }        
}
