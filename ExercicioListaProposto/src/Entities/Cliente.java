package Entities;

public class Cliente {

    public int id;

    public String nome;

    public int idade;

    public double telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return
                "id=" + id +
                ", nome=" + nome +
                ", idade=" + idade +
                ", telefone=" + telefone;
    }

    public Cliente(int id, String nome, int idade, double telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;


    }
}
