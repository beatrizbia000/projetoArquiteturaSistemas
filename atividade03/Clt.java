package atividade03;
 
public class Clt implements Pagamento {
    private float salarioBase;
    private float beneficios; // ex.: vale-refeição, plano de saúde etc.

    public Clt(float salarioBase, float beneficios) {
        this.salarioBase = salarioBase;
        this.beneficios  = beneficios;
    }

    // regra de cálculo específica para CLT
    private float salarioComBeneficios() {
        return salarioBase + beneficios;
    }

    @Override
    public float getSaldo() {
        return salarioComBeneficios();
    }
}
