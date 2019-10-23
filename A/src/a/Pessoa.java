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
public class Pessoa {
    
    private String nome;
    private String cpf;
    private int cod;

    public Pessoa(String nome, String cpf, int cod) {
        this.nome = nome;
        this.cpf = cpf;
        this.cod = cod;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
    
    
    
}
