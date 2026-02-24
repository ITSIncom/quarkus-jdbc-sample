package it.itsincom.demos;

public class Aula {
    private int id;

    public Aula(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Aula{" +
               "id=" + id +
               '}';
    }
}
