package Entities;

public class Entities {

    private char genero;

    private double altura;

    public Entities(double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
