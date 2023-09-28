package DesafioEquilibrandoSaldo;

import java.util.Scanner;

public class EquilibrandoOSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo atualizado na conta: ");
        double saldoAtual = scanner.nextDouble();
        System.out.print("Digite o valor para deposito: ");
        double valorDeposito = scanner.nextDouble();
        System.out.print("Digite o valor para saque: ");
        double valorRetirada = scanner.nextDouble();

        double novoSaldo = saldoAtual + valorDeposito - valorRetirada;
        novoSaldo = Math.round(novoSaldo * 10) / 10.0;

        System.out.print("Saldo atualizado na conta: " + novoSaldo);

    }
}
