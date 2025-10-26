package AtividadeSingleton;

public class DBConn {
    private static DBConn instancia;
        private DBConn() {
    }
        public static DBConn getInstancia() {
        if (instancia == null) {
            instancia = new DBConn();
        }
        return instancia;
    }
    
    public void connecta() {
        System.out.println("Conecta com o banco de dados!");
    }

    public static void main(String[] args) {
        DBConn db1 = DBConn.getInstancia();
        db1.connecta();

        DBConn db2 = DBConn.getInstancia();
        System.out.println(db1 == db2);
    }
}
