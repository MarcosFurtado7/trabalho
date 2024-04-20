package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class Mavenproject1 {

    public static void main(String[] args) {
         
        //Entrada de dados        
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor:")) ;
        int vetor[] = new int[tamanho];
              
        String input;
        for (int i = 0; i < tamanho; i++) {
            input = JOptionPane.showInputDialog("Informe o elemento " + (i + 1) + " do vetor:");
            vetor[i] = Integer.parseInt(input);
        }
        
        //Menu de opções
         String[] options = {"Ordenação por Inserção", "Ordenação por Seleção", "Ordenação Bolha"};
        int opcao = JOptionPane.showOptionDialog(null, "Escolha o método de ordenação:", "Método de Ordenação",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
        
       
        switch (opcao) {
            case 0:
                ordenação_inserção(vetor);
                break;
            case 1:
                ordenação_seleção(vetor);
                break;
            case 2:
                ordenação_bolha(vetor);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
        
         //Exibição dos resultados
         JOptionPane.showMessageDialog(null,"\nVetor ordenado:\n" + arrayToString(vetor));
    }
    //Implementação dos algoritmos de ordenação:
    public static void ordenação_inserção(int[] arr){

        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            
            int chave = arr[i];
            
            int j = i - 1;

            while (j >= 0 && arr[j] > chave) {
                
                arr[j + 1] = arr[j];
                
                j = j - 1;
            }
            
            arr[j + 1] = chave;
        
        }
    }
    
    public static void ordenação_seleção(int[] arr){

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            
            int min_idx = i;
            
            for (int j = i+1; j < n; j++) {
                
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            
            int tempo = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = tempo;
        }        
    }
    public static void ordenação_bolha(int[] arr){

        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
            
            for (int j = 0; j < n-i-1; j++) {
                
                if (arr[j] > arr[j+1]) {
                   
                    int tempo = arr[j];
                    
                    arr[j] = arr[j+1];
                    
                    arr[j+1] = tempo;
                }
            }
        }
    }
    //Exibição dos resultados
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

}