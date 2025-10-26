
public class Main {
    public static void main(String[] args) {

        Connection oracle = ConnectionFactory.createConnection("ORACLE");
        Connection postgres = ConnectionFactory.createConnection("POSTGRES");
        Connection mysql = ConnectionFactory.createConnection("MYSQL");

        oracle.connect();
        System.out.println("Tipo: " + oracle.getType());
        System.out.println();

        postgres.connect();
        System.out.println("Tipo: " + postgres.getType());
        System.out.println();

        mysql.connect();
        System.out.println("Tipo: " + mysql.getType());
    }
}
