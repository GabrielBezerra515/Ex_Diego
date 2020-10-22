package com.mycompany.exadvinhador;

import java.util.Scanner;

public class TesteAdivinhador {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Advinhador advinhador = new Advinhador();
        
        System.out.println("Informe um número de 0 a 50: ");
        Integer number = in.nextInt();
        
        advinhador.advinhar(number);
        
    }
}
