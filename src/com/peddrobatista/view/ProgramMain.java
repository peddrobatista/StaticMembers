package com.peddrobatista.view;

import com.peddrobatista.utils.CurrencyConverter;

import java.util.Scanner;

public class ProgramMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o preço do dollar? ");
        CurrencyConverter.moeda = teclado.nextDouble();
        System.out.println("Quantos doláres você quer comprar? ");
        CurrencyConverter.valor = teclado.nextDouble();
        System.out.println("Valor a ser pago em reais: R$ " + CurrencyConverter.convertendo());

        teclado.close();
    }
}
