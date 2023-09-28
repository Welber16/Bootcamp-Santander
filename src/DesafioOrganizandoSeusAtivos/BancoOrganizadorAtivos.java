package DesafioOrganizandoSeusAtivos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList < String > ativos = new ArrayList < > ();



        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine();

        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivos = scanner.nextLine();
            ativos.add(codigoAtivos);
        }

        //TODO: Ordenar os ativos em ordem alfabética.

        Collections.sort(ativos);

        //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        for (String ativo : ativos) {
            System.out.println(ativo);
        }
    }
}