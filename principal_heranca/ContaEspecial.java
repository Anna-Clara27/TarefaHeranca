/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.principal_heranca;

/**
 *
 * @author Anna
 */
public class ContaEspecial extends Conta{
    
    private double limite;
    
    public ContaEspecial(Cliente titular, double limite, String numero, String agencia, String banco) {
        super(titular, numero, agencia, banco);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
   
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void sacar(double valor) {
    if (valor <= getSaldo()) {
        setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Limite do cheque especial excedido!");
    }
  }
}   
