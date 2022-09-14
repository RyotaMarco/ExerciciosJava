package Entities;

public class Entities {
    private String name;

    private double nota1;

    private double nota2;

    private double media;

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Entities(String name, double nota1, double nota2, double media) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = this.media;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
