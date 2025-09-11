public class Main {
    public static void main(String[] args) {
        Pagamento contrato = new Contrato(5000f);
        Pagamento estagio  = new Estagio(1500f);

        Folha folha = new Folha();

        folha.calcular(contrato);
        System.out.println("Salário Contrato: R$ " + folha.getSaldo());

        folha.calcular(estagio);
        System.out.println("Bolsa Estágio: R$ " + folha.getSaldo());
    }
}