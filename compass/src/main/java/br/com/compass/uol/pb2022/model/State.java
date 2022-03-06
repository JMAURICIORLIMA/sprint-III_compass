package br.com.compass.uol.pb2022.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String regiao;

    @Column(nullable = false)
    private Long populacao;

    @Column(nullable = false)
    private String capital;

    @Column(nullable = false)
    private Double area;

    @Column(nullable = false)
    private LocalDate dataDeFundacao;

    @Column(nullable = false)
    private Long tempoDesdeFundacao;

    public State() {  }

    public State(String nomeCidade, String regiao, Long populacao, String capital, Double area) {
        this.nome = nomeCidade;
        this.regiao = regiao;
        this.populacao = populacao;
        this.capital = capital;
        this.area = area;
    }

    public Long getId() {
        return id;
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

    public LocalDate getDataDeFundacao() {
        return dataDeFundacao;
    }

    public void setDataDeFundacao(LocalDate dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    public Long getTempoDesdeFundacao() {
        return tempoDesdeFundacao;
    }

    public void setTempoDesdeFundacao(Long tempoDesdeFundacao) {
        this.tempoDesdeFundacao = tempoDesdeFundacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(id, state.id) && Objects.equals(tempoDesdeFundacao, state.tempoDesdeFundacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tempoDesdeFundacao);
    }
}
