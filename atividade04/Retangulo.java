package atividade04;

public class Retangulo implements FormaGeometrica {
    private int base;
    private int altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int calculaArea() {
        return base * altura;
    }

    // getters e setters, se necessário
    public int getBase()   { return base;   }
    public int getAltura() { return altura; }
}
