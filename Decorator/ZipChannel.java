public class ZipChannel extends ChannelDecorator {
    public ZipChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("Compactando mensagem...");
        super.send(message);
    }

    @Override
    public void receive() {
        super.receive();
        System.out.println("Descompactando mensagem...");
    }
}
