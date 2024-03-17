package org.app.Entities;

public class Pessoa {
    private String _nome;
    private int _idade;

    public Pessoa(String nome, int idade) {
        this._nome = nome;
        this._idade = idade;
    }

    public int getIdade() {
        return this._idade;
    }

    public void setIdade(int idade) {
        this._idade = idade;
    }

    public String getNome() {
        return this._nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }
}
