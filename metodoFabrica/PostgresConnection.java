
public class PostgresConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Conectando ao banco PostgreSQL...");
    }

    @Override
    public String getType() {
        return "PostgreSQL";
    }
}
