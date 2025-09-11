package atividade04;

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public int calculaArea() {
        return (int) Math.round(Math.PI * raio * raio);
    }

    public double getRaio() {
        return raio;
    }
}
