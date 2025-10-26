public class Main {
    public static void main(String[] args) {
        
        Teste1 t1 = new Teste1();
        Teste2 t2 = new Teste2();
        Teste3 t3 = new Teste3();

        System.out.println("Teste1 (UDP via getFactory):");
        t1.getMessage();
        
        System.out.println("\nTeste2 (TCP via getFactory):");
        t2.getMessage();
        
        System.out.println("\nTeste3 (UDP via instância direta):");
        t3.getMessage();
    }
}