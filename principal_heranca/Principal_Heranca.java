/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.principal_heranca;

/**
 *
 * @author Anna
 */
//A atividade consiste em a partir da classe Conta, criada anteriormente e apresentado em outras aulas, criar classes usando os conceitos de Herança. 
//Cada classe herdará de uma superclasse, Conta, que terá todas as informações e comportamentos comuns das classes envolvidas. Cada uma das classes deve 
//ser criada com os seguintes nomes e com as seguintes restrições:
//● ContaCorrente - O saldo nunca pode ser negativo.
//● ContaEspecial - A conta possui um valor de cheque especial e o saldo da conta pode ser negativo até o valor do cheque especial.
//○ Exemplo: Saldo=$1000 e Cheque especial=$2000, o cliente pode manipular o valor de $3000 reais. Ao sacar $3000 o valor do saldo deverá ser -$2000. 
//(nunca ultrapassando o valor do cheque especial)
//● ContaPoupança - O saldo da conta corrente rende 0,5% a cada um determinado período. No caso do exercício sempre que o método rendimento for executado.
//● ContaEmpresarial - Conta Especial porém destinada a cliente pessoa jurídica.
//Toda conta deve possuir um cliente vinculado. Nenhuma classe Conta deve ter os dados do cliente expressos diretamente na classe. Os dados do cliente 
//devem estar em uma classe específica, Cliente, e deve vinculado um objeto Cliente com todas informações do cliente na classe Conta.
//● Deve ser criados dois tipos de cliente: Pessoa Física e Pessoa Jurídica, sendo que o primeiro terá cpf e o segundo cnpj. A criação de Pessoa Física e 
//Pessoa Jurídica devem ser feitas usando os conceitos de herança.
//● ContaCorrente, Conta Poupança e Conta Especial é destinado a pessoas físicas
//● ContaEmpresarial é destinado exclusivamente a pessoas jurídicas. 

public class Principal_Heranca {

    public static void main(String[] args) {
        
        
        Cliente pessoafisica = new PessoaFisica("Anna", "Rua X", "064-9945464", "123.456.789-00");
        Cliente pessoajuridica = new PessoaJuridica("Empresa XYZ", "Rua Y", "064-9987654", "12.345.678/0001-99");

        
        Conta contacorrente = new ContaCorrente(pessoafisica, "12345-6", "Agencia A", "Banco do Brasil");
        Conta contaespecial = new ContaEspecial(pessoafisica, 2000, "67890-1", "Agencia B", "Caixa");
        Conta contapoupanca = new ContaPoupanca(pessoafisica, "11223-4", "Agencia C", "Itau");

        ContaEmpresarial contaempresarial = new ContaEmpresarial(pessoajuridica, 5000, "55667-8", "Agencia D", "Bradesco");

    
        System.out.println("Conta Corrente:");
        contacorrente.depositar(1000);
        contacorrente.sacar(500);  
        contacorrente.sacar(600);  
        System.out.println("Saldo Conta Corrente: " + contacorrente.getSaldo());

        System.out.println("\nConta Especial:");
        contaespecial.depositar(1000);
        contaespecial.sacar(3000);
        contaespecial.sacar(100);   
        System.out.println("Saldo Conta Especial: " + contaespecial.getSaldo());

        System.out.println("\nConta Poupanca:");
        contapoupanca.depositar(2000);
        ((ContaPoupanca) contapoupanca).aplicarRendimento();
        System.out.println("Saldo Conta Poupanca (com rendimento): " + contapoupanca.getSaldo());

       
        System.out.println("\nConta Empresarial:");
        contaempresarial.depositar(1000);
        contaempresarial.sacar(6000);  
        contaempresarial.sacar(1);     
        System.out.println("Saldo Conta Empresarial: " + contaempresarial.getSaldo());
    }
}