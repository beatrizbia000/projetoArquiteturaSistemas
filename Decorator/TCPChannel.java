public class TCPChannel implements Channel {
    public void send(String message) {
        System.out.println("Enviando via TCP: " + message);
    }

    public void receive() {
        System.out.println("Recebendo dados via TCP");
    }
}
