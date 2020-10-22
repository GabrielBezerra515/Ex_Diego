package com.mycompany.exadvinhador;

import java.util.concurrent.ThreadLocalRandom;

public class Advinhador {
    private Integer tentativas = 0;
    
    public void advinhar(Integer number){
        if (number >= 0 && number <= 50) {
            while (true) {                
                Integer sorteio =  ThreadLocalRandom.current().nextInt(0, 51);
                
                if (sorteio.equals(number)) {
                    System.out.println("O número " + number + " foi sorteado após " + tentativas);
                    break;
                }
                else{
                    System.out.println("Número do sorteio: " + sorteio);
                    System.out.println("Tentativa: " + this.tentativas);
                    tentativas += 1;
                }
            }
        }
    }
}
