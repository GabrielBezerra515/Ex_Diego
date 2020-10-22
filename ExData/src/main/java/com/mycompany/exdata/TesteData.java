package com.mycompany.exdata;

import java.util.Scanner;

public class TesteData {
    public static void main(String[] args) {
        
        Data data = new Data();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Dia: ");
        Integer dia = in.nextInt();
       
        System.out.print("Mês: ");
        Integer mes = in.nextInt();
      
        System.out.print("Ano: ");
        Integer ano = in.nextInt();
        
        data.inicializaData(dia, mes, ano);
        
        System.out.println(data.comparaData(21, 2, 2002));
        
        
        
        
        
    }
}
