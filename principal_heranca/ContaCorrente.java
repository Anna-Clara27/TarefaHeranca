/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.principal_heranca;

/**
 *
 * @author Anna
 */
public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente titular, String numero, String agencia, String banco) {
        super(titular, numero, agencia, banco);
    }

    public void sacar(double valor) {
    if (valor <= getSaldo()) {
        setSaldo(getSaldo() - valor);
    } else {
        System.out.println("Saldo insuficiente!");
    }
  }
}

    
