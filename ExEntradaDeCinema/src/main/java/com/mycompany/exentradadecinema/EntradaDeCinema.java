package com.mycompany.exentradadecinema;
public class EntradaDeCinema {
    private  Integer ano;
    private Integer hora;
    private Integer sala;
    private Double valor;
    private String nome;

    public EntradaDeCinema(Integer ano, Integer hora, Integer sala, Double valor, String nome) {
        this.ano = ano;
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
        this.nome = nome;
    }
    
    
    
    public Double calculaDesconto(Integer idade, Boolean estudante){
        if (idade < 12) {
            this.valor -= this.valor * 0.5;
            return this.valor;
        }
        else if ((idade > 12 && idade <= 15) && estudante){
            this.valor -= this.valor * 0.4;
            return this.valor;
        }
        else if ((idade > 15 && idade <= 20) && estudante){
            this.valor -= this.valor * 0.3;
            return this.valor;
        }
        else if (idade > 20 && estudante){
            this.valor -= this.valor * 0.2;
            return this.valor;
        }
        else{
            return this.valor;
        }
    }
    
    public Double calculaDescontoHorario(){
        if (this.hora < 16) {
            return this.valor -= this.valor * 0.1;
        }
        else {
            return this.valor;
        }
    }

    public Integer getAno() {
        return ano;
    }

    public Integer getHora() {
        return hora;
    }

    public Integer getSala() {
        return sala;
    }

    public Double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }    
}
