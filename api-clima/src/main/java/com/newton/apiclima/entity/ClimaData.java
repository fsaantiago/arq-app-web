package com.newton.apiclima.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clima")
public class ClimaData {


    @Id
    private int idClima;
    private float temperatura;
    private float vento;
    private String umidade;
    private int pressao;
    private String cidade;
    private String estado;
    private String pais;

    public ClimaData(int idClima, float temperatura, float vento, String umidade, int pressao, String cidade, String estado, String pais) {
        this.idClima = idClima;
        this.temperatura = temperatura;
        this.vento = vento;
        this.umidade = umidade;
        this.pressao = pressao;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getVento() {
        return vento;
    }

    public void setVento(float vento) {
        this.vento = vento;
    }

    public String getUmidade() {
        return umidade;
    }

    public void setUmidade(String umidade) {
        this.umidade = umidade;
    }

    public int getPressao() {
        return pressao;
    }

    public void setPressao(int pressao) {
        this.pressao = pressao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdClima() {
        return idClima;
    }

    public void setIdClima(int idClima) {
        this.idClima = idClima;
    }
}