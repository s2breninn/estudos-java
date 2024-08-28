/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import javax.swing.JOptionPane;

/**
 *
 * @author Breno Mendes Bernardo
 */
public class Medicamento {
    private int idade;
    private float peso;
    private float altura;
    private int genero;
    
    public Medicamento(){
    }
    
    private float getimc(){
        return this.peso / (this.altura*this.altura);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0)
            this.idade = idade;
        else
            JOptionPane.showMessageDialog(null, "Informe uma idade igual ou maior que zero");
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso > 0)
            this.peso = peso;
        else
           JOptionPane.showMessageDialog(null, "Informe um peso maior que zero");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura > 0)
            this.altura = altura;
        else
            JOptionPane.showMessageDialog(null, "Informe uma altura maior que zero");
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        if (genero == 0)
        this.genero = 0; //feminino
        
        else if (genero == 1)
            this.genero = 1; //masculino  
    }
    
    public float getPG(){
        float imc = this.getimc();
        return (1.2f * imc) + (0.23f * this.getIdade()) - (10.8f * this.getGenero()) - 5.4f;   
    }
    
    public int getGotas(){
        if (idade >= 12 && peso <60.0f)
            return (875*15)/380;
        else if (idade >=12 && peso >= 60.0f)
            return (100*15)/380;
        else if (idade < 12 && peso > 30)
            return (750*15)/380;
        else if (idade < 12 && peso >24)
            return (500*15)/380;
        else if (idade < 12 && peso >16)
            return (375*15)/380;
        else if (idade < 12 && peso >9)
            return (250*15)/380;
        else
            return (125*15)/380;

    }
    
    public String getSitCorporea(){
        float imc = this.getimc();
    
        if (imc > 40)
            return "Obeso mórbido";
        else if (imc > 30)
            return "Obeso";
        else if (imc > 25)
            return "Sobrepeso";
        else if (imc > 20)
            return "Peso normal";
        else
            return "Abaixo do peso";
    }
    
    public float getPesoideal(){
        float altura = this.getAltura();
        
        if (this.getGenero() == 0)
            return (altura * 58.3f) - 41.2f;
        else
            return (altura * 76.7f) - 61.2f;
    }
}
