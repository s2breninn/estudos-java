/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Aluno
 */
public class Eleicao {
    private int Candidato1;
    private int Candidato2;
    private int Candidato3;
    private int Candidato4;
    private int Nulos;
    private int Brancos;
    
    public Eleicao() {
        this.Candidato1 = 0;
        this.Candidato2 = 0;
        this.Candidato3 = 0;
        this.Candidato4 = 0;
        this.Nulos = 0;
        this.Brancos = 0;
    } 
    
    public int getTotalVotos() {
        return this.Candidato1 + this.Candidato2 + this.Candidato3 + this.Candidato4 + this.Nulos + this.Brancos;
    }
    
    public void setCandidato1() {
        this.Candidato1++;
    }
    
    public int getCandidato1Total() {
        return this.Candidato1;
    }
    
    public float getCandidato1Porcentagem() {
        return this.Candidato1 / this.getTotalVotos()* 100.0f;
    }
    
    public void setCandidato2() {
        this.Candidato2++;
    }
    
    public int getCandidato2Total() {
        return this.Candidato2;
    }
    
}
