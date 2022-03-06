package br.com.compass.uol.pb2022.dto;

import br.com.compass.uol.pb2022.model.State;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;

public class StateDto implements Serializable {
    private Long id;
    private String nome;
    private String regiao;
    private Long populacao;
    private String capital;
    private Double area;
    private String dataDeFundacao;
    private Long tempoDesdeFundacao;

    public StateDto() {  }

    public StateDto(State state) {
        this.id = state.getId();
        this.nome = state.getNome();
        this.regiao = state.getRegiao();
        this.populacao = state.getPopulacao();
        this.capital = state.getCapital();
        this.area = state.getArea();
        this.dataDeFundacao = String.valueOf(state.getDataDeFundacao());
        this.tempoDesdeFundacao = state.getTempoDesdeFundacao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getDataDeFundacao() {
        return dataDeFundacao;
    }

    public void setDataDeFundacao(String dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    public Long getTempoDesdeFundacao() {
        return tempoDesdeFundacao;
    }

    public void setTempoDesdeFundacao(Long tempoDesdeFundacao) {
        this.tempoDesdeFundacao = tempoDesdeFundacao;
    }
}
