/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.principal_heranca;

/**
 *
 * @author Anna
 */
public class PessoaJuridica extends Cliente{
    
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
       super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
  }
     public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
 }
}
     
   