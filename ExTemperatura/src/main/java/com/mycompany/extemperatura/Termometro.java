package com.mycompany.extemperatura;

import java.util.concurrent.ThreadLocalRandom;

public class Termometro {
    
    private Integer temperaturaAtual = 0;
    private Integer temperaturaMaxResgistrada = 0;
    private Integer temperaturaMinRegistrada = 0;

    public Termometro() {
        this.temperaturaAtual = ThreadLocalRandom.current().nextInt(0, 51);
        this.temperaturaMaxResgistrada = this.temperaturaAtual;
        this.temperaturaMinRegistrada = this.temperaturaAtual; 
    }
    
    public Integer aumentaTemperatura(Integer aumentar){
        this.temperaturaAtual += aumentar;
        if (this.temperaturaAtual > this.temperaturaMaxResgistrada) {
            this.temperaturaMaxResgistrada = this.temperaturaAtual;
        }
        return this.temperaturaAtual;
    }
    
    public Integer diminuiTemperatura(Integer diminui){
        this.temperaturaAtual -= diminui;
        if (this.temperaturaAtual < this.temperaturaMinRegistrada) {
            this.temperaturaMinRegistrada = this.temperaturaAtual;
        }
        
        return this.temperaturaAtual;
    }
    
    public Double converterParaFahreinheit(){
        Double conversao = (this.temperaturaAtual * 1.8) + 32;
        return conversao;
    }

    public Integer getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(Integer temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public Integer getTemperaturaMaxResgistrada() {
        return temperaturaMaxResgistrada;
    }

    public Integer setTemperaturaMaxResgistrada(Integer temperaturaMaxResgistrada) {
        return this.temperaturaMaxResgistrada = temperaturaMaxResgistrada;
    }

    public Integer getTemperaturaMinRegistrada() {
        return temperaturaMinRegistrada;
    }

    public void setTemperaturaMinRegistrada(Integer temperaturaMinRegistrada) {
        this.temperaturaMinRegistrada = temperaturaMinRegistrada;
    }
}
