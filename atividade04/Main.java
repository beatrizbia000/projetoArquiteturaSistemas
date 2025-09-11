package atividade04;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica retangulo = new Retangulo(5, 10);
        FormaGeometrica quadrado  = new Quadrado(4);
        FormaGeometrica circulo = new Circulo(3);

        System.out.println("Área do Retângulo: " + retangulo.calculaArea());
        System.out.println("Área do Quadrado : " + quadrado.calculaArea());
        System.out.println("Área do Círculo  : " + circulo.calculaArea());

    }
}
