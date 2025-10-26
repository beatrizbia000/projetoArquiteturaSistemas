public class UDPChannel implements Channel {
    public void send(String message) {
        System.out.println("Enviando via UDP: " + message);
    }

    public void receive() {
        System.out.println("Recebendo dados via UDP");
    }
}
