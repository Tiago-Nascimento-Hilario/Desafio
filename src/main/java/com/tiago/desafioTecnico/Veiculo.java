package com.tiago.desafioTecnico;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Veiculo {
    
    @Id
    private String placa;
    private String carro;
    private String cor;
    private String dataDeFabricacao;


    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCarro() {
        return carro;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }
    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    

}
