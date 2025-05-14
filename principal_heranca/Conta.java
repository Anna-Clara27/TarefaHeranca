/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.principal_heranca;

/**
 *
 * @author Anna
 */
public abstract class Conta {
    
    private Cliente titular;
    private String numero;
    private String agencia;
    private String banco;
    private double saldo;

    public Conta(Cliente titular, String numero, String agencia, String banco) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = 0;
    }
    
    public Cliente getCliente() {
        return titular;
  }
    
    public String getNumero() {
       return numero;
  }
    
    public String getAgencia() {
       return agencia;
  }
    
    public String getBanco() {
        return banco;
  }
    
    public double getSaldo() {
        return saldo;
  }

    public void setNumero(String numero) {
        this.numero = numero;
  }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
  }

   public void setBanco(String banco) {
       this.banco = banco;
  }
   
   public void setSaldo(double saldo){
       this.saldo = saldo;
   }
  
    public abstract void sacar(double valor);
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
         } else {
        System.out.println("Deposito nao realizado!");
    }
  }
    
    public void transferir(double valor, Conta contaDestino) {
       if(valor > 0 && saldo >= valor){
            saldo -= valor;
            contaDestino.saldo += valor;
     } else {
        System.out.println("Transferencia nao realizada!");
    }
  }   
}
    

