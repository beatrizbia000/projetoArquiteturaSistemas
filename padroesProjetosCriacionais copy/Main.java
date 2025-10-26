
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa.Builder()
                .nome("Ana")
                .idade(20)
                .cidade("São Paulo")
                .build();

        p1.mostrar();
    }
}