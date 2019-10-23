/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author Senai
 */
public class Atendente extends Pessoa {
    
    public Atendente(String nome, String cpf, int cod) {
        super(nome, cpf, cod);
    }
    
    private int numerodeligacoes;

    public Atendente(int numerodeligacoes, String nome, String cpf, int cod) {
        super(nome, cpf, cod);
        this.numerodeligacoes = numerodeligacoes;
    }

    public int getNumerodeligacoes() {
        return numerodeligacoes;
    }

    public void setNumerodeligacoes(int numerodeligacoes) {
        this.numerodeligacoes = numerodeligacoes;
    }
}
