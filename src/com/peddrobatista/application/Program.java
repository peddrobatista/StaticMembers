package com.peddrobatista.application;

import com.peddrobatista.utils.Calculator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double radius = teclado.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.println("Circumference: " + c);
        System.out.println("Volume: " + v);
        System.out.println("PI, value: " + Calculator.PI);

        teclado.close();
    }

}
