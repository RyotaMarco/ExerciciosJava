package Entities;

public class Entities {
    private String name;

    private double idade;

    public Entities(String name, double idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }
}
