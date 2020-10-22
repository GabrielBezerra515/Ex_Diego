package com.mycompany.exdata;

public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public void inicializaData(Integer dia, Integer mes, Integer ano) {

        if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Erro de Sintaxe");
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        }
    }
    
    public String exibeData(){
        String exibir = String.format("%d/%d/%d", this.dia, this.mes, this.ano);
        return exibir;
    }
    
    public String comparaData(Integer dia, Integer mes, Integer ano){
        if (this.dia.equals(dia) && this.mes.equals(mes) && this.ano.equals(ano)){
            return "Data Iguais";
        }
        else {
            return "Datas Diferentes";
        }
    }
}
