
public class ConnectionFactory {

    public static Connection createConnection(String type) {

        if (type.equalsIgnoreCase("ORACLE")) {
            return new OracleConnection();
        }
        if (type.equalsIgnoreCase("POSTGRES")) {
            return new PostgresConnection();
        }
        if (type.equalsIgnoreCase("MYSQL")) {
            return new MySQLConnection();
        }

        return null;
    }
}
