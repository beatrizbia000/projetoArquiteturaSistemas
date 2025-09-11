package atividade03;

public class Contrato implements Pagamento {
    private float salarioBase;

    public Contrato(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    // regra de cálculo do salário
    private float salario() {
        // aqui você pode colocar cálculos reais (descontos, bônus etc.)
        return salarioBase;
    }

    @Override
    public float getSaldo() {
        return salario();
    }
}