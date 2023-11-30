package com.peddrobatista.utils;

public class CurrencyConverter {
    public static double moeda;
    public static double valor;

    public static double IOF = 0.06;

    public static double convertendo() {
        return moeda * valor * (1.0 + IOF);
    }
}
