/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.principal_heranca;

/**
 *
 * @author Anna
 */
public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente titular, String numero, String agencia, String banco) {
        super(titular, numero, agencia, banco);  
    }

    public void sacar(double valor) {
    if (valor <= getSaldo()) {
        setSaldo(getSaldo() - valor);
   } else {
            System.out.println("Saldo insuficiente!");
      }
    }

    public void aplicarRendimento() {
       double novoSaldo = getSaldo() * 1.005;
        setSaldo(novoSaldo);
  }
}