public class Estagio implements Pagamento {
    private float valorBolsa;

    public Estagio(float valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    // regra de cálculo da bolsa
    private float bolsa() {
        return valorBolsa;
    }

    @Override
    public float getSaldo() {
        return bolsa();
    }
}
