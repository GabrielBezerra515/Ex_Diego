package com.mycompany.exentradadecinema;

import java.util.Scanner;

public class TesteEntrada {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Scanner scannerNome = new Scanner(System.in);
        
        System.out.print("Informe o ano do filme: ");
        Integer ano = in.nextInt();
        
        System.out.print("Informe a hora do filme: ");
        Integer hora = in.nextInt();
        
        System.out.print("Informe a sala do filme: ");
        Integer sala = in.nextInt();
        
        System.out.print("Informe o Valor do ingresso do filme: ");
        Double valor = in.nextDouble();
        
        System.out.print("Informe o nome do cliente: ");
        String nome = scannerNome.nextLine();
        
        EntradaDeCinema cine = new EntradaDeCinema(ano, hora, sala, valor, nome);
        
        System.out.println("Informe se é estudante ou não: ");
        Boolean estudante = in.hasNext();
        
        cine.calculaDesconto(sala, estudante);
        
        cine.calculaDescontoHorario();
        
        System.out.println(nome + ", o valor do seu ingresso é: " + cine.getValor());
    }
}
