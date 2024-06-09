package com.mycompany.trabalhodois;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroCliente {
    private ArrayList<Cliente> listaClientes;

    
    public CadastroCliente() {
        listaClientes = new ArrayList<>();
    }

    
    public void adicionarCliente(int codigo, String nome, String dataNascimento, String telefone) {
        Cliente cliente = new Cliente(codigo, nome, dataNascimento, telefone);
        listaClientes.add(cliente);
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
    }

    
    public void excluirCliente(int codigo) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCodigo() == codigo) {
                listaClientes.remove(cliente);
                JOptionPane.showMessageDialog(null, "Cliente excluído:\n" + cliente.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
    }

    
    public void alterarCliente(int codigo, String nome, String dataNascimento, String telefone) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCodigo() == codigo) {
                cliente.setNome(nome);
                cliente.setDataNascimento(dataNascimento);
                cliente.setTelefone(telefone);
                JOptionPane.showMessageDialog(null, "Dados do cliente atualizados com sucesso!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
    }

    
    public void exibirCliente(int codigo) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCodigo() == codigo) {
                JOptionPane.showMessageDialog(null, cliente.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
    }

    
    public void exibirTodosClientes() {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : listaClientes) {
            sb.append(cliente.toString()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }    
}
