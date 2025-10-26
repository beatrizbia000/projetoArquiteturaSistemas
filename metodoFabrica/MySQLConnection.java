
public class MySQLConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Conectando ao banco MySQL...");
    }

    @Override
    public String getType() {
        return "MySQL";
    }
}
