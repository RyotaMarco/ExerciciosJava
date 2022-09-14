package Entities;

public class Entities {
    private String name;

    private String email;



    public Entities(int[] ocupacoes) {
        this.ocupacoes = ocupacoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entities(String name, String email) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    private int room;

    private int[] ocupacoes;

    public int[] getOcupacoes() {
        return ocupacoes;
    }

    public void setOcupacoes(int[] ocupacoes) {
        this.ocupacoes = ocupacoes;
    }
}
