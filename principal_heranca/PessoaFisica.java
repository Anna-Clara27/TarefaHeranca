/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.principal_heranca;

/**
 *
 * @author Anna
 */
public class PessoaFisica extends Cliente{
    
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
       super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
  }
    public void setCpf(String cpf) {
        this.cpf = cpf;
 }
}