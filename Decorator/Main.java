public class Main {
    public static void main(String[] args) {
        Channel canal = new TCPChannel();
        canal = new LogChannel(new ZipChannel(new BufferChannel(canal)));

        canal.send("Olá, mundo!");
        canal.receive();
    }
}
