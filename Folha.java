public class Folha {
    private float saldo;

    public void calcular(Pagamento p) {
        this.saldo = p.getSaldo();
    }

    public float getSaldo() {
        return saldo;
    }
}