package atividade04;

public class Quadrado implements FormaGeometrica {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calculaArea() {
        return lado * lado;
    }

    public int getLado() {
        return lado;
    }
}

