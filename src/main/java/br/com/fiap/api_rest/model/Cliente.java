package br.com.fiap.api_rest.model;

import br.com.fiap.api_rest.enums.Categoria;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private Date dataNascimento;
    private String email;
    private String senha;
    private String cpf;
    private Categoria categoria;

    @ManyToMany
    @JoinColumn(name = "id_filial")
    private Filial filial;

    @ManyToMany
    @JoinTable(name = "grupo_cliente",
    joinColumns = @JoinColumn(name = "id_gruppo", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "id_cliente", referencedColumnName = "id"))
    private Grupo grupo;

    public Cliente() {
    }

    public Cliente(Long id, String nome, int idade, String email, String senha, String cpf, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.categoria = categoria;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}