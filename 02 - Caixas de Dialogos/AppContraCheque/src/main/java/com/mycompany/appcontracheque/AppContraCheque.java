/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appcontracheque;

import javax.swing.JOptionPane;

/**
 *
 * @author scorpion777
 */
public class AppContraCheque {

    public static void main(String[] args) {
        
        String e;
        float taxaFilho = 58;
        float salarioMinimo = 1320;
        float valeAlimentacao = 350;
        
        e = JOptionPane.showInputDialog("Informe o quantitativo de salário mínimo: ");
        float qtdSalarioMinimo = Float.parseFloat(e);
                
        e = JOptionPane.showInputDialog("Informe o total de filhos: ");
        int totalFilhos = Integer.parseInt(e);
        
        float salarioBase = (qtdSalarioMinimo * salarioMinimo) + (totalFilhos * taxaFilho);

        float descontoImpostoRenda =  0.075f * salarioBase;
        float descontoPrevSocial =  0.06f * salarioBase;
        float totalDesconto = descontoImpostoRenda + descontoPrevSocial;
        
        float salarioBruto = salarioBase + valeAlimentacao;
        float salarioLiquido = salarioBruto - totalDesconto;
        
        JOptionPane.showMessageDialog(null, 
                "Salário bruto: " + String.format("%.2f", salarioBruto) +
                "\nDesconto imposto de renda: " + String.format("%.2f", descontoImpostoRenda) +
                "\nDesconto previdencia social: " + String.format("%.2f", descontoPrevSocial) +
                "\nTotal desconto: " + String.format("%.2f", totalDesconto) +
                "\nSalário Líquido: " + String.format("%.2f", salarioLiquido)
                );
    }
}
