package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;
    @ManyToMany
    private List<Cliente> clientes;


}
