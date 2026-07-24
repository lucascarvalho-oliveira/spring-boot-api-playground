package io.github.lucascarvalho_oliveira.SchoolSystem.model;

import io.github.lucascarvalho_oliveira.SchoolSystem.model.enums.TipoPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    @NotBlank
    private String telefone;

    @NotNull
    private LocalDate dataNacimento;

    private TipoPessoa tipoPessoa;

    protected Pessoa(){}

    public Pessoa(String nome, String telefone, LocalDate dataNacimento, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNacimento = dataNacimento;
        this.tipoPessoa = tipoPessoa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
