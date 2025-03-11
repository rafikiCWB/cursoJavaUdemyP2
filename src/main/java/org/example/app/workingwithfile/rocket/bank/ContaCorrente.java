package org.example.app.workingwithfile.rocket.bank;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {

  Integer numeroConta;
  Integer numeroAgencia;
  String nomeCliente;
  LocalDate dataNascimento;
  Double saldoConta = (double) 1200000;
  boolean ativo = true;

  public ContaCorrente(Integer numeroConta, Integer numeroAgencia, String nomeCliente, LocalDate dataNascimento) {
    this.numeroConta = numeroConta;
    this.numeroAgencia = numeroAgencia;
    this.nomeCliente = nomeCliente;
    this.dataNascimento = dataNascimento;
  }

  public ContaCorrente() {
    this.numeroConta = 123456;
    this.numeroAgencia = 1234;
    this.nomeCliente = "Rafael";
    this.dataNascimento = LocalDate.of(1990, 1, 1);
  }

  @Override
  public String toString() {
    return "ContaCorrente [numeroConta=" + numeroConta + ", numeroAgencia=" + numeroAgencia + ", nomeCliente="
        + nomeCliente + ", dataNascimento=" + dataNascimento + ", saldoConta=" + saldoConta + ", ativo=" + ativo + "]";
  }

  public static final NumberFormat nf = NumberFormat.getCurrencyInstance();

  void sacarValorDaConta(double valor) {
    // o que é sacarValorDaConta? é verificar se o valor a ser sacado é igual ou
    // menor o valor da conta
    // então fazer o saldoConta - valor;
    if (saldoConta >= valor) {
      saldoConta -= valor;
      System.out.println("Valor Sacado com sucesso!" + nf.format(valor));
      System.out.println("Saldo atual: " + nf.format(saldoConta));
    } else {
      System.out.println("Saldo insuficiente!");
    }
  }

  void transferir(ContaCorrente contaDestino, Double valorTransferir) {
    // Verifica se a conta de destino não é a mesma que a conta de origem
    if (this.numeroConta.equals(contaDestino.numeroConta)) {
      System.out.println("Não é possível transferir para a mesma conta.");
      return;
    }

    // Verifica se o saldo é suficiente para a transferência
    if (this.saldoConta < valorTransferir) {
      System.out.println("Saldo insuficiente para a transferência.");
      return;
    }

    // Realiza a transferência
    this.saldoConta -= valorTransferir;
    contaDestino.saldoConta += valorTransferir;

    System.out.println("Transferência realizada com sucesso.");
  }

  void cancelarConta(String justificativa) {
    // algoritimo irá manipular o atributo, ativo para que se torne false
    ativo = false;
  }

  public List<LocalDate> consultarExtrato(LocalDate dataInicial, LocalDate dataFinal) {
    // algoritimo irá retornar uma lista de datas que estão entre dataInicial e
    // dataFinal
    return List.of(dataInicial, dataFinal);

  }

  void consultarOsaldoAtual() {
    // R$ 1.200.000,00
    System.out.println("Seu saldo atual é: " + nf.format(saldoConta));
  }

  public static void main(String[] args) {
    var cc = new ContaCorrente();
    System.out.println(cc);
    cc.consultarOsaldoAtual();

    cc.transferir(new ContaCorrente(1, 2, "Fulano", LocalDate.of(1990, 1, 1)), 1000.0);

    cc.cancelarConta("Não gostei do atendimento");

    cc.sacarValorDaConta(1000000);

    var extrato = cc.consultarExtrato(LocalDate.now(), LocalDate.now().plusDays(10));
    System.out.println(extrato);

    System.out.println(new ContaCorrente());

  }
}